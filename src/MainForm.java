
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shri
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabelwelcome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelstdcount = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelcoursecount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        label1 = new java.awt.Label();
        jMenuBarmainform = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemaddstudent = new javax.swing.JMenuItem();
        jMenuItemManage = new javax.swing.JMenuItem();
        jMenucourse = new javax.swing.JMenu();
        jMenuItemaddc = new javax.swing.JMenuItem();
        jMenuItemmgc = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuaacount = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 194, 194));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 57, 99), 3, true));

        jLabelwelcome.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabelwelcome.setForeground(new java.awt.Color(255, 51, 0));
        jLabelwelcome.setText("Welcome ! ");
        jLabelwelcome.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jPanel2.setBackground(new java.awt.Color(127, 185, 242));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));

        jLabelstdcount.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelstdcount.setForeground(new java.awt.Color(121, 49, 49));
        jLabelstdcount.setText("Stundents Count : ");
        jLabelstdcount.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelstdcount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabelstdcount)
                .addGap(33, 33, 33))
        );

        jPanel3.setBackground(new java.awt.Color(243, 156, 222));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 204), 2, true));

        jLabelcoursecount.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelcoursecount.setForeground(new java.awt.Color(121, 49, 49));
        jLabelcoursecount.setText("Course Count :");
        jLabelcoursecount.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelcoursecount, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelcoursecount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/school.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabelwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        button1.setLabel("button1");

        label1.setText("label1");

        jMenuBarmainform.setBackground(new java.awt.Color(83, 180, 245));

        jMenu3.setBorder(null);
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stud.png"))); // NOI18N
        jMenu3.setText("Student");

        jMenuItemaddstudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addst.png"))); // NOI18N
        jMenuItemaddstudent.setText("Add");
        jMenuItemaddstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemaddstudentActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemaddstudent);

        jMenuItemManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Manage.png"))); // NOI18N
        jMenuItemManage.setText("Manage");
        jMenuItemManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManageActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemManage);

        jMenuBarmainform.add(jMenu3);

        jMenucourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/course.png"))); // NOI18N
        jMenucourse.setText("Course");

        jMenuItemaddc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/courseadd.png"))); // NOI18N
        jMenuItemaddc.setText("Add");
        jMenuItemaddc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemaddcActionPerformed(evt);
            }
        });
        jMenucourse.add(jMenuItemaddc);

        jMenuItemmgc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Manage.png"))); // NOI18N
        jMenuItemmgc.setText("Manage");
        jMenuItemmgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemmgcActionPerformed(evt);
            }
        });
        jMenucourse.add(jMenuItemmgc);

        jMenuBarmainform.add(jMenucourse);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scroes.png"))); // NOI18N
        jMenu1.setText("Scores");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addscore.png"))); // NOI18N
        jMenuItem1.setText("Add");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/managescore.png"))); // NOI18N
        jMenuItem2.setText("Edit / Delete");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marksheet.png"))); // NOI18N
        jMenuItem6.setText("Show Scores");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBarmainform.add(jMenu1);

        jMenuaacount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account.png"))); // NOI18N
        jMenuaacount.setText("Account");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jMenuItem7.setText("LogOut");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenuaacount.add(jMenuItem7);

        jMenuBarmainform.add(jMenuaacount);

        setJMenuBar(jMenuBarmainform);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemaddstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemaddstudentActionPerformed
    Addstudent student=new Addstudent();
    student.setVisible(true);
    student.pack();
    student.setLocationRelativeTo(null);
    student.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    }//GEN-LAST:event_jMenuItemaddstudentActionPerformed

    private void jMenuItemManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManageActionPerformed
       ManageStudentForm mgstd=new ManageStudentForm();
    mgstd.setVisible(true);
    mgstd.pack();
    mgstd.setLocationRelativeTo(null);
    mgstd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        
    }//GEN-LAST:event_jMenuItemManageActionPerformed

    private void jMenuItemaddcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemaddcActionPerformed
      AddCourse crs=new AddCourse();
    crs.setVisible(true);
    crs.pack();
    crs.setLocationRelativeTo(null);
    crs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItemaddcActionPerformed

    private void jMenuItemmgcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemmgcActionPerformed
     ManageCourseForm mgcf=new ManageCourseForm();
    mgcf.setVisible(true);
    mgcf.pack();
    mgcf.setLocationRelativeTo(null);
    mgcf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenuItemmgcActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        addScoreForm asf=new addScoreForm();
        asf.setVisible(true);
        asf.pack();
        asf.setLocationRelativeTo(null);
        asf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         updateScore asf=new  updateScore();
        asf.setVisible(true);
        asf.pack();
        asf.setLocationRelativeTo(null);
        asf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
     showAllScores sas=new   showAllScores();
        sas.setVisible(true);
        sas.pack();
        sas.setLocationRelativeTo(null);
        sas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    this.dispose();
    LoginForm login=new LoginForm();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabelcoursecount;
    public static javax.swing.JLabel jLabelstdcount;
    public static javax.swing.JLabel jLabelwelcome;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBarmainform;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItemManage;
    private javax.swing.JMenuItem jMenuItemaddc;
    private javax.swing.JMenuItem jMenuItemaddstudent;
    private javax.swing.JMenuItem jMenuItemmgc;
    private javax.swing.JMenu jMenuaacount;
    private javax.swing.JMenu jMenucourse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
