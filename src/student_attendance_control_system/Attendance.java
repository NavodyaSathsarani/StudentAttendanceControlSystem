/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_attendance_control_system;

import java.text.SimpleDateFormat;
import java.util.Date;


class Attendance {
    private String FName,LName,NIC;
    private Date Date;
     
    
    public Attendance(String FName,String LName,String NIC, Date Date){
      this.FName=FName;
      this.LName=LName;
      this.NIC=NIC;
      this.Date=Date;
    }
    
    public String getFname(){
    return FName;
    }
    
    public String getLname(){
    return LName;
    }
    public String getNIC(){
    return NIC;
    }
    public Date getDate(){
    return Date;
    }
    
    
}
