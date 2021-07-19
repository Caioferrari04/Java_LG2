import java.io.PrintStream;

public class Retangulo {
    public int base;
    public int altura;
    private int resultadoArea;
    private int resultadoPerimetro;

    public void setResultadoArea(int num){
        this.resultadoArea = num;
    }
    public void setResultadoPerimetro(int num){
        this.resultadoPerimetro = num;
    }
    public void calcularArea(){
        setResultadoArea(base*altura);
    }

    public void calcularPerimetro() {
        setResultadoPerimetro(2*(base+altura));
    }
    public PrintStream getResultados(){
        return System.out.printf("\nA área do retângulo vale: %d\nO perimetro do retângulo vale: %d", this.resultadoArea, this.resultadoPerimetro);
    }
    
}
