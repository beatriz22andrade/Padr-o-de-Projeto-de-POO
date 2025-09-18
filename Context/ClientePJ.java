/* Classe que herda de Cliente, que representa um cliente
 * Pessoas Jurídica
 */

public class ClientePJ extends Cliente {
    private String cnpj;

    public ClientePJ(String nome, String email, String cnpj) {
        super(nome, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String toString() {
        return super.toString() + " - CNPJ: " + cnpj;
    }
}
