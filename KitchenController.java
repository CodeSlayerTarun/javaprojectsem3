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
 * @author vivek
 */
public class KitchenController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     public void Back(ActionEvent bc) throws IOException {

            ((Node)bc.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root;
                   
        root = loader.load(getClass().getResource("/projects/users.fxml").openStream());
                
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                }   
     
     public void bottles(ActionEvent bc) throws IOException {

            ((Node)bc.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root;
                   
        root = loader.load(getClass().getResource("/projects/Kitchen_bottle1.fxml").openStream());
                
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                }  
     
     public void Cooker(ActionEvent bc) throws IOException {

            ((Node)bc.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root;
                   
        root = loader.load(getClass().getResource("/projects/Kitchen_cooker1.fxml").openStream());
                
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                } 
 
       public void Spoon(ActionEvent bc) throws IOException {

            ((Node)bc.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root;
                   
        root = loader.load(getClass().getResource("/projects/Kitchen_spoons.fxml").openStream());
                
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                } 

         public void Pan(ActionEvent bc) throws IOException {

            ((Node)bc.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root;
                   
        root = loader.load(getClass().getResource("/projects/Kitchen_pan.fxml").openStream());
                
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                } 

}
