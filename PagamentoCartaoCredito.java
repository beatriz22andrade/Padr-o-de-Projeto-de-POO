public class PagamentoCartaoCredito implements IPagamentoStrategy {
    public void pagar(double valor){
        System.out.println("Pagamento de R$" + valor + "com o cartão de crédito");
    }
}
