import java.util.Scanner;

class tarefa_s02_01 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a quantidade de bimestres:");

        int cont = scan.nextInt();
        float[] notas = new float[cont];
        float result = 0;

        for(int i = 0; i<cont;i++){
            System.out.printf("Entre com o item [%d]: \n",i+1);
            notas[i] = scan.nextFloat();
            result = notas[i] + result;
        }
        result = result/4;
        System.out.printf("Nota final: %3.2f\n",result);

        if (result > 6){ // O
            System.out.println("Você foi aprovado! Parabéns!");
        }
        if (result >= 5 && result <= 6) { // de
            System.out.println("Você está em recuperação, se esforce.");
        } 
        if (result >=0 && result < 5) { // io java. Tem alguma coisa parecida com elif?
            System.out.println("Você foi reprovado.");
        }
        scan.close();
    }
}