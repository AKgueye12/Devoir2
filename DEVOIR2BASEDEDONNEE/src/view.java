import java.util.List;
import java.util.Scanner;

import Services.BienServices;
import Services.ZoneService;
import Entities.Zone;

public class view {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc = new Scanner(System.in);
        ZoneService zoneservice = new ZoneService();
        BienServices bienservices = new BienServices();
        do {
            System.out.println("1-Créer une zone ");
            System.out.println("2-Lister  les Zones");
            System.out.println("3-Ajouter un bien et lui associer une zone ");
            System.out.println("4-lister les bien en affichant le nom de la zone ");
            System.out.println("5-Quitter");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("Entrer le nom de la zone  ");
                    String nomzone = sc.nextLine();
                    Zone zones = new Zone();
                    zones.setNomzone(nomzone);
                    zoneservice.ajouterZone();
                    break;

                case 2:
                    List<Zone> zones2 = zoneservice.listzone();
                    for (Zone zone : zones2) {
                        System.out.println("nomzone " + zone.getNomzone());
                        System.out.println("=================================");
                    }
                    break;

                case 3:

                    break;

                case 4:

                    break;
                default:
                    break;
            }
        } while (choix != 5);
    }
}
