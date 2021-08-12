public class Quadrado {
    private int lado;

    public Quadrado(int lado){
      	this.lado = lado;
    }

    public int getLado() {
      	return this.lado;
    }

    public void setLado(int lado) {
      	this.lado = lado > 0 ? lado : 0;
    }

    public int calcularArea() {
      	return lado * lado;
    }
  
    public int calcularPerimetro() {
      	return 4 * lado;
    }
}