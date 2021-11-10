import java.time.LocalDate;

public abstract class Conta {
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;

    public Conta() {
        numero = 0;
        dataAbertura = LocalDate.now();
        saldo = 0.0;
        tarifa = 0.0;
        correntista = new Correntista();
    }
    public Conta(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.tarifa = tarifa;
        this.correntista = correntista;
        correntista.addConta(this);
    }

    public void sacar(double valor){
        if(saldo >= valor) 
            saldo = saldo - valor;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public abstract double calcularTarifa();

    public int getNumero() {
        return this.numero;
    }

    public LocalDate getDataAbertura() {
        return this.dataAbertura;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getTarifa() {
        return this.tarifa;
    }

    public Correntista getCorrentista() {
        return this.correntista;
    }
}
