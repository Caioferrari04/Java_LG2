public class Aluno {
    private String prontuario;
    private String nome;

    public Aluno(){
        this.prontuario = "";
        this.nome = "";
    }

    public Aluno(String prontuario, String nome){
        setProntuario(prontuario);
        setNome(nome);
    }
    public String getProntuario() {
        return this.prontuario;
    }

    public void setProntuario(String prontuario) {
        if(prontuario.length() == 8 && prontuario.toLowerCase().startsWith("sp"))
            this.prontuario = prontuario;
        else
            throw new IllegalArgumentException("Prontuário não pode ter mais que 8 caracteres e deve conter SP no começo!");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome.length() > 5 && nome.length() < 100 && nome.replaceAll("\\s+","").length() > 5 )
            this.nome =  nome;
        else
            throw new IllegalArgumentException("Nome deve ter mais que 5 caracteres e não pode ser apenas espaços");
    }
}
