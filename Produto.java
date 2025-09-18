/**
 * Representa um produto na loja, contendo nome, preço e 
 * quantidade em estoque.
 */

public class Produto {
    private String nome; //private: acesso dentro da classe
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getEstoque(){
        return this.estoque;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

}

