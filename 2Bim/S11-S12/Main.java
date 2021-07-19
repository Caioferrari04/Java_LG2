class Main {
    public static void main(String[] args) {
        // Cria um objeto (instância) da classe Quadrado
        Quadrado q1 = new Quadrado();
    
        // Atribuindo valor 5 para o atributo lado
        q1.lado = 5;
    
        System.out.println(q1.lado);
        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro());
    
        System.out.println("-----------");
    
        Quadrado q2 = new Quadrado();
        q2.lado = 10;
        System.out.println(q2.lado);
        System.out.println(q2.calcularArea());
        System.out.println(q2.calcularPerimetro());
        
        Circulo circuloUm = new Circulo();
        circuloUm.raio = 3;
        circuloUm.calcularArea();
        circuloUm.calcularPerimetro();
        circuloUm.getResultados();

        Circulo circuloDois = new Circulo();
        circuloDois.raio = 6;
        circuloDois.calcularArea();
        circuloDois.calcularPerimetro();
        circuloDois.getResultados();

        Circulo circuloTres = new Circulo();
        circuloTres.raio = 9;
        circuloTres.calcularArea();
        circuloTres.calcularPerimetro();
        circuloTres.getResultados();

        Retangulo retanguloUm = new Retangulo();
        retanguloUm.altura = 4;
        retanguloUm.base = 5;
        retanguloUm.calcularArea();
        retanguloUm.calcularPerimetro();
        retanguloUm.getResultados();

        Retangulo retanguloDois = new Retangulo();
        retanguloDois.altura = 5;
        retanguloDois.base = 6;
        retanguloDois.calcularArea();
        retanguloDois.calcularPerimetro();
        retanguloDois.getResultados();

        Retangulo retanguloTres = new Retangulo();
        retanguloTres.altura = 6;
        retanguloTres.base = 7;
        retanguloTres.calcularArea();
        retanguloTres.calcularPerimetro();
        retanguloTres.getResultados();
    }
  }