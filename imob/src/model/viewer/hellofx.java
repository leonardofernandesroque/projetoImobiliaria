
package Model.viewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class hellofx extends Application{
  
    
   

    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLTelaInicial.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
        
    }
    
    
}
