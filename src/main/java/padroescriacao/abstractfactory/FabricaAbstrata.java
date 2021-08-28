package padroescriacao.abstractfactory;

public interface FabricaAbstrata {

    Pagamento createPagamento();
    Comprovante createComprovante();
}
