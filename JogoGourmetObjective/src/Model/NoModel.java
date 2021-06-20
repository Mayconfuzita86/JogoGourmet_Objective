package Model;

/**
 *
 * @author mayco
 */
public class NoModel {

    private NoModel filhoSim;
    private NoModel filhoNao;
    private NoModel pai;
    private String descricao;
    
    public static String FOLHA_PADRAO_NAO = "Bolo de Chocolate";
    public static String FOLHA_PADRAO_SIM = "Lasanha";

    public NoModel(String descricao) {
        this.descricao = descricao;
    }

    public NoModel(NoModel sim, NoModel nao, String descricao) {
        this.filhoSim = sim;
        this.filhoNao = nao;
        this.descricao = descricao;
    }

    public NoModel getFilhoSim() {
        return filhoSim;
    }

    public void setFilhoSim(NoModel filhoSim) {
        this.filhoSim = filhoSim;
    }

    public NoModel getFilhoNao() {
        return filhoNao;
    }

    public void setFilhoNao(NoModel filhoNao) {
        this.filhoNao = filhoNao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public NoModel getPai() {
        return pai;
    }

    public void setPai(NoModel pai) {
        this.pai = pai;
    }

}
