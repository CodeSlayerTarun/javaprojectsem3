/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author vivek
 */
public class FXMLDocumentController implements Initializable {
    public LoginModel loginModel=new LoginModel();
    
    @FXML
    private Label isConnected;
      
    @FXML
    private TextField txtusername;
        
    @FXML
    private TextField txtpassword;
          
    @FXML
    private Button login;
    
    @FXML
    private Label label;
   
       @FXML
    private Button  SignUp;
        
          
          
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            if(loginModel.isDbConnected()){
                isConnected.setText("Connected");
            }else {
                isConnected.setText(" Not Connected");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
               }
    }
    
    /**
     *
     * @param event
     */
    @FXML
    public void Login(ActionEvent event){
        try {
            if(loginModel.isLogin(txtusername.getText(), txtpassword.getText())){
                isConnected.setText("Username and password is connected");
                ((Node)event.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Pane root =loader.load(getClass().getResource("/projects/users.fxml").openStream());
                 UsersController userController=(UsersController)loader.getController();
                 userController.GetUser(txtusername.getText());
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                 }else{
                isConnected.setText("Username and password is not connected");
              
            }
        } catch (SQLException ex) {
            isConnected.setText("Username and password is not connected");
            System.out.println(ex.toString());
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void SignUp(ActionEvent ex) throws IOException {

            ((Node)ex.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root =loader.load(getClass().getResource("/projects/Registration.fxml").openStream());
     
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
                
}

    @FXML
    private void initialize(MouseEvent event) {
    }
}
       
    
      
    

