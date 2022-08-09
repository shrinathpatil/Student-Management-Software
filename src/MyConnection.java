
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shri
 */
public class MyConnection {
    private static  String servername="localhost";
    private static String username="root";
    private static String dbname="studentmanagementdb";
    private static Integer portnumber=3306;
    private static String password="";
    
    
    
    public static  Connection getConnection(){
        Connection connect=null;
       MysqlDataSource datasource=new MysqlDataSource();
       datasource.setServerName(servername);
       datasource.setUser(username);
       datasource.setPassword(password);
       datasource.setDatabaseName(dbname);
       datasource.setPortNumber(portnumber);
       
    
        try {
            connect= (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connetion"+MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        return connect;
    }
    
}
