/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.viewer;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * FXML Controller class
 *
 * @author leo
 */
public class FXMLTelaInicialController implements Initializable {

    @FXML
    private AnchorPane apPrincipal;
    @FXML
    private AnchorPane apMenuEsquerdo;
    @FXML
    private VBox vbMenuDireito;
    @FXML
    private ImageView imgLogotipo;
    @FXML
    private Button btnHome;
    @FXML
    private AnchorPane apMenuDireito;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
    @FXML
    private void abrirHome(ActionEvent event) {
        
        try {
            
                AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLHome.fxml"));
                
                AnchorPane.setTopAnchor(a, 0.0);
                AnchorPane.setLeftAnchor(a, 0.0);
                AnchorPane.setRightAnchor(a, 0.0);
                AnchorPane.setBottomAnchor(a, 0.0);
                
                apMenuDireito.getChildren().setAll(a);
                        
        } catch (IOException ex) {
            
            Logger.getLogger(FXMLTelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        
        
        
        
    }
    
}
