/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

/**
 *
 * @author tarun
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vivek
 */
public class registrationmodel {
    Connection connection;
    public registrationmodel(){
        connection=SqliteConnection.Connector();
        if(connection==null){
            System.out.println("connection is successful");
            System.exit(1);
        }  
        }
        public boolean isDbConnected() throws SQLException{
            return !connection.isClosed();
        }
}
