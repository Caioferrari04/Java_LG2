public class Main {
    public static void main(String[] args) {
        try{
            Aluno caio = new Aluno();
            caio.setNome("Caio Silva Ferrari");
            caio.setProntuario("SP304489"); //Prontuário de verdade: SP3044891 :)
            System.out.println(caio.getNome());
            System.out.println(caio.getProntuario()); //Irá dar certo, nada de errado
        } catch(IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
        try{
            Aluno teste = new Aluno("AlunoConstrutor","sp444444"); //Irá falhar, prontuário inválido
            System.out.println(teste.getNome()); 
            System.out.println(teste.getProntuario()); 
        } catch(IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
        try{
            Aluno monoel = new Aluno();
            monoel.setNome("Monoel");
            monoel.setProntuario("sp9999sp"); //deve retornar exceção, prontuário inválido
            System.out.println(monoel.getNome());
            System.out.println(monoel.getProntuario()); 
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            Aluno teste2 = new Aluno();
            teste2.setNome("         "); //Deve retornar exceção, nome inválido
            teste2.setProntuario("sp230042");
            System.out.println(teste2.getNome()); 
            System.out.println(teste2.getProntuario());
        } catch(IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }
}
