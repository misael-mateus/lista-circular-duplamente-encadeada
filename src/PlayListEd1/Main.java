package PlayListEd1;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        PlayList playList = new PlayList();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String aux;
        String[] musicaLida;
        int numMusicas = Integer.parseInt(bf.readLine());

        for (int i = 0; i < numMusicas; i++) {
            musicaLida = bf.readLine().split("--");
            playList.adicionarMusica(musicaLida[0], musicaLida[1]);
        }

        musicaLida = bf.readLine().split("--");
        int opcao = Integer.parseInt(bf.readLine());

        switch (opcao) {
            case 1: {
                playList.posicionarMusica(musicaLida[0], musicaLida[1]);
                aux= bf.readLine();
                System.out.println();

                while (!aux.equals("0")) {

                    if (aux.equals(">>")) {
                        playList.proximaMusica();
                    } else {
                        playList.musicaAnterior();
                    }
                    System.out.println(aux+" "+ playList.atual.getInformacaoPrincipal());
                    aux = bf.readLine();
                }
                break;
            }
            case 2: {
                playList.removerMusica(musicaLida[0], musicaLida[1]);
                break;
            }
            default:
                break;
        }
        playList.mostrarLista();
    }
}
