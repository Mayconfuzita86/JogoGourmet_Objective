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

    public void percorrerNo(NoModel no) {

        noAtual = no;
        if (perguntarPrato(no.getDescricao())) {
            validaNoFilhoSim(no.getFilhoSim());
        } else {
            validaNoFilhoNao(no.getFilhoNao());
        }
    }

    public void validaNoFilhoSim(NoModel noSim) {

        if (noSim == null) {
            venceuJogo();
            return;
        }
        percorrerNo(noSim);
    }

    public void validaNoFilhoNao(NoModel noNao) {

        if (noNao == null) {
            perdeuJogo();
            return;
        }
        percorrerNo(noNao);
    }

    public void perdeuJogo() {

        String novoPrato = perguntaPratoQuePensou();
        String caracteristicaPrato = caracteristicaDoNovoPrato(novoPrato, noAtual.getDescricao());

        NoModel novoRamo = criaNovoRamo(novoPrato, caracteristicaPrato);

        if (verificaSeDeveRealocarFolha()) {
            incluirRamificacaoRealocandoFolha(novoRamo);
            return;
        }
        incluirRamificacao(novoRamo);
    }

    public NoModel criaNovoRamo(String descricaoPrato, String caracteristicaPrato) {

        NoModel noCaracteristica = new NoModel(caracteristicaPrato);
        NoModel noPrato = new NoModel(descricaoPrato);
        noCaracteristica.setFilhoSim(noPrato);
        return noCaracteristica;
    }

    public void incluirRamificacao(NoModel novoRamo) {

        noAtual.setFilhoNao(novoRamo);
        novoRamo.setPai(noAtual);
    }

    public void incluirRamificacaoRealocandoFolha(NoModel novoRamo) {

        NoModel noAvo = noAtual.getPai();
        NoModel noPai = novoRamo;
        NoModel noFilho = noAtual;

        if (verificaSeEhLasanha() && verificaSePaiEhRaiz()) {
            noAvo.setFilhoSim(noPai);
        } else {
            noAvo.setFilhoNao(noPai);
        }

        noPai.setPai(noAvo);

        noPai.setFilhoNao(noFilho);
        noFilho.setPai(noPai);
    }

    public boolean verificaSeEhBolo() {

        if (noAtual.getDescricao().equals(NoModel.FOLHA_PADRAO_NAO)) {
            return true;
        }
        return false;
    }

    public boolean verificaSeEhLasanha() {

        if (noAtual.getDescricao().equals(NoModel.FOLHA_PADRAO_SIM)) {
            return true;
        }
        return false;
    }

    public boolean verificaSeDeveRealocarFolha() {

        return verificaSeEhLasanha() || verificaSeEhBolo();
    }

    public boolean verificaSePaiEhRaiz() {

        return noAtual.getPai().getDescricao().equals(raiz.getDescricao());
    }
}
