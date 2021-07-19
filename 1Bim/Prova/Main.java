import java.util.Scanner;

//Identificação: Caio Silva Ferrari, SP3044891
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o tamanho do vetor 1: ");
        int numeroIndexo = scan.nextInt();
        int[] vetorUm = new int[numeroIndexo];

        System.out.println("Insira o tamanho do vetor 2: ");
        numeroIndexo = scan.nextInt();
        int[] vetorDois = new int[numeroIndexo];

        for(int i=0;i<vetorUm.length;i++){
            System.out.printf("\nInsira o %d numero do vetor 1: ",i+1);
            vetorUm[i] = scan.nextInt();
        }
        for(int i=0;i<vetorDois.length;i++){
            System.out.printf("\nInsira o %d numero do vetor 2: ",i+1);
            vetorDois[i] = scan.nextInt();
        }
        int[] vetorJunto = new int[vetorUm.length+vetorDois.length];
        vetorJunto = VetorUtil.juntarVetor(vetorUm, vetorDois);
        for(int i=0;i<vetorUm.length+vetorDois.length;i++)
            System.out.println(vetorJunto[i]);
        vetorJunto = VetorUtil.substituirPares(vetorJunto);
        for(int i=0;i<vetorUm.length+vetorDois.length;i++)
            System.out.println(vetorJunto[i]);
        scan.close();
    }
}