
package model.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DatabaseMySQL {
    
    private Connection connection;
    
    
    public Connection conectar(){
    
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql:/localhost:3306", "root", "123456");
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
