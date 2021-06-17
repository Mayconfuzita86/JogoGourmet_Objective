package Model;

/**
 *
 * @author mayco
 */
public class NoModel {

    private NoModel sim;
    private NoModel nao;
    private NoModel superior;
    private String descricao;

    public NoModel(String descricao) {
        this.descricao = descricao;
    }

    public NoModel(NoModel sim, NoModel nao, String descricao) {
        this.sim = sim;
        this.nao = nao;
        this.descricao = descricao;
    }

    public NoModel getSim() {
        return sim;
    }

    public void setSim(NoModel sim) {
        this.sim = sim;
    }

    public NoModel getNao() {
        return nao;
    }

    public void setNao(NoModel nao) {
        this.nao = nao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public NoModel getSuperior() {
        return superior;
    }

    public void setSuperior(NoModel superior) {
        this.superior = superior;
    }

}
