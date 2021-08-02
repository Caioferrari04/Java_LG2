public class Retangulo {
    public int base;
    public int altura;
    private int resultadoArea;
    private int resultadoPerimetro;

    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

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
    public String getResultados(){
        return "A área do retângulo vale: "+ resultadoArea + "\nO perimetro do retângulo vale: " + resultadoPerimetro;
    }
    
}
