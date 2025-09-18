/* 
 *  Concret Strategy que implementa a estratégia de pagamento por cartão de crédito.
 *  Faz parte do Padrão de Projeto Strategy
 */

public class PagamentoCartaoCredito implements IPagamentoStrategy {
    public void pagar(double valor){
        System.out.println("Pagamento de R$" + valor + "com o cartão de crédito");
    }
}
