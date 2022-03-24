package PlayListEd1;

public class ListaLigada<T extends Comparable<T>> {
    protected NoDuplo<T> inicio, atual;


    public boolean isEmpty() {
        return this.inicio == null;
    }

    public void inserir(T elemento) {
        NoDuplo<T> novo = new NoDuplo<>(elemento);

        if (this.isEmpty()) {
            this.inicio = novo;
            novo.setProximo(novo);
            novo.setAnterior(novo);

        } else {
            NoDuplo<T> tmp = inicio;

            while (tmp.getProximo() != inicio && novo.getInformacaoPrincipal().compareTo(tmp.getInformacaoPrincipal()) > 0) {
                tmp = tmp.getProximo();
            }
            if (tmp.getInformacaoPrincipal().compareTo(novo.getInformacaoPrincipal()) > 0) {
                //insere antes de tmp// {
                novo.setAnterior(tmp.getAnterior());
                novo.setProximo(tmp);
                tmp.getAnterior().setProximo(novo);
                tmp.setAnterior(novo);
                if (tmp == this.inicio) {
                    this.inicio = novo;
                }
            } else {
                novo.setAnterior(tmp);
                novo.setProximo(tmp.getProximo());
                tmp.setProximo(novo);
                novo.getProximo().setAnterior(novo);
            }
        }
    }

    public void mostrarLista() {
        NoDuplo<T> tmp;
        tmp = inicio;

        do {
            //    System.out.println (tmp.getInformacaoPrincipal ().toString () );
            System.out.println("elemento da lista = " + tmp.getInformacaoPrincipal());
            tmp = tmp.getProximo();
        } while (tmp != inicio && tmp != null);

    }

    public void remover(T valor) {

        NoDuplo<T> n = this.inicio;

        while (n.getProximo() != this.inicio && n.getInformacaoPrincipal().compareTo(valor) != 0) {
            n = n.getProximo();
        }
        if (n.getInformacaoPrincipal().compareTo(valor) == 0) {
            if (n == this.inicio) {
                this.inicio.getAnterior().setProximo(this.inicio.getProximo());
                this.inicio.getProximo().setAnterior(this.inicio.getAnterior());
                this.inicio = this.inicio.getProximo();
            } else {
                n.getAnterior().setProximo(n.getProximo());
                n.getProximo().setAnterior(n.getAnterior());
            }
        }
    }

    public T busca(T elemento) {

        var n = this.inicio;
        while (n.getProximo() != inicio && !n.getInformacaoPrincipal().equals(elemento)) {
            n = n.getProximo();
        }
        if (n.getInformacaoPrincipal().equals(elemento)){
            this.atual = n;
            return n.getInformacaoPrincipal();
        }
        return null;

    }

    public NoDuplo<T> getInicio() {
        return inicio;
    }

    @Override
    public String toString() {
        return "ListaCircular{" +
                "inicio=" + inicio +
                '}';
    }
}