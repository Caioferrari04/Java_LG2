public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente() {
        super();
        limite = 0.0;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double calcularTarifa() {
        return 5;
    }

    @Override
    public void sacar(double valor){
        if(saldo >= valor && limite >= saldo)
            saldo = saldo - valor;
    }

}
