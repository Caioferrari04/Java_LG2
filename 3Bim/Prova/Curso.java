import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nome;
    private String sigla;
    private List<Projeto> projetos;

    public Curso() {
        nome = "";
        sigla = "";
        projetos = new ArrayList<>();
    }
    public Curso(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        projetos = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public String getSigla() {
        return this.sigla;
    }

    public List<Projeto> getProjetos() {
        return this.projetos;
    }

    public int getNumeroProjetos() {
        return this.projetos.size();
    }

    public List<Projeto> getProjetosAtivos() {
        List<Projeto> projetosTemp = new ArrayList<>();
        for (Projeto projeto : projetos) {
             if(projeto.isAtivo())
                projetosTemp.add(projeto);
        }
        return projetosTemp;
    }

    public int getNumeroProjetosAtivos(){
        return getProjetosAtivos().size();
    }

    public void adicionarProjeto(Projeto projeto) {
        if(!this.projetos.contains(projeto)) {
            this.projetos.add(projeto);
        } 
        else
            throw new RuntimeException("Projeto já está cadastrado no curso!");  
    }
}
