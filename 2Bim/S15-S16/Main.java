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

        Conta c1 = new Conta(1,0.0,50);

        Conta c2 = new Conta(2,100.00,100);

        c1.depositar(120.00);
        c2.depositar(50.00);
        
        //Irá dar errado, ultrapassou o limite
        if(c1.sacar(110.00)) System.out.println("Operação realizada com sucesso!"); else System.out.println("ERRO!");

        //Irá dar errado, ultrapassou o limite
        if(c2.sacar(200.00)) System.out.println("Operação realizada com sucesso!"); else System.out.println("ERRO!"); 

        //Irá dar certo, não ultrapassou o limite
        if(c2.sacar(100.00)) System.out.println("Operação realizada com sucesso!"); else System.out.println("ERRO!");
        
        //Irá dar errado, ultrapassou o saldo
        if(c2.sacar(100.00)) System.out.println("Operação realizada com sucesso!"); else System.out.println("ERRO!");
        
        //Irá dar certo, não ultrapassou o limite    
        if(c1.sacar(50.00)) System.out.println("Operação realizada com sucesso!"); else System.out.println("ERRO!");

        //Irá dar errado, ultrapassou o saldo
        if(c1.sacar(90.00)) System.out.println("Operação realizada com sucesso!"); else System.out.println("ERRO!");

        /*~~~~~~Tentando usar ternárias, sucesso!~~~~~~*/

        //Irá dar certo, não ultrapassou nenhum limitante
        System.out.println((c2.transferir(c1, 20.00) ? "Operação realizada com sucesso!" : "ERRO!"));

        //Irá dar errado, ultrapassou o saldo
        System.out.println((c2.transferir(c1, 40.00) ? "Operação realizada com sucesso!" : "ERRO!"));

        //Irá dar errado, ultrapassou ambos limitantes
        System.out.println((c2.transferir(c1, 320.00) ? "Operação realizada com sucesso!" : "ERRO!"));

        //Irá dar certo, não ultrapassou o limite nem saldo
        System.out.println((c1.transferir(c2, 50.00) ? "Operação realizada com sucesso!" : "ERRO!"));

        //Irá dar errado, ultrapassou o saldo
        System.out.println((c1.transferir(c2, 50.00) ? "Operação realizada com sucesso!" : "ERRO!"));

        //Irá dar errado, ultrapassou o limite 
        System.out.println((c1.transferir(c2, 100.00) ? "Operação realizada com sucesso!" : "ERRO!")); 

    }
  }