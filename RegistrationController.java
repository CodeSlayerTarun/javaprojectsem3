/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tarun
 */
public class RegistrationController implements Initializable {

    @FXML
    private TextField regfname;
    @FXML
    private TextField reglname;
    @FXML
    private Button regcreate;
    @FXML
    private TextField regcity;
    @FXML
    private TextField regtaluka;
    @FXML
    private TextField regstate;
      @FXML
    private TextField regdob;
      
    @FXML
    private TextField regusername;
    @FXML
    private PasswordField regpass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    private Connection connection = null;
    
    public RegistrationController(){
        connection=SqliteConnection.Connector();
        if(connection==null){
            System.out.println("connection is successful");
            System.exit(1);
        }  
        }
        public boolean isDbConnected() throws SQLException{
            return !connection.isClosed();
        }

    @FXML
    private void Registration(ActionEvent event) throws IOException, SQLException {
//             Connection connection = null;
            
            try{
                 PreparedStatement preparedStatement = null;
           String query= "insert into SIGNUP(FIRSTNAME,LASTNAME,CITY,STATE,TALUKA,DOB,USERNAME,PASSWORD) values(?,?,?,?,?,?,?,?)";
           
           System.out.println(query);
 preparedStatement = connection.prepareStatement(query);
       preparedStatement.setString(1, regfname.getText());
        preparedStatement.setString(2, reglname.getText());
         preparedStatement.setString(3, regcity.getText());
          preparedStatement.setString(4, regstate.getText());
           preparedStatement.setString(5, regtaluka.getText());
             preparedStatement.setString(7, regusername.getText());
              preparedStatement.setString(8, regpass.getText());
              preparedStatement.execute();
            }catch(Exception e){
            System.out.println(e);
            }
              ((Node)event.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                FXMLLoader loader=new FXMLLoader();
                 Parent root;
                   
        root = loader.load(getClass().getResource("/projects/FXMLDocument.fxml").openStream());
                
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
}