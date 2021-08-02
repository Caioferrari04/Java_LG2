public class Circulo {
    public int raio;
    private double resultadoArea;
    private double resultadoPerimetro;

    public Circulo(int raio){
        this.raio = raio;
    }
    
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
    public String getResultados(){
        return "A área do círculo vale: " + resultadoArea + "\nO perimetro do círculo vale: " + resultadoPerimetro;
    }
}
