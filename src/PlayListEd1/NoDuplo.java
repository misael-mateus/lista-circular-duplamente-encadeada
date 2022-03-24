package PlayListEd1;

public class NoDuplo<T> {

    private T informacaoPrincipal;
    private NoDuplo<T> proximo;
    private NoDuplo<T> anterior;

    public NoDuplo(T informacaoPrincipal , NoDuplo<T> proximo , NoDuplo<T> anterior ) {
        this.informacaoPrincipal = informacaoPrincipal;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public NoDuplo(T informacaoPrincipal) {
        this(informacaoPrincipal,null,null);
    }


    public T getInformacaoPrincipal () {
        return informacaoPrincipal;
    }

    public void setInformacaoPrincipal ( T informacaoPrincipal ) {
        this.informacaoPrincipal = informacaoPrincipal;
    }

    public NoDuplo<T> getProximo () {
        return proximo;
    }

    public void setProximo ( NoDuplo<T> proximo ) {
        this.proximo = proximo;
    }

    public NoDuplo<T> getAnterior () {
        return anterior;
    }

    public void setAnterior ( NoDuplo<T> anterior ) {
        this.anterior = anterior;
    }

    @Override
    public String toString () {
        return "NoDuplo{" +
                "informacaoPrincipal=" + informacaoPrincipal +
                ", proximo=" + proximo +
                ", anterior=" + anterior +
                '}';
    }

}