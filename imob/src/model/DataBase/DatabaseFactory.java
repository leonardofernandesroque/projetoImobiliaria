
package model.DataBase;


public class DatabaseFactory {
    
    
    public static Database getDatabase(String nome){
        if(nome.equals("postgresqlo")){
            return (Database) new DatabasePostgreSQL();
            
        }
        else if(nome.equals("mysql")){
            return (Database) new DatabaseMySQL();
        }
        
        return null;
    }
    
    
    
    
}
