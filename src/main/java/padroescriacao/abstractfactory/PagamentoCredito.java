package padroescriacao.abstractfactory;

public class PagamentoCredito implements Pagamento{

    @Override
    public String pagar() {
        return "Pagamento Cartão de Crédito";
    }
}
