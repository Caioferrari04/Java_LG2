public class Professor extends Pessoa {
    private String formacao;

    public Professor() {
        super();
        formacao = "";
    }

    public Professor(String prontuario, String nome, String formacao) {
        super(prontuario, nome);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return this.formacao;
    }
}
