/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_attendance_control_system;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class ConnectionDB {
    Connection conn;
  public Connection getConnectionDB(){
      
      try{
          Class.forName("com.mysql.jdbc.Driver");
          conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_attendance_control_system", "root", "");
           
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e.getMessage());
      }
      return conn;
  
  }
    
}
