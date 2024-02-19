package Services;

import java.util.List;

import Entities.Zone;
import repositories.ZoneRepository;

public class ZoneService {
    private ZoneRepository zonerepository=new ZoneRepository();

    public void ajouterZone(Zone zone){
        zonerepository.insert(zone);
       }
       
    public List<Zone> listzone(){
      return zonerepository.selectAll();
   }
}
