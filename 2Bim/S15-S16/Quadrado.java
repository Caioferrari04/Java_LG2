public class Quadrado {
    public int lado;

    public Quadrado(int lado){
      this.lado = lado;
    }
  
    public int calcularArea() {
      return lado * lado;
    }
  
    public int calcularPerimetro() {
      return 4 * lado;
    }
  }