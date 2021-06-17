package Controller;

import Model.NoModel;
import static View.ApresentadorMensagem.*;

/**
 *
 * @author mayco
 */
public class JogoController {

    private NoModel raiz;
    private NoModel noAtual;

    public JogoController() {
        NoModel sim = new NoModel("Lasanha");
        NoModel nao = new NoModel("Bolo de Chocolate");
        raiz = new NoModel(sim, nao, "massa");
        raiz.getSim().setSuperior(raiz);
        raiz.getNao().setSuperior(raiz);
    }

    public void iniciarJogo() {
        percorrerNo(raiz);
    }

    public void validaNoSim(NoModel noSim) {
        if (noSim == null) {
            venceuJogo();
        } else {
            percorrerNo(noSim);
        }
    }

    public void validaNoNao(NoModel noNao) {
        if (noNao == null) {
            perdeuJogo();
        } else {
            percorrerNo(noNao);
        }
    }

    public void percorrerNo(NoModel no) {
        noAtual = no;
        
        if (perguntarPrato(no.getDescricao())) {
            validaNoSim(no.getSim());
        } else {
            validaNoNao(no.getNao());
        }
    }

    public void perdeuJogo() {
        String novoPrato = perguntaPratoQuePensou();
        String caracteristicaPrato = caracteristicaDoNovoPrato(novoPrato, noAtual.getDescricao());

        NoModel novoNoSuperior = new NoModel(caracteristicaPrato);
        novoNoSuperior.setSuperior(noAtual.getSuperior());
        NoModel novoNoSim = new NoModel(novoPrato);
        novoNoSuperior.setSim(novoNoSim);
        
        if (noAtual.getSuperior().getSim().equals(noAtual)) {
            novoNoSuperior.getSuperior().setSim(novoNoSuperior);
        } else {
            novoNoSuperior.getSuperior().setNao(novoNoSuperior);
        }

        noAtual.setSuperior(novoNoSuperior);
        novoNoSuperior.setNao(noAtual);
    }
}
