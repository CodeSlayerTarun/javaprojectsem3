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
public class MobileController implements Initializable {

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
      
    public void SamsungS8(ActionEvent bc) throws IOException {

            ((Node)bc.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root;
                   
        root = loader.load(getClass().getResource("/projects/Mobileinfos8.fxml").openStream());
                
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                } 
    
      public void iphone8(ActionEvent bc) throws IOException {

          try{
            ((Node)bc.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root;
                   
        root = loader.load(getClass().getResource("/projects/MobileInfoIphone8.fxml").openStream());
                
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
  
          }catch(Exception e){
System.out.println(e);
}
      }      
      
      public void redmi4(ActionEvent ex) throws IOException {

            ((Node)ex.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root =loader.load(getClass().getResource("/projects/MobileInfoRedmi4.fxml").openStream());
     
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                
}
  
       public void NOKIA8(ActionEvent ex) throws IOException {

            ((Node)ex.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root =loader.load(getClass().getResource("/projects/MobileInfoNokia8.fxml").openStream());
     
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                
}
}
