
package model.DataBase;

import java.sql.Connection;



public interface Database {
    
    public Connection conectar();
    
    public void desconectar(Connection conn);
    
}
