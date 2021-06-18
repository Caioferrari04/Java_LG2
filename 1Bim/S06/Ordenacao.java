public class Ordenacao {
    public static int[] bubbleSort(int[] vetor) {
        vetor = VetorUtil.copiar(vetor);
    
        int auxiliar;
        
        for(int i = 0; i < vetor.length; i++) {
          for(int j = 0; j < vetor.length - 1; j++) {
            if(vetor[j] > vetor[j+1]) {
              auxiliar = vetor[j];
              vetor[j] = vetor[j+1];
              vetor[j+1] = auxiliar;
            }
          }
        }
        return vetor;
      }
      public static int[] InsertionSort(int[] vetor) {
          vetor = VetorUtil.copiar(vetor);
  
        for (int j = 1; j < vetor.length; j++) {  
            int chave = vetor[j];  
            int i = j-1;  
            while ( (i > -1) && ( vetor[i] > chave ) ) {  
                vetor [i+1] = vetor[i];  
                i--;  
            }  
            vetor[i+1] = chave;  
        }
        return vetor;
    }
}
