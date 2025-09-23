package concret_strategy;/*
 *  Concret Strategy que implementa a estratégia de pagamento por cartão de crédito.
 *  Faz parte do Padrão de Projeto Strategy
 */

import strategy.IPagamentoStrategy;

public class PagamentoCartaoCredito implements IPagamentoStrategy {
    public void pagar(double valor){
        System.out.printf("Pagamento de R$ %.2f realizado com Cartão de Crédito.%n", valor);
    }
}
