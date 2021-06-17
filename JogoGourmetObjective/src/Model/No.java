/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mayco
 */
public class No {
    
    private No sim;
    private No nao;
    private No superior;
    private String descricao;  

    public No(String descricao) {
        this.descricao = descricao;
    }

    public No(No sim, No nao, String descricao) {
        this.sim = sim;
        this.nao = nao;
        this.descricao = descricao;
    }
    
    

    public No getSim() {
        return sim;
    }

    public void setSim(No sim) {
        this.sim = sim;
    }

    public No getNao() {
        return nao;
    }

    public void setNao(No nao) {
        this.nao = nao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }   

    public No getSuperior() {
        return superior;
    }

    public void setSuperior(No superior) {
        this.superior = superior;
    }
        
}