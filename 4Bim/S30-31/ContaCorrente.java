import java.time.LocalDate;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente() {
        super();
        limite = 0.0;
    }

    public ContaCorrente(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, double limite) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double calcularTarifa() {
        return tarifa * 1.5;
    }

    @Override
    public void sacar(double valor){
        if(saldo >= valor && limite >= saldo)
            saldo = saldo - valor;
    }

}
