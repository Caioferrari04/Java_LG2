import java.util.Scanner;
import java.lang.Math;

public class tarefa_s03_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0, depositoMax = 0,depositoMin = 1;
        
        System.out.println("Insira o contador: ");
        cont = scan.nextInt();

        int[] notas = new int[cont];

        for (int i = 0; i<cont;i++) {
            System.out.println("Insira um número: ");
            notas[i] = scan.nextInt();
        }
        for (int i = 0; i<cont-1;i++) {
            depositoMax = Math.max(notas[i], notas[i+1]);
            if (notas[i] < depositoMin) {
                depositoMin = notas[i];
            }
        }
        System.out.println("Maior número: " + depositoMax);
        System.out.println("Menor número: " + depositoMin);
        scan.close();
    }
}
