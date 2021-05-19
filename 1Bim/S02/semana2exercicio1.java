
import java.util.Scanner;

class semana2exercicio1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        float[] notas = new float[4];
        float result = 0;

        for(int i = 0; i<4;i++){
            System.out.printf("Entre com o item [%d]: ",i+1);
            notas[i] = scan.nextFloat();
            result = notas[i] + result;
        }
        result = result/4;
        System.out.printf("Nota final: %3.2f",result);

        scan.close();
    }
}