/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_attendance_control_system;

class Subject {
    private String SubId,Subjectname,Time,Date,Teacher_Id;
    
    public Subject(String SubId,String Subjectname,String Time,String date,String Teacher_Id ){
      this.SubId=SubId;
      this.Subjectname=Subjectname;
      this.Time=Time;
      this.Date=date;
      this.Teacher_Id=Teacher_Id;
     
     
    
    }
    
    
     public String getSubjectId(){
    return SubId;
    }
    public String getSubjectname(){
    return Subjectname;
    }
    public String getTime(){
    return Time;
    }
    public String getDate(){
    return Date;
    }
    public String getTeacher_ID(){
    return Teacher_Id;
    }
   
  
}
