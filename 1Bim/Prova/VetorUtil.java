public class VetorUtil {
    public static int[] juntarVetor(int[]vetor1,int[]vetor2) {
        int[] vetorFinal = new int[vetor1.length+vetor2.length];
        int contador = 0;
        for(int i=0;i<vetor1.length;i++){
            vetorFinal[i] = vetor1[i];
        }
        for(int i=vetor1.length;i<vetor2.length+vetor1.length;i++){
            vetorFinal[i] = vetor2[contador];
            contador += 1;
        }
        return vetorFinal;
    }
    public static int[] substituirPares(int[] ultimoVetor){
        for(int i=0;i<ultimoVetor.length;i++){
            if (ultimoVetor[i]%2==0){
                ultimoVetor[i] = 1;
            }else{
                ultimoVetor[i] = -1;
            }
        }
        return ultimoVetor;
    }
}