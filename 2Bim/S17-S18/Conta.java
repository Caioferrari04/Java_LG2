import java.io.PrintStream;

public class Conta {
    private int codigo;
    private double saldo;
    private double limite;
	
	public Conta(int codigo, double saldo, double limite){
		this.codigo = codigo;
		this.saldo = saldo;
		this.limite = limite;
    }

    public int getCodigo() {
      	return this.codigo;
    }

    public void setCodigo(int codigo) {
      	this.codigo = codigo > 0 ? codigo : 0;
    }

    public double getSaldo() {
      	return this.saldo;
    }

    public void setSaldo(double saldo) {
      	this.saldo = saldo > 0 ? saldo : 0;
    }

    public double getLimite() {
      	return this.limite;
    }

    public void setLimite(double limite) {
      	this.limite = limite > 0 ? limite : 0;
    }
  
    public boolean depositar(double valor) {
		setSaldo(saldo + valor);
      	return true;
    }
  
    public boolean sacar(double valor) {
		if(limite >= valor && saldo >= valor) {
			setSaldo(saldo - valor);
			return true;
		}
		return false;
    }
  
    public boolean transferir(Conta conta, double valor) {
		if(limite >= valor && saldo >= valor) {
			setSaldo(saldo - valor);
			conta.setSaldo(conta.saldo + valor);
			return true;
		}
		return false;
    }

    public PrintStream consultarSaldo(){
        return System.out.printf("Conta de código [%d] possui R$%.2f",codigo,saldo);
    }
  }