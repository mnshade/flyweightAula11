import java.util.ArrayList;
import java.util.List;

public class AngryBirds {
    private List<Bird> birds = new ArrayList<>();

    public void inscreverPartida(String nomeBird, String corBird, String tipoBird, String nomeFaseSelecao, String dificuldadeSelecao) {
        Selecao selecao = SelecaoFactory.getSelecao(nomeFaseSelecao, dificuldadeSelecao);
        Bird bird = new Bird(nomeBird,corBird,tipoBird, selecao);
        birds.add(bird);
    }

    public List<String> obterBirds() {
        List<String> listaBirds = new ArrayList<String>();
        for (Bird bird : this.birds) {
            listaBirds.add(bird.obterBird());
        }
        return listaBirds;
    }
}
