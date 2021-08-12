public class Circulo {
    private int raio;
    private double resultadoArea;
    private double resultadoPerimetro;

    public Circulo(int raio){
        this.raio = raio;
    }
    public int getRaio() {
        return this.raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public void setResultadoArea(double num){
        this.resultadoArea = num > 0 ? num : 0;
    }

    public void setResultadoPerimetro(double num){
        this.resultadoPerimetro = num > 0 ? num : 0;
    }

    public void calcularArea(){
        setResultadoArea(Math.PI * raio*raio);
    }

    public void calcularPerimetro() {
        setResultadoPerimetro(2*Math.PI *raio);
    }
    
    public String getResultados(){
        return "A área do círculo vale: " + resultadoArea + "\nO perimetro do círculo vale: " + resultadoPerimetro;
    }
}
