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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vivek
 */
public class UsersController implements Initializable {
    @FXML
private Label userLlb;
     
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    
    }  
      public void GetUser(String user) {
        // TODO
       userLlb.setText(user);
}

       public void SignOut(ActionEvent event) throws IOException {

            ((Node)event.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root;
        root = loader.load(getClass().getResource("/projects/FXMLDocument.fxml").openStream());
     
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                
}
       
      public void Mobile(ActionEvent eb) throws IOException {

            ((Node)eb.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root;
                   
        root = loader.load(getClass().getResource("/projects/Mobile.fxml").openStream());
                
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
                } 
         
       public void Furniture(ActionEvent exe) throws IOException {

            ((Node)exe.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root;
                   
        root = loader.load(getClass().getResource("/projects/Furniture.fxml").openStream());
                
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                }     
         
       public void LifeStyle(ActionEvent evc) throws IOException {

            ((Node)evc.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root;
                   
        root = loader.load(getClass().getResource("/projects/LifeStyle.fxml").openStream());
                
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                }     
         
       public void Kitchen(ActionEvent bc) throws IOException {

            ((Node)bc.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root;
                   
        root = loader.load(getClass().getResource("/projects/Kitchen.fxml").openStream());
                
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                }       
     
       
      
}
        
