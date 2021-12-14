import java.util.Arrays;

public class VetorGenerico<T> implements IVetorGenerico<T> {
    private T[] elementos;
    private int tamanho;

    public VetorGenerico(int capacidade){
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    @Override
    public void adicionar(T elemento) {
        aumentarCapacidade();

        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
        
    }

    @Override
    public void adicionar(int posicao, T elemento) {
        tamanhoInvalido(posicao);
        aumentarCapacidade();

        for(int i = this.tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
        
    }

    @Override
    public void remover(int posicao) {
        tamanhoInvalido(posicao);

        for(int i = posicao; i < tamanho-1; i++){
            this.elementos[i] =  this.elementos[i+1];
        }
        this.tamanho--;
        
    }

    @Override
    public T buscar(int posicao) {
        return this.elementos[posicao];
    }

    @Override
    public int buscar(T elemento) {
        for(int i = 0; i < this.tamanho;i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString(){
        return Arrays.toString(this.elementos);
    }

    private void aumentarCapacidade(){
        if(this.tamanho == this.elementos.length) {
            T[] elementosNovo = (T[]) new Object[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++){
                elementosNovo[i] = elementos[i];
            }
            this.elementos = elementosNovo;
        }
    }

    private void tamanhoInvalido(int posicao){ /*Se houver um erro, o programa será interrompido, portanto não há necessidade de um retorno*/
        if(!(posicao >= 0 && posicao < this.tamanho)){
            throw new RuntimeException("Argumento inválido");
        }
    }

    public boolean contem(T elemento){
        return buscar(elemento) != -1;
    }
}
