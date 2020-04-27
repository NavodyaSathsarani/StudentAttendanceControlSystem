
package student_attendance_control_system;
//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
//import java.util.Calendar;
//import java.text.DateFormat;
import com.toedter.calendar.JDateChooser;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author acer
 */
public class Subject_managment extends javax.swing.JFrame {

    /**
     * Creates new form Subject_managment
     */
    public Subject_managment() {
        initComponents();
    }
    
    public ArrayList<Subject>subjectList(){
    
        ArrayList<Subject> subjectlist=new ArrayList<>();
        ConnectionDB obj = new ConnectionDB();
        try{
           Statement stmt = obj.getConnectionDB().createStatement();
           
           String SubjectId =Subject_Id_label.getText();
           
           String query="SELECT SubId,SubName,Date,Time,TeacherId FROM subject WHERE SubId='"+SubjectId+"'";
           ResultSet rs = stmt.executeQuery(query);
           
           while(rs.next()){
               Subject subject = new Subject(rs.getString("SubId"),rs.getString("SubName"),rs.getString("Time"),rs.getString("Date"),rs.getString("TeacherId"));
               subjectlist.add(subject);
               
        }
        
        }catch(Exception e ){
         JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        return subjectlist; 
    }
    public void showsubject(){
    ArrayList<Subject>list=subjectList();
    DefaultTableModel model= (DefaultTableModel)Subject_Table.getModel();
    Object[] row= new Object[5];
    for(int i=0;i<list.size();i++){
        row[0]=list.get(i).getSubjectId();
        row[1]=list.get(i).getSubjectname();
        row[2]=list.get(i).getTime();
        row[3]=list.get(i).getDate();
        row[4]=list.get(i).getTeacher_ID();
       
        
        
        model.addRow(row);
    }
    
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Sub_Id_label = new javax.swing.JTextField();
        Subject_name_Label = new javax.swing.JTextField();
        Subject_Time_Label = new javax.swing.JTextField();
        Teacher_Id_Label = new javax.swing.JTextField();
        Subject_Add_btn = new javax.swing.JButton();
        Update_subject_btn = new javax.swing.JButton();
        Delete_Subject_btn = new javax.swing.JButton();
        Subject_reset_btn = new javax.swing.JButton();
        ssdate = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Subject_Table = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Subject_Id_label = new javax.swing.JTextField();
        Subject_search_btn = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Subject Managment");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Subject Details"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Subject Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("subject Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Time");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Teacher Id");

        Subject_Add_btn.setBackground(new java.awt.Color(255, 255, 255));
        Subject_Add_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Subject_Add_btn.setForeground(new java.awt.Color(0, 0, 102));
        Subject_Add_btn.setText("Add");
        Subject_Add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subject_Add_btnActionPerformed(evt);
            }
        });

        Update_subject_btn.setBackground(new java.awt.Color(255, 255, 255));
        Update_subject_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update_subject_btn.setForeground(new java.awt.Color(0, 0, 102));
        Update_subject_btn.setText("update");
        Update_subject_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_subject_btnActionPerformed(evt);
            }
        });

        Delete_Subject_btn.setBackground(new java.awt.Color(255, 255, 255));
        Delete_Subject_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Delete_Subject_btn.setForeground(new java.awt.Color(0, 0, 102));
        Delete_Subject_btn.setText("Delete");
        Delete_Subject_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Subject_btnActionPerformed(evt);
            }
        });

        Subject_reset_btn.setBackground(new java.awt.Color(255, 255, 255));
        Subject_reset_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Subject_reset_btn.setForeground(new java.awt.Color(0, 0, 102));
        Subject_reset_btn.setText("Reset");
        Subject_reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subject_reset_btnActionPerformed(evt);
            }
        });

        ssdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Subject_Add_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Update_subject_btn)
                        .addGap(18, 18, 18)
                        .addComponent(Delete_Subject_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Subject_reset_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ssdate, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(Teacher_Id_Label)
                            .addComponent(Subject_Time_Label)
                            .addComponent(Subject_name_Label)
                            .addComponent(Sub_Id_label))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Sub_Id_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Subject_name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Subject_Time_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ssdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Teacher_Id_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subject_Add_btn)
                    .addComponent(Update_subject_btn)
                    .addComponent(Delete_Subject_btn)
                    .addComponent(Subject_reset_btn))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Search"));
        jPanel2.setForeground(new java.awt.Color(0, 0, 102));

        Subject_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Id", "Subject name", "Time", "Date", "Teacher Id"
            }
        ));
        Subject_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Subject_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Subject_Table);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Subject Id");

        Subject_search_btn.setBackground(new java.awt.Color(255, 255, 255));
        Subject_search_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Subject_search_btn.setForeground(new java.awt.Color(0, 0, 102));
        Subject_search_btn.setText("search");
        Subject_search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subject_search_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(Subject_Id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Subject_search_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Subject_Id_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subject_search_btn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Subject_Add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subject_Add_btnActionPerformed
        String SubID=Sub_Id_label.getText();
        String SubjectName=Subject_name_Label.getText();
        String Time=Subject_Time_Label.getText();
        //String Sdata=getDate(Subject_Date_Label.getDate());
        String T_ID=Teacher_Id_Label.getText();
       
        
   String date=ssdate.getText();
        
        ConnectionDB c=new ConnectionDB();
        try{
            Statement stmt=c.getConnectionDB().createStatement();
            String query="insert into subject(SubName,Date,Time,TeacherId,SubId) values('"+SubjectName+"','"+date+"','"+Time+"','"+T_ID+"','"+SubID+"')";
            int n=stmt.executeUpdate(query);
            if(n!=0){
                JOptionPane.showMessageDialog(rootPane,"Recorded Successfully Added");

            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Not Successfully Added");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_Subject_Add_btnActionPerformed

    private void Update_subject_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_subject_btnActionPerformed
        String SubID=Sub_Id_label.getText();
        String SubjectName=Subject_name_Label.getText();
        String Time=Subject_Time_Label.getText();
        String date=ssdate.getText();
        // String Sdata=getDate(sdateSubject.getDate());
         String T_ID=Teacher_Id_Label.getText();
         
         
         String value=Subject_Id_label.getText();
     //   SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
     //   String Date=date.format(Subject_Date_Label.getDate());
        

        ConnectionDB c=new ConnectionDB();
        try{
            int row=Subject_Table.getSelectedRow();
          //  String Value=(Subject_Table.getModel().getValueAt(row, 5).toString());
            Statement stmt=c.getConnectionDB().createStatement();
            String query="update subject set SubName='"+SubjectName+"',Date='"+date+"',Time='"+Time+"',TeacherId='"+T_ID+"',SubId='"+SubID+"' where SubId='"+value+"' ";
            
            
            int n=stmt.executeUpdate(query);
             DefaultTableModel model = (DefaultTableModel)Subject_Table.getModel();
               model.setRowCount(0);
               showsubject();
            if(n!=0){
              
               JOptionPane.showMessageDialog(rootPane,"Updated Successfully");
                
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Update Wrong");
            }
           
            stmt.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }

    }//GEN-LAST:event_Update_subject_btnActionPerformed

    private void Delete_Subject_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Subject_btnActionPerformed
        
       String value=Subject_Id_label.getText();
        ConnectionDB c=new ConnectionDB();

        try{
           // int row=Subject_Table.getSelectedRow();
           // String Value=(Subject_Table.getModel().getValueAt(row, 5).toString());
            
            Statement stmt=c.getConnectionDB().createStatement();
          
            String query="Delete from subject where SubId='"+value+"'";
           
            int opt=JOptionPane.showConfirmDialog(rootPane,"Are you sure you want to delete this record?");
            System.out.println(opt);
            if(opt == 0){
                int n=stmt.executeUpdate(query);
                 DefaultTableModel model = (DefaultTableModel)Subject_Table.getModel();
                 model.setRowCount(0);
                 showsubject();
                if(n!=0){
                    JOptionPane.showMessageDialog(rootPane,"Deleted Successfully");

                }
                else{
                    JOptionPane.showMessageDialog(rootPane,"Error while deleting the record");

                }
                
            }
            else if(opt == 2){

                Sub_Id_label.setText("");
                Subject_name_Label.setText("");
                Subject_Id_label.setText("");
                Subject_Time_Label.setText("");

                stmt.close();

            }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }

        
    }//GEN-LAST:event_Delete_Subject_btnActionPerformed

    private void Subject_reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subject_reset_btnActionPerformed
        
        Sub_Id_label.setText("");
        Subject_name_Label.setText("");
//        Student_Id_Label.setText("");
        Subject_Time_Label.setText("");
        Subject_name_Label.setText("");
        Teacher_Id_Label.setText("");
        ssdate.setText("");
       
    }//GEN-LAST:event_Subject_reset_btnActionPerformed

    private void Subject_search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subject_search_btnActionPerformed
        showsubject();
    }//GEN-LAST:event_Subject_search_btnActionPerformed

    private void Subject_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Subject_TableMouseClicked
       int i= Subject_Table.getSelectedRow();
       TableModel model=Subject_Table.getModel();
       
       Sub_Id_label.setText(model.getValueAt(i, 0).toString());
       Subject_name_Label.setText(model.getValueAt(i, 1).toString());
       Subject_Time_Label.setText(model.getValueAt(i, 2).toString());
         ssdate.setText(model.getValueAt(i, 3).toString());
       // Subject_Date_Label.setDate(model.getValueAt(i, 3).toString);
       Teacher_Id_Label.setText(model.getValueAt(i, 4).toString());
      
       
       
     
    }//GEN-LAST:event_Subject_TableMouseClicked

    private void ssdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Subject_managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subject_managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subject_managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subject_managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subject_managment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_Subject_btn;
    private javax.swing.JTextField Sub_Id_label;
    private javax.swing.JButton Subject_Add_btn;
    private javax.swing.JTextField Subject_Id_label;
    private javax.swing.JTable Subject_Table;
    private javax.swing.JTextField Subject_Time_Label;
    private javax.swing.JTextField Subject_name_Label;
    private javax.swing.JButton Subject_reset_btn;
    private javax.swing.JButton Subject_search_btn;
    private javax.swing.JTextField Teacher_Id_Label;
    private javax.swing.JButton Update_subject_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ssdate;
    // End of variables declaration//GEN-END:variables
}
