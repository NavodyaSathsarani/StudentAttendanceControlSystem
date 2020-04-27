/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_attendance_control_system;

/**
 *
 * @author acer
 */
public class Student {
    private String fname,lname,NIC,Parent_Mobi,Student_Mobi,SID;
    
    public Student(String FName,String LName,String NIC,String Parent_mobi,String Student_mobi,String SID){
    
        this.fname=FName;
        this.lname=LName;
        this.NIC=NIC;
        this.SID=SID;
        
        this.Parent_Mobi=Parent_mobi;
        this.Student_Mobi=Student_mobi;
      
    }
    public String getFname(){
    return fname;
    }
    public String getLname(){
    return lname;
    }
    public String getNIC(){
    return NIC;
    }
   
    public String getParentMobi(){
    return Parent_Mobi;
    }
    public String getStudentmobi(){
    return Student_Mobi;
    }
    
    public String getSID(){
    return SID;
    }
    
   
    
    
}
