/*
 *  A inferface do Strategy, definimos o que deve ter nas diferentes Concret Strategies 
 *  As formas de pagamento devem seguir o padrão estabelecido
 * 
 *  As formas de pagamento podem ser trocas sem que ocorra problemas
 */

public interface IPagamentoStrategy {
    void pagar(double valor);
}
