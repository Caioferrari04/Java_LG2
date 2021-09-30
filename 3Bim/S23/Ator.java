import java.util.List;
import java.util.ArrayList;

public class Ator {
    private String nome;
    private List<Papel> papeis;

    public Ator(String nome) {
        this.nome = nome;
        this.papeis = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Papel> getPapeis() {
        return this.papeis;
    }

    public void setPapeis(List<Papel> papeis) {
        this.papeis = papeis;
    }

    public void addPapeis(Papel papel){
        this.papeis.add(papel);
    }
}
