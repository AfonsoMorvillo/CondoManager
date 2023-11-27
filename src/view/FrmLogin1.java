/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.KeyEvent;

/**
 * @author aluno
 */
public class FrmLogin1 extends javax.swing.JFrame {

   /**
    * Creates new form FrmLogin
    */
   public FrmLogin1() {
      initComponents();
   }


   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
    */
   @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonLogin = new javax.swing.JButton();
        IconUser = new javax.swing.JLabel();
        IconPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/template.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        jTextFieldUser.setBackground(new java.awt.Color(153, 204, 255));
        jTextFieldUser.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldUser.setText("Digite seu usuário");
        jTextFieldUser.setBorder(null);
        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUser);
        jTextFieldUser.setBounds(90, 160, 240, 20);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 1));
        jSeparator1.setRequestFocusEnabled(false);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(90, 250, 240, 10);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jSeparator2.setPreferredSize(new java.awt.Dimension(0, 1));
        jSeparator2.setRequestFocusEnabled(false);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(90, 183, 240, 10);

        jButtonLogin.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLogin.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Login");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin);
        jButtonLogin.setBounds(85, 272, 250, 35);

        IconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/usuario.png"))); // NOI18N
        jPanel1.add(IconUser);
        IconUser.setBounds(41, 154, 32, 32);

        IconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/senha.png"))); // NOI18N
        jPanel1.add(IconPassword);
        IconPassword.setBounds(41, 222, 32, 32);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel1.setText("User");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 140, 29, 19);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel2.setText(" Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 210, 65, 19);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LOGOCM128.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(128, 128));
        jLabel3.setMinimumSize(new java.awt.Dimension(128, 128));
        jLabel3.setPreferredSize(new java.awt.Dimension(128, 128));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 10, 130, 130);

        jButtonSair.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        jButtonSair.setText("X");
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSairMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonSair);
        jButtonSair.setBounds(403, 6, 11, 15);

        jPasswordField1.setBackground(new java.awt.Color(153, 204, 255));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(90, 230, 240, 16);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(530, 30, 400, 330);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/template_1.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 70, 460, 290);

        setSize(new java.awt.Dimension(942, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserActionPerformed


   private void jButtonSairMouseClicked( java.awt.event.MouseEvent evt ) {// GEN-FIRST:event_jButtonSairMouseClicked
      // TODO add your handling code here:
      dispose();
   }// GEN-LAST:event_jButtonSairMouseClicked


   private void jButtonLoginActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_jButtonLoginActionPerformed
      // TODO add your handling code here:
   }// GEN-LAST:event_jButtonLoginActionPerformed


   /**
    * @param args
    *           the command line arguments
    */
   public static void main( String args[] ) {
      /* Set the Nimbus look and feel */
      // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /*
       * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel. For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
       */
      try{
         for( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() ){
            if( "Nimbus".equals( info.getName() ) ){
               javax.swing.UIManager.setLookAndFeel( info.getClassName() );
               break;
            }
         }
      }
      catch( ClassNotFoundException ex ){
         java.util.logging.Logger.getLogger(FrmLogin1.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( InstantiationException ex ){
         java.util.logging.Logger.getLogger(FrmLogin1.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( IllegalAccessException ex ){
         java.util.logging.Logger.getLogger(FrmLogin1.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( javax.swing.UnsupportedLookAndFeelException ex ){
         java.util.logging.Logger.getLogger(FrmLogin1.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      // </editor-fold>
      // </editor-fold>
      // </editor-fold>
      // </editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new FrmLogin1().setVisible( true );
         }
      } );
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconPassword;
    private javax.swing.JLabel IconUser;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
