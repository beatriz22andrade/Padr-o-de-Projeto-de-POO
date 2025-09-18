/* Essa classes faz associação entre o produto e 
 * uma quantidade.
 */

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto(){
        return this.produto;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getSubtotal(){
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return produto.getNome() + " x" + quantidade + " = R$ " + getSubtotal();
    }
}
