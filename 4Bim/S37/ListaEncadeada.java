public class ListaEncadeada<T> implements IListaEncadeada<T> {
    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho;

    public ListaEncadeada() {
        primeiro = null;
        ultimo = null;
        tamanho = 0;
    }

    @Override
    public void adicionarInicio(T elemento) {
        No<T> no = new No<T>(elemento, primeiro);
        primeiro = no;
        if(vazia()) ultimo = primeiro;
        tamanho++;
    }

    @Override
    public void adicionarFim(T elemento) {
        No<T> no = new No<T>(elemento, null);
        if(vazia())
            primeiro = no;
        else 
            ultimo.setProximo(no);
        ultimo = no;
        tamanho++;
    }

    @Override
    public void removerInicio() {
        if(vazia()) throw new RuntimeException("Lista está vazia");
        primeiro = primeiro.getProximo();
        tamanho--;
        if(vazia()) ultimo = null;
    }

    @Override
    public void removerFim() {
        if(vazia()) throw new RuntimeException("Lista está vazia");
        No<T> anterior = primeiro;
        for(int i = 0; i < tamanho; i++){
            anterior = anterior.getProximo();
        }
        anterior.setProximo(null);
        ultimo = anterior;
        tamanho--;
        if(vazia()){
            primeiro = null;
            ultimo = null;
        }
        
    }

    @Override
    public T primeiro() {
        if(vazia()) throw new RuntimeException("Lista está vazia");
        return primeiro.getElemento();
    }

    @Override
    public T ultimo() {
        if(vazia()) throw new RuntimeException("Lista está vazia");
        return ultimo.getElemento();
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean vazia() {
        return tamanho == 0;
    }

    @Override
    public T buscar(int posicao) {
        No<T> elementoBusc = new No<T>(primeiro.getElemento(), primeiro.getProximo());
        for(int i = 0; i < tamanho; i++){
            if(posicao == i)
                break;
            else
                elementoBusc = elementoBusc.getProximo();
        }
        return elementoBusc.getElemento();
    }

    @Override
    public void adicionar(int posicao, T elemento) {
        No<T> prox = primeiro;
        for(int i = 0; i < tamanho; i++){
            if(posicao == i){
                prox.setProximo(new No<T>(prox.getElemento(), prox.getProximo()));
                prox.setElemento(elemento);
                tamanho++;
                break;
            }
            else {
                prox = prox.getProximo();
            }
        }
    }
}
