package View;

import Controller.JogoController;
/**
 *
 * @author mayco
 */
public class JogoGourmetObjective {

    public static void main(String[] args) {

        JogoController jogo = new JogoController();

        while (ApresentadorMensagem.penseEmUmPrato()) {
            jogo.iniciarJogo();
        }
    }
}
