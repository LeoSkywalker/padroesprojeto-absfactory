package padroescriacao.abstractfactory;

public class FabricaCredito implements FabricaAbstrata{

    @Override
    public Pagamento createPagamento() {
        return new PagamentoCredito();
    }

    @Override
    public Comprovante createComprovante() {
        return new ComprovanteCredito();
    }
}
