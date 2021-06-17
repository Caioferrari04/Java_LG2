import java.util.Scanner;

public class TarefaS0701 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite quantos numeros ira digitar:");
        int quantidadeIndex = scan.nextInt();

        int[] vetorInicial = new int[quantidadeIndex];

        for(int i = 0; i<quantidadeIndex;i++){
            System.out.printf("Digite o [%d] numero: ",i+1);
            vetorInicial[i] = scan.nextInt();
        }

        System.out.println(somaIterativa(vetorInicial));
        System.out.println(somaRecursiva(vetorInicial,quantidadeIndex));

        scan.close();
    }

    public static int somaIterativa(int[] numeros) {
        int contador = numeros.length;
        int total = 0;

        for(int i = 0; i<contador; i++){
            total = total + numeros[i];
        }

        return total;
    }

    public static int somaRecursiva(int[] numeros, int n) {
        if(n == 0|| n == 1){
            return numeros[0];
        }
        return numeros[n-1] + somaRecursiva(numeros, n-1);
    }
  
    
  }