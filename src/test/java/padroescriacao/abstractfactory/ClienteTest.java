package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void deveRealizarPagamentoBoleto() {
        FabricaAbstrata fabrica = new FabricaBoleto();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Pagamento Boleto", cliente.realizarPagamento());
    }

    @Test
    void deveRealizarPagamentoCartaoCredito() {
        FabricaAbstrata fabrica = new FabricaCredito();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Pagamento Cartão de Crédito", cliente.realizarPagamento());
    }

    @Test
    void deveEmitirComprovantePagamentoBoleto() {
        FabricaAbstrata fabrica = new FabricaBoleto();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Comprovante Pagamento Boleto", cliente.emitirComprovante());
    }

    @Test
    void deveEmitirComprovantePagamentoCartaoCredito() {
        FabricaAbstrata fabrica = new FabricaCredito();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Comprovante Pagamento Cartão Crédito", cliente.emitirComprovante());

    }
}
