package padroescriacao.abstractfactory;

public class PagamentoBoleto implements Pagamento{

    @Override
    public String pagar() {
        return "Pagamento Boleto";
    }
}
