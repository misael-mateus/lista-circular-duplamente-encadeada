package PlayListEd1;

public class PlayList extends ListaLigada<Musica> {

    public void adicionarMusica(String nomeMusica, String nomeCantor) {
        Musica musica = new Musica(nomeMusica, nomeCantor);
        super.inserir(musica);
    }

    public void removerMusica(String nomeMusica, String nomeCantor) {
        Musica musica = new Musica(nomeMusica, nomeCantor);
        super.remover(musica);
    }

    public void caminharSobreAsMusicas(){


//        while (!aux.equals("0")) {
//            n = n.getProximo();
//            if (aux.equals(">>")) {
//                System.out.println(">> " + n.getProximo().getInformacaoPrincipal());
//            } else {
//                System.out.println("<< " + n.getAnterior().getInformacaoPrincipal());
//            }
//            aux = bf.readLine();
//        }
    }

    public void musicaAnterior(){
        this.atual = atual.getAnterior();
    }

    public void proximaMusica(){
        this.atual = atual.getProximo();
    }

    public Musica posicionarMusica(String nomeMusica, String nomeCantor) {
        Musica musicaAtual = new Musica(nomeMusica, nomeCantor);
        return this.busca(musicaAtual);
    }


    @Override
    public String toString() {
        return "inicio=" + inicio;
    }


}

