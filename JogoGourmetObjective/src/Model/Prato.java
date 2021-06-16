package Model;
/**
 *
 * @author mayco
 */
public class Prato {
    
    private String nome;
    private String dica;

    public Prato(String nome, String dica) {
        this.nome = nome;
        this.dica = dica;
           }

    public Prato(String bolo_de_Chocolate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }  
        
}