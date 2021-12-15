public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<String>();
        lista.adicionarInicio("Olá mundo!");
        lista.adicionarFim("Tchau mundo!");
        lista.adicionarInicio("Hello world!");
        lista.adicionarFim("Bye world!");

        for(int i = 0; i < lista.tamanho(); i++){
            System.out.println(lista.buscar(i));
        }

        System.out.println("--------------------------------");

        System.out.println(lista.primeiro());
        System.out.println(lista.ultimo());

        System.out.println("--------------------------------");

        lista.adicionar(lista.tamanho()-1, "yay");
        for(int i = 0; i < lista.tamanho(); i++){
            System.out.println(lista.buscar(i));
        }

        System.out.println("--------------------------------");

        System.out.println(lista.primeiro());
        System.out.println(lista.ultimo());

        ListaDuplaEncadeada<Integer> listaDupla = new ListaDuplaEncadeada<Integer>();

        listaDupla.adicionarFim(1);
        listaDupla.adicionarInicio(2);
        listaDupla.adicionarFim(3);
        listaDupla.adicionarInicio(4);

        System.out.println("--------------------------------");

        System.out.println(listaDupla.primeiro());
        System.out.println(listaDupla.ultimo());

        System.out.println("---------------------------------");

        for(int i = 0; i < listaDupla.tamanho(); i++){
            System.out.println(listaDupla.buscar(i));
        }

        System.out.println("---------------------------------");

        listaDupla.adicionar(0, 5);
        listaDupla.adicionar(listaDupla.tamanho()-1, 6);

        for(int i = 0; i < listaDupla.tamanho(); i++){
            System.out.println(listaDupla.buscar(i));
        }
    }
}