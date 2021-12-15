public class ListaDuplaEncadeada<T> implements IListaDuplaEncadeada<T> { //Aqui poderia ser implementado a IListaEncadeada, certo? São iguais.
    private NoDuplo<T> primeiro;
    private NoDuplo<T> ultimo;
    private int tamanho;

    public ListaDuplaEncadeada() {
        primeiro = new NoDuplo<T>(null, null, null);
        ultimo = new NoDuplo<T>(primeiro, null, null);
        primeiro.setProximo(ultimo);
        tamanho = 0;
    }

    @Override
    public void adicionarInicio(T elemento) {
        adicionarEntre(elemento, primeiro, primeiro.getProximo());
    }

    @Override
    public void adicionarFim(T elemento) {
        adicionarEntre(elemento, ultimo.getAnterior(), ultimo);
    }

    @Override
    public void removerInicio() {
        if(vazia()) throw new RuntimeException("Lista vazia");
        remover(primeiro.getProximo());
    }

    @Override
    public void removerFim() {
        if(vazia()) throw new RuntimeException("Lista vazia");
        remover(ultimo.getAnterior());
        
    }

    @Override
    public T primeiro() {
        return primeiro.getProximo().getElemento();
    }

    @Override
    public T ultimo() {
        return ultimo.getAnterior().getElemento();
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
        NoDuplo<T> elementoBusc = primeiro.getProximo();
        for(int i = 0; i <= tamanho; i++){
            if(posicao == i)
                break;
            else
                elementoBusc = elementoBusc.getProximo();
        }
        return elementoBusc.getElemento();
    }

    @Override
    public void adicionar(int posicao, T elemento) {
        NoDuplo<T> prox = primeiro.getProximo();
        for(int i = 0; i <= tamanho; i++){
            if(posicao == i){
                prox.setProximo(new NoDuplo<T>(prox.getAnterior(), prox.getElemento(), prox.getProximo()));
                prox.setElemento(elemento);
                tamanho++;
                break;
            }
            else {
                prox = prox.getProximo();
            }
        }
    }

    private void adicionarEntre(T elemento, NoDuplo<T> anterior, NoDuplo<T> proximo) {
        NoDuplo<T> nDuplo = new NoDuplo<T>(anterior, elemento, proximo);
        anterior.setProximo(nDuplo);
        proximo.setAnterior(nDuplo);
        tamanho++;
    }

    private void remover(NoDuplo<T> nDuplo){
        NoDuplo<T> ant = nDuplo.getAnterior();
        NoDuplo<T> prox = nDuplo.getProximo();
        ant.setProximo(prox);
        prox.setAnterior(ant);
        tamanho--;
    }
    
}
