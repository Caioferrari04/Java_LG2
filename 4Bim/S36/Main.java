public class Main {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(10);

        vetor.adicionar("echo 'Hello world'"); //0
        vetor.adicionar("PRINT 'Hello, world!'"); //1
        vetor.adicionar("#include int main(void) { puts('Hello, world!'); }"); //2
        vetor.adicionar("using System; class Program { public static void Main(string[] args) { Console.WriteLine('Hello, world!'); } }"); //3
        vetor.adicionar(1, "System.out.println('Hello world!')"); //4
        vetor.adicionar(2, "System.out.println('000000')"); //5
        vetor.adicionar(3, "System.out.println('000000')"); //6
        vetor.adicionar(4, "System.out.println('000000')"); //7
        vetor.adicionar("#include int main(void) { puts('!'); }"); //8
        vetor.adicionar("+[>+]"); //9, não rode isso em BF.
        vetor.adicionar(1);
        vetor.adicionar(0.2);

        System.out.println(vetor.toString());
        System.out.println(vetor.tamanho());

        vetor.remover(9);

        System.out.println(vetor.tamanho());

        vetor.remover(8);

        System.out.println(vetor.tamanho());
        System.out.println(vetor.buscar("echo 'Hello world'"));
        System.out.println(vetor.buscar(3));

        VetorObject vetor1 =  new VetorObject(10);
        System.out.println(vetor1);

        for(int i = 0; i < 10; i++){
            vetor1.adicionar(i);
        }

        System.out.println(vetor1);

        VetorGenerico<String> vetorGen = new VetorGenerico<String>(2);

        vetorGen.adicionar("Olá mundo");
        vetorGen.adicionar("Hello world");
        vetorGen.adicionar("Hello world!");
        System.out.println(vetorGen.toString());

        VetorGenerico<Integer> vGenerico = new VetorGenerico<Integer>(2);

        vGenerico.adicionar(1);
        vGenerico.adicionar(2);
        vGenerico.adicionar(3);
        System.out.println(vGenerico.toString());

        System.out.println(vGenerico.contem(1));
        System.out.println(vGenerico.contem(4));

        System.out.println(vetor1.contem(1));
        System.out.println(vetor1.contem(11));
    }
}