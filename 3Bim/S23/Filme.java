import java.util.List;
import java.util.ArrayList;

public class Filme {
    private String titulo;
    private int ano;
    private List<Papel> papeis;

    public Filme(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.papeis = new ArrayList<>();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Papel> getPapeis() {
        return this.papeis;
    }

    public void addPapeis(Papel papel){
        this.papeis.add(papel);
    }

    public void setPapeis(List<Papel> papeis) {
        this.papeis = papeis;
    }
}
