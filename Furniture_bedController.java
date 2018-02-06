/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tarun
 */
public class Furniture_bedController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void BuyNow(ActionEvent ex) throws IOException {

            ((Node)ex.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root =loader.load(getClass().getResource("/projects/Buy.fxml").openStream());
     
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                
}
    public void Back(ActionEvent ex) throws IOException {

            ((Node)ex.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root =loader.load(getClass().getResource("/projects/Furniture.fxml").openStream());
     
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                
}
    
}
