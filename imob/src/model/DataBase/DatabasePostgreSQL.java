
package model.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DatabasePostgreSQL {
    
    
     private Connection connection;
    
    
    public Connection conectar(){
    
        try {
            
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection("jdbc:postgre://", "usuario", "senha");
            return this.connection;
            
            
            
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco MySQL: " + ex);
            return null;
        }
    }
    
    
    
    public Connection Desconectar( Connection connerction){
    
        try {
            
            connection.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel Desconectar ao banco MySQL: " + ex);
            return null;
        }
        return null;
    }
    
    
    
    
    
    
    
    
}
