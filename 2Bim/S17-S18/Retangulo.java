public class Retangulo {
    private int base;
    private int altura;
    private int resultadoArea;
    private int resultadoPerimetro;

    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }

    public int getAltura() {
        return this.altura;
    }
    
    public void setBase(int base) {
        this.base = base > 0 ? base : 0;
    }

    public void setAltura(int altura) {
        this.altura = altura > 0 ? altura : 0;
    }

    public void setResultadoArea(int num){
        this.resultadoArea = num > 0 ? num : 0;
    }

    public void setResultadoPerimetro(int num){
        this.resultadoPerimetro = num > 0 ? num : 0;
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
