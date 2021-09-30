import java.util.List;
import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private List<Funcionario> subordinados;

    public Funcionario(String nome) {
        this.nome = nome;
        this.subordinados = new ArrayList<>();
    }

    public void addSubordinado(Funcionario subordinado){
        if(subordinados.size() < 5){
            this.subordinados.add(subordinado);
        }
    }

    public boolean isChefe(){
        return subordinados.size() > 0;
    }

    public Integer getQuantidadeSubordinados(){
       return subordinados.size();
    }

    public List<Funcionario> getSubordinados(){
        return subordinados;
    }

    public String getNome(){
        return nome;
    }
}
