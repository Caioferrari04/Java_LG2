public class Papel {
    private String nomePapel;
    private Ator ator;
    private Filme filme;

    public Papel(String nomePapel, Ator ator, Filme filme) {
        this.nomePapel = nomePapel;
        this.ator = ator;
        this.filme = filme;
    }
    public String getNomePapel() {
        return this.nomePapel;
    }

    public void setNomePapel(String nomePapel) {
        this.nomePapel = nomePapel;
    }

    public Ator getAtor() {
		return this.ator;
	}

    public void setAtor(Ator ator) {
		this.ator = ator;
	}

    public Filme getFilme() {
        return this.filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }


}
