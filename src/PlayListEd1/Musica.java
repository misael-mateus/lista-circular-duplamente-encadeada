package PlayListEd1;

import java.util.Objects;

public class Musica implements Comparable<Musica> {

    private String nomeMusica;
    private String nomeCantor;

    public Musica(String nomeMusica, String nomeCantor) {
        this.nomeCantor=nomeCantor;
        this.nomeMusica=nomeMusica;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getNomeCantor() {
        return nomeCantor;
    }

    public void setNomeCantor(String nomeCantor) {
        this.nomeCantor = nomeCantor;
    }


    @Override
    public String toString() {
        return nomeMusica + "  ["+nomeCantor+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musica musica = (Musica) o;
        return Objects.equals(nomeMusica, musica.nomeMusica) && Objects.equals(nomeCantor, musica.nomeCantor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeMusica, nomeCantor);
    }

    @Override
    public int compareTo(Musica mus) {
        if (this.nomeMusica.compareTo(mus.getNomeMusica()) > 0) {
            return 1;
        }
        if (this.nomeMusica.compareTo(mus.getNomeMusica()) < 0) {
            return -1;
        }
        if (this.nomeCantor.compareTo(mus.getNomeCantor()) > 0) {
            return 1;
        }
        if (this.nomeCantor.compareTo(mus.getNomeCantor()) < 0) {
            return -1;
        }
        return 0;
    }
}
