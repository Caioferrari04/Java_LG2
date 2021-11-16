public class Main {
    public static void main(String[] args) {
        Tanque lorraine40t = new Lorraine40t();
        Panther panther = new Panther();

        Municao apcbc75 = new Municao(75, 100, "APCBC");
        Municao apcbc100 = new Municao(100, 100, "APCBC");

        System.out.println("-----------Lorraine 40t-----------");

        System.out.println(lorraine40t.adicionarMunicao(apcbc100) ? "Munição adicionada com sucesso!" : "Munição não foi carregada!"); 
        System.out.println(lorraine40t.regarregarCanhao() ? "Munição recarregada com sucesso!" : "Munição não foi recarregada!");
        System.out.println(lorraine40t.atirarCanhao() ? "BOOM!" : "Canhão não atirou!");
        System.out.println(lorraine40t.ligarMotor() ? "Fugir!" : "Rezar!");

        System.out.println("-----------Panther-----------");

        System.out.println(panther.adicionarMunicao(apcbc75) ? "Munição adicionada com sucesso!" : "Munição não foi carregada!"); 
        System.out.println(panther.regarregarCanhao() ? "Munição recarregada com sucesso!" : "Munição não foi recarregada!");
        System.out.println(panther.atirarCanhao() ? "BOOM!" : "Canhão não atirou!");
        System.out.println(panther.ligarMotor() ? "Fugir!" : "Rezar!");

    }
}
