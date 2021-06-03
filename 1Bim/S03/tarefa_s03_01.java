import java.util.Scanner;

public class tarefa_s03_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        float max = 0,min = 1;
        
        System.out.println("Insira o contador: ");
        cont = scan.nextInt();

        float[] notas = new float[cont];

        for (int i = 0; i<cont;i++) {
            System.out.println("Insira um número: ");
            notas[i] = scan.nextInt();
        }
        min = notas[0];
        for (int i = 0; i<cont;i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
            if (notas[i] < min) {
                min = notas[i];
            }
        }
        System.out.println("Maior número: " + max);
        System.out.println("Menor número: " + min);
        scan.close();
    }
}
