import java.io.PrintStream;

public class Circulo {
    public int raio;
    private double resultadoArea;
    private double resultadoPerimetro;
    
    public void calcularArea(){
        setResultadoArea(Math.PI * raio*raio);
    }

    public void calcularPerimetro() {
        setResultadoPerimetro(2*Math.PI *raio);
    }

    public void setResultadoArea(double num){
        this.resultadoArea = num;
    }
    public void setResultadoPerimetro(double num){
        this.resultadoPerimetro = num;
    }
    public PrintStream getResultados(){
        return System.out.printf("\nA área do círculo vale: %3.2f\nO perimetro do círculo vale: %3.2f", this.resultadoArea, this.resultadoPerimetro);
    }
}
