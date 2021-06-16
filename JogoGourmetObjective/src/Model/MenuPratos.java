package Model;

import Model.Prato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayco
 */
public class MenuPratos {
    
    private List<Prato> pratos = new ArrayList<>();    

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }  
    
}