public class Aluno extends Pessoa {
    private boolean matriculado;

    public Aluno() {
        super();
        matriculado = false;
    }

    public Aluno(String prontuario, String nome, boolean matriculado) {
        super(prontuario,nome);
        this.matriculado = matriculado;
    }

    public boolean isMatriculado() {
        var nome2 = nome;
        return this.matriculado;
    }
}
