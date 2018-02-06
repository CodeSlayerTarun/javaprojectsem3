/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

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
public class LoginModel {
    Connection connection;
    public LoginModel(){
        connection=SqliteConnection.Connector();
        if(connection==null){
            System.out.println("connection is successful");
            System.exit(1);
        }  
        }
        public boolean isDbConnected() throws SQLException{
            return !connection.isClosed();
        }

public boolean isLogin(String user,String pass) throws SQLException  {
PreparedStatement preparedStatement = null;
String query;
        query = "select * from SIGNUP where USERNAME='"+user+"' and PASSWORD='"+pass+"';";
//String query_2 = "CREATE TABLE IF NOT EXISTS \"LRTable\" (\"FIRSTNAME\" TEXT, \"LASTNAME\" TEXT, \"CITY\" TEXT, \"STATE\" TEXT, \"TALUKA\" TEXT, \"DOB\" TEXT, \"USERNAME\" VARCHAR PRIMARY KEY  NOT NULL , \"PASSWORD\" TEXT)";
System.out.println(query);
//ResultSet rs=connection.getMetaData().getSchemas();
//while(rs.next()) {
//   System.out.println(rs.getString(1));
//}
preparedStatement =connection.prepareStatement(query);
//preparedStatement.executeUpdate();
    ResultSet resultSet = preparedStatement.executeQuery();
        try {
            if (resultSet.next()){
                return true;
            }
            else{
                return false;
            }       } catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        }
finally{
preparedStatement.close();
resultSet.close();
}
        return false;
}
      
}