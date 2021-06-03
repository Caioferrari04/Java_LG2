class Main {
    public static void main(String[] args) {
        String nome = args[0];
        double[] notas = new double[3];


        for(int i=0;i<3;i++){
            notas[i] = Double.parseDouble(args[i+1]);
        }  
        double media = Estatistica.calcularMedia(notas);
    

        double maior = Estatistica.maior(notas);
        double menor = Estatistica.menor(notas,maior);
        exibirNota(media,nome,maior,menor);
  
    }
  
    public static void exibirNota(double nota,String nome,double maior, double menor){
        System.out.println(String.format("Nome: %s. \nNota: %.2f\nMaior nota: %.2f\nMenor nota: %.2f", nome,nota,maior,menor));
    }
  
  }