package Services;

import Entities.Bien;
import repositories.BienRepository;

public class BienServices {
    BienRepository bienrepository= new BienRepository();
    public void ajouterunbien(Bien bien){
        bienrepository.insert(bien);
        
    }
}
