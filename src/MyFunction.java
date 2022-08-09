
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shri
 */
public class MyFunction {
    
    public static int countData(String tableName){
        int total=0;
        
        Connection connect=MyConnection.getConnection();
        Statement st ;
        try {
            st=connect.createStatement();
            ResultSet rs=st.executeQuery("SELECT COUNT(*) AS 'total' FROM "+tableName);
            
            while(rs.next()){
                total=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return total;
        
    }
}
