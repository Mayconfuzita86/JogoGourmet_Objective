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
        raiz.getFilhoSim().setPai(raiz);
        raiz.getFilhoNao().setPai(raiz);
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
            validaNoSim(no.getFilhoSim());
        } else {
            validaNoNao(no.getFilhoNao());
        }
    }

    public void perdeuJogo() {
        String novoPrato = perguntaPratoQuePensou();
        String caracteristicaPrato = caracteristicaDoNovoPrato(novoPrato, noAtual.getDescricao());

        NoModel novoNoSuperior = new NoModel(caracteristicaPrato);
        novoNoSuperior.setPai(noAtual.getPai());
        
        NoModel novoNoSim = new NoModel(novoPrato);
        novoNoSuperior.setFilhoSim(novoNoSim);
        
        if (noAtual.getPai().getFilhoSim().equals(noAtual)) {
            novoNoSuperior.getPai().setFilhoSim(novoNoSuperior);
        } else {
            novoNoSuperior.getPai().setFilhoNao(novoNoSuperior);
        }

        noAtual.setPai(novoNoSuperior);
        novoNoSuperior.setFilhoNao(noAtual);
    }
}
