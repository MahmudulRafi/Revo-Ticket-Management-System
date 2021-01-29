
package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateDB {
    public static void main(String[] args) throws SQLException {
        
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
            String sql = "CREATE DATABASE IF NOT EXISTS fdata";
                            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
        }catch(Exception e){
            
        } 
      
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fdata","root","");
            String sql = "CREATE TABLE IF NOT EXISTS reg" +
                            "(id INTEGER not NULL," + "fname VARCHAR(200)," + "age INTEGER," + "PRIMARY KEY (id))";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
        }catch(Exception e){
            
        }
      
    
}
}
