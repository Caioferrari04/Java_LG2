import java.util.Arrays;

public class VetorString implements VetorInterface {
    private String[] elementos;
    private int tamanho;

    public VetorString(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    @Override
    public void adicionar(String elemento) {
        aumentarCapacidade();

        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    @Override
    public void adicionar(int posicao, String elemento) {
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
    public String buscar(int posicao) {

        return this.elementos[posicao];
    }

    @Override
    public int buscar(String elemento) {
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
            String[] elementosNovo = new String[this.elementos.length * 2];
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
}
