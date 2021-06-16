class Main {
    public static void main(String[] args) {
      int[] numeros = {4, 7, 8, 2, 11, 3, 9, 1};
      int[] numerosOrdenados = Ordenacao.InsertionSort(numeros);
      int[] bubbleSort = Ordenacao.bubbleSort(numeros);
  
      VetorUtil.imprimirVetor(numeros);
      VetorUtil.imprimirVetor(numerosOrdenados);
      VetorUtil.imprimirVetor(bubbleSort);
    }
}
  

