package padroescriacao.abstractfactory;

public class FabricaBoleto implements FabricaAbstrata{

    @Override
    public Pagamento createPagamento() {
        return new PagamentoBoleto();
    }

    @Override
    public Comprovante createComprovante() {
        return new ComprovanteBoleto();
    }
}
