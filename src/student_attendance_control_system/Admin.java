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
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Subject_mgt_Label = new javax.swing.JLabel();
        Userprofile_mgt_label = new javax.swing.JLabel();
        Teacher_mgt_Label = new javax.swing.JLabel();
        Sending_noti_Label = new javax.swing.JLabel();
        Std_mgt_Label = new javax.swing.JLabel();
        Marks_allo_Label = new javax.swing.JLabel();
        Report_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Hello Admin!");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Operations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 0, 102))); // NOI18N

        Subject_mgt_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Subject_mgt_Label.setForeground(new java.awt.Color(0, 0, 102));
        Subject_mgt_Label.setText("Subject managment");
        Subject_mgt_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Subject_mgt_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Subject_mgt_LabelMouseClicked(evt);
            }
        });

        Userprofile_mgt_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Userprofile_mgt_label.setForeground(new java.awt.Color(0, 0, 102));
        Userprofile_mgt_label.setText("User profile Managment");
        Userprofile_mgt_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Userprofile_mgt_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Userprofile_mgt_labelMouseClicked(evt);
            }
        });

        Teacher_mgt_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Teacher_mgt_Label.setForeground(new java.awt.Color(0, 0, 102));
        Teacher_mgt_Label.setText("Teacher Managment");
        Teacher_mgt_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Teacher_mgt_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Teacher_mgt_LabelMouseClicked(evt);
            }
        });

        Sending_noti_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Sending_noti_Label.setForeground(new java.awt.Color(0, 0, 102));
        Sending_noti_Label.setText("Sending Notification");
        Sending_noti_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sending_noti_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sending_noti_LabelMouseClicked(evt);
            }
        });

        Std_mgt_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Std_mgt_Label.setForeground(new java.awt.Color(0, 0, 102));
        Std_mgt_Label.setText("Student Managment");
        Std_mgt_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Std_mgt_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Std_mgt_LabelMouseClicked(evt);
            }
        });

        Marks_allo_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Marks_allo_Label.setForeground(new java.awt.Color(0, 0, 102));
        Marks_allo_Label.setText("Marks Allocation");
        Marks_allo_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Marks_allo_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Marks_allo_LabelMouseClicked(evt);
            }
        });

        Report_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Report_Label.setForeground(new java.awt.Color(0, 0, 102));
        Report_Label.setText("Report Generating");
        Report_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Report_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Report_LabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Report_Label)
                    .addComponent(Marks_allo_Label)
                    .addComponent(Std_mgt_Label)
                    .addComponent(Sending_noti_Label)
                    .addComponent(Teacher_mgt_Label)
                    .addComponent(Userprofile_mgt_label)
                    .addComponent(Subject_mgt_Label))
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Subject_mgt_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Userprofile_mgt_label)
                .addGap(18, 18, 18)
                .addComponent(Teacher_mgt_Label)
                .addGap(18, 18, 18)
                .addComponent(Sending_noti_Label)
                .addGap(18, 18, 18)
                .addComponent(Std_mgt_Label)
                .addGap(18, 18, 18)
                .addComponent(Marks_allo_Label)
                .addGap(18, 18, 18)
                .addComponent(Report_Label)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Subject_mgt_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Subject_mgt_LabelMouseClicked
       Subject_managment obj1= new Subject_managment();
       obj1.setVisible(true);
       
    }//GEN-LAST:event_Subject_mgt_LabelMouseClicked

    private void Userprofile_mgt_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Userprofile_mgt_labelMouseClicked
        UserProfile_Managment obj2=new UserProfile_Managment();
        obj2.setVisible(true);
    }//GEN-LAST:event_Userprofile_mgt_labelMouseClicked

    private void Teacher_mgt_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Teacher_mgt_LabelMouseClicked
       Teacher_Managment obj3=new Teacher_Managment();
       obj3.setVisible(true);
        
    }//GEN-LAST:event_Teacher_mgt_LabelMouseClicked

    private void Sending_noti_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sending_noti_LabelMouseClicked
        Sending_Notification obj4=new Sending_Notification();
        obj4.setVisible(true);
    }//GEN-LAST:event_Sending_noti_LabelMouseClicked

    private void Std_mgt_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Std_mgt_LabelMouseClicked
        StudentManagment obj5= new StudentManagment();
        obj5.setVisible(true);
    }//GEN-LAST:event_Std_mgt_LabelMouseClicked

    private void Marks_allo_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Marks_allo_LabelMouseClicked
        Marks_Allocation obj6=new Marks_Allocation();
        obj6.setVisible(true);
    }//GEN-LAST:event_Marks_allo_LabelMouseClicked

    private void Report_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Report_LabelMouseClicked
       Report_Generating obj7=new Report_Generating();
       obj7.setVisible(true);
    }//GEN-LAST:event_Report_LabelMouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Marks_allo_Label;
    private javax.swing.JLabel Report_Label;
    private javax.swing.JLabel Sending_noti_Label;
    private javax.swing.JLabel Std_mgt_Label;
    private javax.swing.JLabel Subject_mgt_Label;
    private javax.swing.JLabel Teacher_mgt_Label;
    private javax.swing.JLabel Userprofile_mgt_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}