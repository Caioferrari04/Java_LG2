import java.time.LocalDate;

public class ContaPoupanca extends Conta {
    private LocalDate aniversario;

    public ContaPoupanca() {
        super();
        aniversario = LocalDate.now();
    }

    public LocalDate getAniversario() {
        return this.aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public double calcularTarifa(){
        return 3;
    }
}
