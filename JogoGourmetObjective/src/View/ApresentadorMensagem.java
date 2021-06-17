package View;

import javax.swing.JOptionPane;
/**
 *
 * @author mayco
 */
public class ApresentadorMensagem {

    public static boolean penseEmUmPrato() {

        String[] botao = {"OK"};

        return JOptionPane.showOptionDialog(null, "Pense em um prato que gosta",
                "Jogo Gourmet", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, botao, "OK") == JOptionPane.OK_OPTION;
    }

    public static boolean perguntarPrato(String descricao) {
        return JOptionPane.showConfirmDialog(null, "O prato que você pensou é "
                + descricao + "?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    public static void venceuJogo() {
        JOptionPane.showMessageDialog(null, "Acertei de novo!", "Jogo Gourmet", JOptionPane.INFORMATION_MESSAGE);
    }

    public static String perguntaPratoQuePensou() {
        return JOptionPane.showInputDialog(null, "Qual prato você pensou?", "Desisto",
                JOptionPane.OK_OPTION);
    }

    public static String caracteristicaDoNovoPrato(String pratoInformado, String pratoPergunta) {
        return JOptionPane.showInputDialog(null, pratoInformado + " é _______ mas "
                + pratoPergunta + " não.", "Complete", JOptionPane.OK_CANCEL_OPTION);
    }

}
