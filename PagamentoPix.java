/* 
 *  Concret Strategy que implementa a estratégia de pagamento por Pix.
 *  Faz parte do Padrão de Projeto Strategy
 */

public class PagamentoPix implements IPagamentoStrategy{
    public void pagar(double valor){
        System.out.println("Pagamento de R$" + valor + "no pix");
    }
}
