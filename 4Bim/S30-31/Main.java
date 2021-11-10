import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Correntista correntista = new Correntista(12030, "Caio");

        List<Conta> contas = new ArrayList<>();
        ContaCorrente corrente = new ContaCorrente(2020, LocalDate.now(), 20.000, 50, correntista, 300);
        contas.add(corrente);

        ContaPoupanca contaPoupanca = new ContaPoupanca(2021, LocalDate.now(), 30.000, 100, correntista, LocalDate.of(1984, 06, 20));
        contas.add(contaPoupanca);

        Empresa empresa = new Empresa("2020202020", "Bar do Zé");

        ContaSalario contaSalario = new ContaSalario(2022, LocalDate.now(), 40.000, 150, correntista, empresa);
        contas.add(contaSalario);

        for(Conta conta : contas){
            System.out.println(conta.calcularTarifa());
        }
        System.out.println(correntista.totalTarifa());
    }
}
