import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AngryBirdsTest {
    @Test
    void deveRetornarAlunos() {
        AngryBirds angryBirds = new AngryBirds();
        angryBirds.inscreverPartida("Red", "Vermelho", "Unico", "Embate do Red", "Fácil");
        angryBirds.inscreverPartida("Chuck", "Amarelo", "Explosivo", "Desafio do Chuck", "Mediano");
        angryBirds.inscreverPartida("Matilda", "Branco", "Oviparo", "Caos da Matilda", "Difícil");

        List<String> listaBirds = Arrays.asList(
                "Bird{Nome: 'Red', Cor: 'Vermelho', Tipo: 'Unico', Nome da Fase: 'Embate do Red', Dificuldade: 'Fácil'}",
                "Bird{Nome: 'Chuck', Cor: 'Amarelo', Tipo: 'Explosivo', Nome da Fase: 'Desafio do Chuck', Dificuldade: 'Mediano'}",
                "Bird{Nome: 'Matilda', Cor: 'Branco', Tipo: 'Oviparo', Nome da Fase: 'Caos da Matilda', Dificuldade: 'Difícil'}");

        assertEquals(listaBirds, angryBirds.obterBirds());

    }

    @Test
    void deveRetornarTotalModelosDeCarro() {
        AngryBirds angryBirds = new AngryBirds();
        angryBirds.inscreverPartida("Red", "Vermelho", "Unico", "Embate do Red", "Fácil");
        angryBirds.inscreverPartida("Chuck", "Amarelo", "Explosivo", "Desafio do Chuck", "Mediano");
        angryBirds.inscreverPartida("Matilda", "Branco", "Oviparo", "Caos da Matilda", "Difícil");
        assertEquals(3, SelecaoFactory.getTotalFases());
    }
}
