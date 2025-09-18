import java.time.LocalDate;

/**
 * Classe principal que simula a execução de um sistema de pedidos.
 * Ela demonstra a criação de produtos, clientes e pedidos, além de
 * processar os pagamentos utilizando o Padrão de Projeto Strategy.
 */

public class SistemaPedidos {
    public static void main(String[] args) {

        /* Instanciando os produtos disponíveis */
        Produto teclado = new Produto("Fortrek Teclado Gamer BLACK EAGLE", 79.10, 10);
        Produto mousePad = new Produto("Mouse Pad Preto", 8.90, 10);
        Produto mouse = new Produto("Mouse Dell sem fio - WM118", 69.00, 10);

        /* Instanciando os clientes */
        ClientePF cliente1 = new ClientePF("Marcelo", "marcelo22@gmail", "123.456.789-00");
        ClientePJ cliente2 = new ClientePJ("Empresa X", "contato@empresax.com", "12.345.678/0001-99");

        /* Criando pedidos 
         * Criando o pedido do cliente PF*/
        Pedido pedido1 = new Pedido(1, LocalDate.now(), "Aberto", cliente1);
        pedido1.adicionarItem(teclado, 1);
        pedido1.adicionarItem(mousePad, 2);

        /*  Criando o pedido do cliente PJ */
        Pedido pedido2 = new Pedido(2, LocalDate.now(), "Aberto", cliente2);
        pedido2.adicionarItem(mouse, 3);

        System.out.println(pedido1);
        System.out.println(pedido2);

        /* Exibindo o total de cada pedido */
        System.out.printf("Total do pedido1: R$ %.2f%n", pedido1.calcularTotal());
        System.out.printf("Total do pedido2: R$ %.2f%n", pedido2.calcularTotal());

        System.out.println("\n--- Processando Pagamentos ---");

        /* Instanciando o Context que gerencia a forma de pagamento escolhida */
        PagamentoContext pagamentoContext = new PagamentoContext();

        /* Define a estratégia */
        pagamentoContext.setStrategy(new PagamentoCartaoCredito());
        System.out.print("Pedido 1: ");
        pagamentoContext.processarPagamento(pedido1);
        pedido1.setStatus("Pago");

        pagamentoContext.setStrategy(new PagamentoPix());
        System.out.print("Pedido 2: ");
        pagamentoContext.processarPagamento(pedido2);
        pedido2.setStatus("Pago");
        
        System.out.println("\n--- Status Final dos Pedidos ---");
        System.out.println("Status do Pedido 1: " + pedido1.getStatus());
        System.out.println("Status do Pedido 2: " + pedido2.getStatus());
    }
}
