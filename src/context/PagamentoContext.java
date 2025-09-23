package context;
import models.Pedido;
import strategy.IPagamentoStrategy;


/**
 * Classe de Contexto (Context) do Padrão de Projeto Strategy.
 * Esta classe mantém uma referência a um objeto Strategy e delega
 * a execução do algoritmo de pagamento. O SistemaPedidos interage
 * com o contexto para processar o pagamento.
 */

public class PagamentoContext {
    private IPagamentoStrategy strategy;

    public void setStrategy(IPagamentoStrategy strategy) {
        this.strategy = strategy;
    }

    public void processarPagamento(Pedido pedido) {
        double total = pedido.calcularTotal();
        strategy.pagar(total);
    }
}
