public class NoDuplo<T> {
    private NoDuplo<T> anterior;
    private T elemento;
    private NoDuplo<T> proximo;

    public NoDuplo(NoDuplo<T> ant, T elemento, NoDuplo<T> prox) {
        this.anterior = ant;
        this.elemento = elemento;
        this.proximo = prox;
    }

    public NoDuplo<T> getAnterior() {
        return this.anterior;
    }

    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    public T getElemento() {
        return this.elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NoDuplo<T> getProximo() {
        return this.proximo;
    }

    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }
}
