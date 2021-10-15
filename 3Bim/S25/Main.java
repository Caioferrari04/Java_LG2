import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Correntista correntista = new Correntista(12030, "Caio");

        List<Conta> contas = new ArrayList<>();
        ContaCorrente corrente = new ContaCorrente();
        corrente.setNumero(1);
        corrente.setCorrentista(correntista);
        contas.add(corrente);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNumero(2);
        contaPoupanca.setCorrentista(correntista);
        contas.add(contaPoupanca);

        Empresa empresa = new Empresa();
        empresa.setCnpj("202020");
        empresa.setNome("Microsoft");

        ContaSalario contaSalario = new ContaSalario();
        contaSalario.setEmpresa(empresa);
        contaSalario.setNumero(3);
        contaSalario.setCorrentista(correntista);
        contas.add(contaSalario);

        correntista.setContas(contas);

        for(Conta conta : contas){
            System.out.println(conta.calcularTarifa());
        }
        System.out.println(correntista.totalTarifa());
    }
}
