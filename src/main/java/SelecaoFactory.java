import java.util.HashMap;
import java.util.Map;

public class SelecaoFactory {
    private static Map<String, Selecao> selecaos = new HashMap<>();

    public static Selecao getSelecao(String nomeFase, String dificuldade) {
        Selecao selecao = selecaos.get(nomeFase);
        if (selecao == null) {
            selecao = new Selecao(nomeFase, dificuldade);
            selecaos.put(nomeFase, selecao);
        }
        return selecao;
    }

    public static int getTotalFases() {
        return selecaos.size();
    }

}
