public class Municao {
    private int calibre;
    private int quantidade;
    private String tipo;

    public Municao(int calibre, int quantidade, String tipo) {
        this.calibre = calibre;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public int getCalibre() {
        return this.calibre;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public String getTipo() {
        return this.tipo;
    }

}
