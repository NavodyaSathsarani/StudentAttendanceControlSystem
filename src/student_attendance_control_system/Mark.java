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
public class Mark {
    private String stuId,paperNo,marksObtaion;
    
    public Mark(String stuId,String paperNo,String marksObtain){
        this.stuId=stuId;
       this.paperNo=paperNo;
       this.marksObtaion=marksObtain;
    }
    
     public String getstuId(){
    return stuId;
    }
    
    public String getpaperNum(){
    return paperNo;
    }
    public String getMarksObtaion(){
    return marksObtaion;
    }
    
}
