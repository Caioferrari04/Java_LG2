class Estatistica {
    public static double calcularMedia(double[] valores) {
      double soma = 0.0;
      for(double valor : valores) {
        soma += valor;
      }
      return soma / valores.length;
    }

    public static double maior(double[] valores) {
      double temp = 0;
      for(double valor : valores){
          if(valor > temp) {
            temp = valor;
          }
      }

      return temp;
    }
    public static double menor(double[] valores,double maior) {
      double temp = maior;

      for(double valor : valores){
          if(valor < temp) {
            temp = valor;
          }
      }

      return temp;
    }
  }