import java.time.LocalDate;

public class ContaSalario extends Conta {
    private Empresa empresa;

    public ContaSalario() {
        super();
        empresa = new Empresa();
    }
    public ContaSalario(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, Empresa empresa) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public double calcularTarifa(){
        return 0;
    }
}
