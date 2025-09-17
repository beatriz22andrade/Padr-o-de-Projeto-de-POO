import java.time.LocalDate;

public class SistemaPedidos {
    public static void main(String[] args) {
        
        Produto teclado = new Produto("Fortrek Teclado Gamer BLACK EAGLE", 79.10, 10);
        Produto mousePad = new Produto("Mouse Pad Preto", 8.90, 10);
        Produto mouse = new Produto("Mouse Dell sem fio - WM118", 69.00, 10);

        ClientePF cliente1 = new ClientePF("Marcelo", "marcelo22@gmail", "123.456.789-00");
        ClientePJ cliente2 = new ClientePJ("Empresa X", "contato@empresax.com", "12.345.678/0001-99");

        Pedido pedido1 = new Pedido(1, LocalDate.now(), "Aberto", cliente1);
        pedido1.adicionarItem(teclado, 1);
        pedido1.adicionarItem(mousePad, 2);

        Pedido pedido2 = new Pedido(2, LocalDate.now(), "Aberto", cliente2);
        pedido2.adicionarItem(mouse, 3);

        System.out.println(pedido1);
        System.out.println(pedido2);

        System.out.printf("Total do pedido1: R$ %.2f%n", pedido1.calcularTotal());
        System.out.printf("Total do pedido2: R$ %.2f%n", pedido2.calcularTotal());
    }
}
