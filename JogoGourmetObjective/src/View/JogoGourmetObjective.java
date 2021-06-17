package View;

import Controller.Jogo;
import javax.swing.JOptionPane;

/**
 *
 * @author mayco
 */
public class JogoGourmetObjective {    
      
    
    public static void main(String[] args) {        
       
        Jogo jogo = new Jogo();
        
        while(ApresentadorMensagem.penseEmUmPrato()){ 
            jogo.iniciarJogo();          
 
        }                 
    }          
          
    public void verificaPrato(){      
       
    }
    
    public void addPratos(){
        
    }
    
        
    
}
