import java.util.Scanner;

public class tarefa_s03_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        float depositoMax = 0,depositoMin = 1;
        
        System.out.println("Insira o contador: ");
        cont = scan.nextInt();

        float[] notas = new float[cont];

        for (int i = 0; i<cont;i++) {
            System.out.println("Insira um número: ");
            notas[i] = scan.nextInt();
        }
        depositoMin = notas[0];
        for (int i = 0; i<cont;i++) {
            if (notas[i] > depositoMax) {
                depositoMax = notas[i];
            }
            if (notas[i] < depositoMin) {
                depositoMin = notas[i];
            }
        }
        System.out.println("Maior número: " + depositoMax);
        System.out.println("Menor número: " + depositoMin);
        scan.close();
    }
}
