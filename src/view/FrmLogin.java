/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.LogTracker;
import java.awt.Color;
import model.Usuario;
import utils.StringUtils;

/**
 * @author aluno
 */
public class FrmLogin extends javax.swing.JFrame {

   private Usuario usuario;

   public FrmLogin() {
      initComponents();
      textField1.setBackground(new Color(255,255,255));
      logout();
   }


   private void logout() {
      usuario = new Usuario();
   }


   private void login() {
      
        FrmMenuNovo menu = new FrmMenuNovo(usuario);
        menu.setVisible(true);
        
        dispose();
        
   }


   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
    */
   @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IconUser = new javax.swing.JLabel();
        IconPassword = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JLabel();
        btnLogin = new design.CMButton();
        textField1 = new design.TextField();
        fieldSenha = new design.PasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        IconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/usuario.png"))); // NOI18N
        jPanel1.add(IconUser);
        IconUser.setBounds(40, 110, 32, 32);

        IconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/senha.png"))); // NOI18N
        jPanel1.add(IconPassword);
        IconPassword.setBounds(40, 180, 32, 32);

        jButtonSair.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(51, 51, 51));
        jButtonSair.setText("X");
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSairMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonSair);
        jButtonSair.setBounds(350, 10, 12, 15);

        btnLogin.setBackground(new java.awt.Color(102, 51, 0));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Entrar");
        btnLogin.setBorderColor(new java.awt.Color(102, 51, 0));
        btnLogin.setColor(new java.awt.Color(102, 51, 0));
        btnLogin.setColorClick(new java.awt.Color(110, 55, 0));
        btnLogin.setColorOver(new java.awt.Color(84, 42, 1));
        btnLogin.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        btnLogin.setRadius(10);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(90, 250, 240, 35);

        textField1.setLabelText("Usuário");
        textField1.setLineColor(new java.awt.Color(140, 70, 1));
        textField1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        textField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(textField1);
        textField1.setBounds(90, 100, 240, 40);

        fieldSenha.setLabelText("Senha");
        fieldSenha.setLineColor(new java.awt.Color(140, 70, 1));
        fieldSenha.setSelectionColor(new java.awt.Color(204, 204, 204));
        fieldSenha.setShowAndHide(true);
        jPanel1.add(fieldSenha);
        fieldSenha.setBounds(90, 170, 240, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(160, 0, 370, 330);

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LOGOCM128.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(128, 128));
        jLabel3.setMinimumSize(new java.awt.Dimension(128, 128));
        jLabel3.setPreferredSize(new java.awt.Dimension(128, 128));
        jPanel2.add(jLabel3, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 160, 330);

        setSize(new java.awt.Dimension(529, 330));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


   private void btnLoginActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnLoginActionPerformed

      try{

         usuario.setUsername( textField1.getText() );
         
         if (StringUtils.isEmpty( fieldSenha.getText().trim())) {
        	 throw new Exception( "Digite a senha!" );
         }

         if( !usuario.load() ){
               throw new Exception( "Username não cadastrado!" );
         }

         Usuario comparePassword = new Usuario();

         comparePassword.setUsername( textField1.getText() );
         comparePassword.setSenha( fieldSenha.getText() );

         if( usuario.getSenha().equals( comparePassword.getSenha() ) ){
            login();
            usuario.disconnectFromDatabase();
         }
         else{
            throw new Exception( "Senha Inválida!" );
         }

      }
      catch( Exception ex ){
         LogTracker.getInstance().addException( ex, true, this );
      }
   }// GEN-LAST:event_btnLoginActionPerformed


   private void jButtonSairMouseClicked( java.awt.event.MouseEvent evt ) {// GEN-FIRST:event_jButtonSairMouseClicked
      // TODO add your handling code here:
	   System.exit(0);
   }// GEN-LAST:event_jButtonSairMouseClicked


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
         java.util.logging.Logger.getLogger( FrmLogin.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( InstantiationException ex ){
         java.util.logging.Logger.getLogger( FrmLogin.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( IllegalAccessException ex ){
         java.util.logging.Logger.getLogger( FrmLogin.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( javax.swing.UnsupportedLookAndFeelException ex ){
         java.util.logging.Logger.getLogger( FrmLogin.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      // </editor-fold>
      // </editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater( new Runnable() {
         public void run() {
            new FrmLogin().setVisible( true );
         }
      } );
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconPassword;
    private javax.swing.JLabel IconUser;
    private design.CMButton btnLogin;
    private design.PasswordField fieldSenha;
    private javax.swing.JLabel jButtonSair;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private design.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
