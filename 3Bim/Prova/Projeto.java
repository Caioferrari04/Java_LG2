import java.util.List;
import java.util.ArrayList;

public class Projeto {
    private String titulo;
    private boolean ativo;
    private Curso curso;
    private List<Pessoa> participantes;

    public Projeto() {
        titulo = "";
        ativo = false;
        curso = new Curso();
        participantes = new ArrayList<>();
    }

    public Projeto(String titulo, boolean ativo, Curso curso) {
        this.titulo = titulo;
        this.ativo = ativo;
        this.curso = curso;
        curso.adicionarProjeto(this);
        participantes = new ArrayList<>();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public List<Pessoa> getParticipantes() {
        return this.participantes;
    }

    public int getNumeroParticipantes(){
        return this.participantes.size();
    }

    public void adicionarParticipante(Pessoa participante) {
        if(!this.participantes.contains(participante)){
            if(this.ativo)
                this.participantes.add(participante);
            else
                throw new RuntimeException("Não é possível adicionar participante em um projeto não ativo");
        }
        else 
            throw new RuntimeException("Participante já está presente no projeto!");
    }
}
