import java.io.PrintStream;

public class Conta {
    public int codigo;
    public double saldo;
    public double limite;

    public Conta(int codigo, double saldo, double limite){
      this.codigo = codigo;
      this.saldo = saldo;
      this.limite = limite;
    }
  
    public boolean depositar(double valor) {
      saldo = saldo + valor;
      return true;
    }
  
    public boolean sacar(double valor) {
      if(limite >= valor && saldo >= valor) {
        saldo = saldo - valor;
        return true;
      }
      return false;
    }
  
    public boolean transferir(Conta conta, double valor) {
      if(limite >= valor && saldo >= valor) {
        saldo = saldo - valor;
        conta.saldo = conta.saldo + valor;
        return true;
      }
      return false;
    }

    public PrintStream consultarSaldo(){
        return System.out.printf("Conta de código [%d] possui R$%.2f",codigo,saldo);
    }
  }