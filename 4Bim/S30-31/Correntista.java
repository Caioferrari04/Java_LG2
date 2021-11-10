import java.util.List;
import java.util.ArrayList;

public class Correntista {
    private int codigo;
    private String nome;
    private List<Conta> contas;

    public Correntista() {
        codigo = 0;
        nome = "";
        contas = new ArrayList<>();
    }

    public Correntista(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public List<Conta> getContas() {
        return this.contas;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public double totalTarifa(){
        double total = 0;
        for(Conta conta : this.contas){
            total = total + conta.calcularTarifa();
        }
        return total;
    }
}
