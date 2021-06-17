package Controller;

import Model.No;
import View.ApresentadorMensagem;
import static View.ApresentadorMensagem.*;

/**
 *
 * @author mayco
 */
public class Jogo {
    
    private No raiz;
    private No noAtual;
            
    public Jogo(){
    No sim = new No("lasanha");
    No nao = new No("bolo de chocolate");         
    raiz = new No(sim, nao, "massa"); 
    raiz.getSim().setSuperior(raiz);
    raiz.getNao().setSuperior(raiz);
    }
    
    public void iniciarJogo(){
        
        percorrerNo(raiz);        
        
    }
    
    public void validaNoSim(No noSim){
         if(noSim == null){
                venceuJogo();
            }else{
                percorrerNo(noSim);
            }
    }
    
    public void validaNoNao(No noNao){
         if(noNao == null){
                perdeuJogo();
            }else{
                percorrerNo(noNao);
            }
    }
    
    public void percorrerNo(No no){
        noAtual = no;
        //perguntar se o valor do no atual é sim/nao
        if(perguntarPrato(no.getDescricao())){            
           validaNoSim(no.getSim());
        }else{
            
            validaNoNao(no.getNao());
        }
        //sim - no direita
        
        
        //nao - no esquerda
        
    }
    
    public void perdeuJogo(){
        String novoPrato = perguntaPratoQuePensou();
        String caracteristicaPrato = caracteristicaDoNovoPrato(novoPrato, noAtual.getDescricao());
        
                
        No novoNoSuperior = new No(caracteristicaPrato);
        novoNoSuperior.setSuperior(noAtual.getSuperior());
        No novoNoSim = new No(novoPrato);
        novoNoSuperior.setSim(novoNoSim);
        
        if(noAtual.getSuperior().getSim().equals(noAtual)){
        novoNoSuperior.getSuperior().setSim(novoNoSuperior);
        }else{
        novoNoSuperior.getSuperior().setNao(novoNoSuperior);
        }
        
        noAtual.setSuperior(novoNoSuperior);
        novoNoSuperior.setNao(noAtual);       
                
    }       
        
}
