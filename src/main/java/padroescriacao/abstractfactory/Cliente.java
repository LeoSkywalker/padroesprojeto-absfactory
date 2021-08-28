package padroescriacao.abstractfactory;

public class Cliente {

    private Pagamento pagamento;
    private Comprovante comprovante;

    public Cliente(FabricaAbstrata fabrica) {
        this.pagamento = fabrica.createPagamento();
        this.comprovante = fabrica.createComprovante();
    }

    public String realizarPagamento() {
        return this.pagamento.pagar();
    }

    public String emitirComprovante() {
        return this.comprovante.emitir();
    }
}
