/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagementSystem;

import ConnectionProvider.ConnectionProvider;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


/**
 *
 * @author bair7
 */
public class StudentResultPage extends javax.swing.JFrame {

    /**
     * Creates new form StudentResultPage
     */
  
    public StudentResultPage() {
        initComponents();
    }
    public StudentResultPage(String RollNo){
        initComponents();
        jTextField1.setText(RollNo);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 560));
        setMinimumSize(new java.awt.Dimension(700, 560));
        setPreferredSize(new java.awt.Dimension(700, 560));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Roll No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 90, -1));

        jLabel2.setText("name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel3.setText("gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel4.setText("course");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel5.setText("fathersname");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jLabel6.setText("branch");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 90, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 90, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 100, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 100, -1));

        jLabel7.setText("Total mark");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel8.setText("pass mark");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel9.setText("Obtained mark");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jLabel10.setText("maths");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel11.setText("chemistry");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel12.setText("physics");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel13.setText("sustainable");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel15.setText("100");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, 20));

        jLabel16.setText("100");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jLabel17.setText("100");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        jLabel18.setText("30");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, 10));

        jLabel19.setText("30");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jLabel20.setText("30");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        jLabel21.setText("30");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 230, 70, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 280, 70, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 330, 70, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 380, 70, -1));

        jLabel22.setText("100");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jLabel23.setText("Total");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 80, -1));

        jLabel24.setText("verdict");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 460, 80, -1));

        jButton1.setText("logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        jLabel14.setMaximumSize(new java.awt.Dimension(1232, 670));
        jLabel14.setMinimumSize(new java.awt.Dimension(1232, 670));
        jLabel14.setPreferredSize(new java.awt.Dimension(1232, 670));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
          String RollNo =jTextField1.getText();
          

            try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.prepareStatement("create", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                
            ResultSet rs = st.executeQuery("SELECT * FROM Student INNER JOIN result WHERE Student.RollNo='"+RollNo+"' AND result.RollNo='"+RollNo+"'");
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "Entered RollNo doesn't exist");
            }
            else{
                
                jTextField4.setText(rs.getString(1));
                jTextField5.setText(rs.getString(3));
                jTextField2.setText(rs.getString(4));
                jTextField6.setText(rs.getString(5));
                jTextField3.setText(rs.getString(6));
                
                
                jTextField7.setText(rs.getString(8));
                jTextField8.setText(rs.getString(9));
                jTextField9.setText(rs.getString(10));
                
                jTextField10.setText(rs.getString(11));
                jTextField11.setText(rs.getString(12));
                
                jTextField1.setEditable(false);
                jTextField4.setEditable(false);
                jTextField5.setEditable(false);
                jTextField2.setEditable(false);
                jTextField6.setEditable(false);
                jTextField3.setEditable(false);
                
                jTextField7.setEditable(false);
                jTextField8.setEditable(false);
                jTextField9.setEditable(false);
                
                jTextField10.setEditable(false);
                jTextField11.setEditable(false);
                jTextField12.setEditable(false);
                
               
                
                int m1 = Integer.parseInt(rs.getString(7));
                int m2 = Integer.parseInt(rs.getString(8));
                int m3 = Integer.parseInt(rs.getString(9));
                int m4 = Integer.parseInt(rs.getString(10));
                
                
                if(m1<30 || m2<30 || m3<30 || m4<30){
                    jTextField12.setText("Fail");
                }
                else{
                    jTextField12.setText("Pass");
                }
                
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int flag=JOptionPane.showConfirmDialog(null,"Do you want to exit","submit",JOptionPane.YES_NO_OPTION);
        if(flag==0){
            setVisible(false);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
