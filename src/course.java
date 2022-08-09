
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shri
 */
public class course {
    public void insertUpdateDeleteCourse(char operation,Integer id,
            String label,Integer hours){
        Connection connect=MyConnection.getConnection();
        PreparedStatement ps;
        
    
        // to insert
        if(operation=='i'){
            try {
                ps=connect.prepareStatement("INSERT INTO `course`( `label`, `Hours`) VALUES (?,?)");
               ps.setString(1, label);
               ps.setInt(2, hours);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"New Course Added");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(operation=='u'){
           
        try {
                ps=connect.prepareStatement("UPDATE `course` SET `label`=? ,`Hours`=? WHERE id=? ");
                ps.setString(1, label);
                ps.setInt(2,hours);
                ps.setInt(3, id);
                
                
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Course Data Updated Successfully !");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(operation=='d'){
           
           int yesNo=JOptionPane.showConfirmDialog(null,"Deleting this course will also delete scores associated with it !","Are you sure to Delete the course ?",JOptionPane.OK_CANCEL_OPTION,0);
               
           if(yesNo==JOptionPane.OK_OPTION){
           try {
                ps=connect.prepareStatement("DELETE FROM `course` WHERE `id`= ?");
               
                ps.setInt(1,id);
                
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Course Deleted !");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           }
            
    }
      
    }
    

    public boolean isCourseExist(String courseName){
        boolean isExist=false;
        Connection connect=MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=connect.prepareStatement("SELECT * FROM `course` WHERE `label`=? ");
            ps.setString(1,courseName);
            
            ResultSet rs=ps.executeQuery();
            
           if(rs.next()){
                isExist=true;  
             } 
           
        } 
        catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return isExist;
    }
    
    public void fillCourseJtable(JTable table){
        Connection connect=MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=connect.prepareStatement("SELECT * FROM `course`");
           
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            
            Object[] row;
            
            while(rs.next()){
            row=new Object[3];
            row[0]=rs.getInt(1);
            row[1]=rs.getString(2);
            row[2]=rs.getInt(3);
           
            
            model.addRow(row);
            
        }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getCourseId(String courselbl){
        int courseId=0;
        
        Connection connect=MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=connect.prepareStatement("SELECT * FROM `course` WHERE `label`=? ");
            ps.setString(1,courselbl);
            
            ResultSet rs=ps.executeQuery();
            
           if(rs.next()){
                courseId=rs.getInt("Id");
             } 
           
        } 
        catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return courseId;
    }
     public void fillCourseCombo(JComboBox combo){
        Connection connect=MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=connect.prepareStatement("SELECT * FROM `course`");
           
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
           combo.addItem(rs.getString(2));
            
        }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
