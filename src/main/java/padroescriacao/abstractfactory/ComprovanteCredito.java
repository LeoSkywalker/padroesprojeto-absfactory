package padroescriacao.abstractfactory;

public class ComprovanteCredito implements Comprovante{

    @Override
    public String emitir() {
        return "Comprovante Pagamento Cartão Crédito";
    }
}
