public class ContaSalario extends Conta {
    private Empresa empresa;

    public ContaSalario() {
        super();
        empresa = new Empresa();
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
