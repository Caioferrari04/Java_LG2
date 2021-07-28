class Main {
  public static void main(String[] args) {
    Conta c1 = new Conta();
    c1.codigo = 1;
    c1.saldo = 0.0;
    c1.limite = 50;

    Conta c2 = new Conta();
    c2.codigo = 2;
    c2.saldo = 100.00;
    c2.limite = 100;

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