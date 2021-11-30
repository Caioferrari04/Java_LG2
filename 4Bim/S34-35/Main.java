public class Main {
    public static void main(String[] args) {
        VetorString vetor = new VetorString(10);

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

        System.out.println(vetor.toString());
        System.out.println(vetor.tamanho());

        vetor.remover(9);

        System.out.println(vetor.tamanho());

        vetor.remover(8);

        System.out.println(vetor.tamanho());
        System.out.println(vetor.buscar("echo 'Hello world'"));
        System.out.println(vetor.buscar(3));

        VetorInt vetorInt = new VetorInt(5);
        vetorInt.adicionar(1);
        vetorInt.adicionar(2);
        vetorInt.adicionar(3);
        vetorInt.adicionar(4);
        vetorInt.adicionar(5);
        vetorInt.adicionar(6);
        vetorInt.adicionar(7);
        vetorInt.adicionar(2, 8);

        System.out.println(vetorInt.buscar(2));
        System.out.println(vetorInt.buscarElemento(7));
        vetorInt.remover(5);
        System.out.println(vetorInt.toString());
        System.out.println(vetorInt.tamanho());
    }
}