class Main {
    public static void main(String[] args) {

        Quadrado q1 = new Quadrado(5);
        System.out.println(q1.lado);
        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro());
    
        System.out.println("-----------");
    
        Quadrado q2 = new Quadrado(10);
        System.out.println(q2.lado);
        System.out.println(q2.calcularArea());
        System.out.println(q2.calcularPerimetro());

        System.out.println("-----------");

        Circulo circuloUm = new Circulo(3);
        circuloUm.calcularArea();
        circuloUm.calcularPerimetro();
        System.out.println(circuloUm.getResultados());

        System.out.println("-----------");

        Circulo circuloDois = new Circulo(6);
        circuloDois.calcularArea();
        circuloDois.calcularPerimetro();
        System.out.println(circuloDois.getResultados());

        System.out.println("-----------");

        Circulo circuloTres = new Circulo(9);
        circuloTres.calcularArea();
        circuloTres.calcularPerimetro();
        System.out.println(circuloTres.getResultados());

        System.out.println("-----------");

        Retangulo retanguloUm = new Retangulo(5,4);
        retanguloUm.calcularArea();
        retanguloUm.calcularPerimetro();
        System.out.println(retanguloUm.getResultados());

        System.out.println("-----------");

        Retangulo retanguloDois = new Retangulo(6,5);
        retanguloDois.calcularArea();
        retanguloDois.calcularPerimetro();
        System.out.println(retanguloDois.getResultados());

        System.out.println("-----------");

        Retangulo retanguloTres = new Retangulo(7,6);
        retanguloTres.calcularArea();
        retanguloTres.calcularPerimetro();
        System.out.println(retanguloTres.getResultados());
    }
  }