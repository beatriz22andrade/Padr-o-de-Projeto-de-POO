/* Classe que herda de cliente, que representa um cliente
 * Pessoa Física
 */

public class ClientePF extends Cliente {
    private String cpf;

    public ClientePF(String nome, String email, String cpf) {
        super(nome, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return super.toString() + " - CPF: " + cpf;
    }
}
