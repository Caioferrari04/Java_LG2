public class Main{
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("func1");
        Funcionario funcionario2 = new Funcionario("func2");
        Funcionario funcionario3 = new Funcionario("func3");
        Funcionario funcionario4 = new Funcionario("func4");
        Funcionario funcionario5 = new Funcionario("func5");
        Funcionario funcionario6 = new Funcionario("func6");
        Funcionario funcionario7 = new Funcionario("func7");

        funcionario.addSubordinado(funcionario2);
        funcionario.addSubordinado(funcionario3);
        funcionario.addSubordinado(funcionario4);
        funcionario.addSubordinado(funcionario5);
        funcionario.addSubordinado(funcionario6);
        funcionario.addSubordinado(funcionario7); //Não irá ser adicionado

        System.out.println(funcionario.getQuantidadeSubordinados());
        System.out.println(funcionario2.getQuantidadeSubordinados()); //Irão retornar 0
        System.out.println(funcionario3.getQuantidadeSubordinados());
        System.out.println(funcionario4.getQuantidadeSubordinados());
        System.out.println(funcionario5.getQuantidadeSubordinados());
        System.out.println(funcionario6.getQuantidadeSubordinados());

        System.out.println(funcionario.isChefe());
        System.out.println(funcionario2.isChefe()); //Irão retornar false
        System.out.println(funcionario3.isChefe());
        System.out.println(funcionario4.isChefe());
        System.out.println(funcionario5.isChefe());
        System.out.println(funcionario6.isChefe());

        for(Funcionario subordinado : funcionario.getSubordinados()){
            System.out.println(subordinado.getNome());
        }
    }
}