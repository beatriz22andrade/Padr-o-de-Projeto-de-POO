package concret_strategy;/*
 *  Concret Strategy que implementa a estratégia de pagamento por Pix.
 *  Faz parte do Padrão de Projeto Strategy
 */

import strategy.IPagamentoStrategy;

public class PagamentoPix implements IPagamentoStrategy {
    public void pagar(double valor){
        System.out.printf("Pagamento de R$ %.2f realizado com Pix.%n", valor);
    }
}
