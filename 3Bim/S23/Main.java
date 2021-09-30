public class Main {
    public static void main(String[] args) {
        Ator ator = new Ator("ator1");
        Ator ator2 = new Ator("ator2");
        Ator ator3 = new Ator("ator3");
        Ator ator4 = new Ator("ator4");
        Ator ator5 = new Ator("ator5");

        Filme filme1 = new Filme("filme1", 2021);
        Filme filme2 = new Filme("filme2", 2021);

        Papel papel1 = new Papel("papel1", ator, filme1);
        Papel papel2 = new Papel("papel2", ator2, filme2);
        Papel papel3 = new Papel("papel3", ator3, filme1);
        Papel papel4 = new Papel("papel4", ator4, filme2);
        Papel papel5 = new Papel("papel5", ator, filme2);
        Papel papel6 = new Papel("papel6", ator5, filme2);

        ator.addPapeis(papel1);
        ator2.addPapeis(papel2);
        ator3.addPapeis(papel3);
        ator4.addPapeis(papel4);
        ator.addPapeis(papel5);
        ator5.addPapeis(papel6);

        filme1.addPapeis(papel1);
        filme2.addPapeis(papel2);
        filme1.addPapeis(papel3);
        filme2.addPapeis(papel4);
        filme2.addPapeis(papel5);
        filme2.addPapeis(papel6);

        for(Papel papel : filme1.getPapeis()){
            System.out.println(papel.getAtor().getNome()+ " atuou em " + papel.getFilme().getTitulo() + " como " + papel.getNomePapel());
        }
        for(Papel papel : filme2.getPapeis()){
            System.out.println(papel.getAtor().getNome()+ " atuou em " + papel.getFilme().getTitulo() + " como " + papel.getNomePapel());
        }
    }
}