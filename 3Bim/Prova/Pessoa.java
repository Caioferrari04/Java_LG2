public class Pessoa {
    protected String prontuario;
    protected String nome;

    public Pessoa() {
        prontuario = "";
        nome = "";
    }

    public Pessoa(String prontuario, String nome) {
        this.prontuario = prontuario;
        this.nome = nome;
    }

    public String getProntuario() {
        return this.prontuario;
    }

    public String getNome() {
        return this.nome;
    }

}
