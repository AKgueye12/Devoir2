package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entities.Zone;

public class ZoneRepository {
     public  List<Zone> selectAll(){
         List<Zone> zones=new ArrayList<>();
       try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/devoirsecondiagea" 
                    , "root", "");
           Statement statement = conn.createStatement();
           ResultSet rs=   statement.executeQuery("select * from zone");
             while (rs.next()) {
                  Zone zone=new Zone();
                 zone.setId(rs.getInt("id_zone"));
                 zone.setNomzone(rs.getString("nomzone"));
                 zones.add(zone);
             }
             rs.close();
             conn.close();
        } catch (ClassNotFoundException e) {
          System.out.println("Erreur de chargement de Driver");
        }
       catch (SQLException e) {
        System.out.println("Erreur de Connexion a la BD");
      }
        return  zones;
    }
    public  void insert(Zone zone){
     try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/devoisecondiagea" 
                    , "root", "");
            
             Statement statement = conn.createStatement();
            
             int nbreLigne=statement.executeUpdate("INSERT INTO zone (id_zone, nom_zone) VALUES ('"+zone.getId()+"', '"+zone.getNomzone()+"')");
             conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur de chargement de Driver");
        }
       catch (SQLException e) {
          System.out.println("Erreur de Connexion a la BD");
      }

     }
}
