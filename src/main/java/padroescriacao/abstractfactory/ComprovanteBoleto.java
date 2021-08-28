package padroescriacao.abstractfactory;

public class ComprovanteBoleto implements Comprovante{

    @Override
    public String emitir() {
        return "Comprovante Pagamento Boleto";
    }
}
