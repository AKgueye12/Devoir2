package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import Entities.Bien;

public class BienRepository {
    public void insert(Bien bien){
        try {
    
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/devoirsecondiagea" 
                    , "root", "");
            Statement statement = conn.createStatement();
             String sql=String.format("INSERT INTO `Bien` ( `reference`, `description`,`prix`,`dateCreation`) "
                      + " VALUES ('%s', '%s', '%f','%s')",
                      bien.getReference(),bien.getDescription(),bien.getPrix(),bien.getDatecreation());
             int nbreLigne=statement.executeUpdate(sql);
             statement.close();
             conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur de chargement de Driver");
        }
       catch (SQLException e) {
          System.out.println("Erreur de Connexion a la BD");
      }
      }
      

}
