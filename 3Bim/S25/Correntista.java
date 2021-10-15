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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return this.contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public double totalTarifa(){
        double total = 0;
        for(Conta conta : this.contas){
            total = total + conta.calcularTarifa();
        }
        return total;
    }
}
