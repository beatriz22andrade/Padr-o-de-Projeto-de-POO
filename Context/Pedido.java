import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private int numero;
    private LocalDate data;
    private String status;
    private Cliente cliente; 
    private ArrayList<ItemPedido> itens;

    public Pedido(int numero, LocalDate data, String status, Cliente cliente){
        this.numero = numero;
        this.data = data;
        this.status = status;
        this.cliente = cliente;
        this.itens = new ArrayList<>(); 
    }

    public void adicionarItem(Produto produto, int quantidade){
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0;
        for(ItemPedido item : itens){
            total += item.getSubtotal();
        }
        return total;
    }

    public int getNumero(){
        return this.numero;
    }

    public LocalDate getDate(){
        return this.data;
    }

    public String getStatus(){
        return this.status;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setDate(LocalDate data){
        this.data = data;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String toString(){
        return "Pedido #" + numero + " - Cliente: " + cliente.getNome() + " - Total: R$ " + calcularTotal();
    }
}


//

public void RealixarPagamento(){


}




//
public  iPagamentos{
    boolean pagamentos = false;
    void  realizarpagamentos();

}


//