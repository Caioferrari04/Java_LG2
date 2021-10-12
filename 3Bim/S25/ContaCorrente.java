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

    

}
