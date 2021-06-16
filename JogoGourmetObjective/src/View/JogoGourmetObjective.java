package View;

import Model.MenuPratos;
import Model.Prato;
import javax.swing.JOptionPane;

/**
 *
 * @author mayco
 */
public class JogoGourmetObjective {
    
    private int resultado;
    private MenuPratos listaMassas = new MenuPratos();
    private Prato massa = new Prato("Lasanha");
    private MenuPratos listaOutros = new MenuPratos();
    private Prato outros = new Prato("Bolo de Chocolate");

    public static void main(String[] args) {            
            
                            
                      
           // JOptionPane.showInputDialog(null, "Qual prato você pensou?", "Desisto", JOptionPane.QUESTION_MESSAGE);
        
   
    } 
    
    public void iniciaJogo(){
        JOptionPane.showMessageDialog(null,"Pense em um prato que gosta");
        
        resultado = JOptionPane.showConfirmDialog(null, "O prato que você pensou é massa?", "Confirm", JOptionPane.YES_NO_OPTION);
        
        if(resultado == JOptionPane.YES_OPTION){            
            verificaPrato(listaMassas);            
        }else{
            verificaPrato(listaOutros);
        }        
    }
    
    public void verificaPrato(MenuPratos pratos){      
       // deve precorrer a lista 
    }
    
    public void addPratos(MenuPratos pratos){
        // deve adicionar um novo prato ao MenuPratos
    }
    
    public void jogoVenceu(){
      JOptionPane.showMessageDialog(null, "Acertei de novo!", "", JOptionPane.INFORMATION_MESSAGE);  
    }    
    
}
