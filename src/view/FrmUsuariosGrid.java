/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.LogTracker;
import controller.ResultSetTableModel;
import model.Usuario;
import model.Visitante;
import utils.Select;
import utils.StringUtils;

/**
 * @author aluno
 */
public class FrmUsuariosGrid extends javax.swing.JFrame {

   private Usuario             usuario;
   private boolean             select;
   private boolean             disconnectOnClose;

   private ResultSetTableModel result;

   public FrmUsuariosGrid( Usuario usuario, boolean select, boolean disconnectOnClose ) throws SQLException {
      initComponents();

      this.usuario = usuario;
      this.select = select;
      // jButtonSelecionar.setEnabled( this.select );
      this.disconnectOnClose = disconnectOnClose;

      result = new ResultSetTableModel( getSelect() );

      jTableUsuarios.setModel( result );
   }


   public void showDialog( JFrame parent ) {
      JDialog dialog = new JDialog( parent, true );
      dialog.setContentPane( this.getContentPane() );
      dialog.pack();
      dialog.setLocationRelativeTo( parent );
      dialog.setVisible( true );
   }


   private String getSelect() {
      Select select = new Select( "usuario" );

      select.add( "username", "Username" );
      select.add( "tipoUsuario", "Tipo" );

      if( !StringUtils.isEmpty( fieldUsername.getText().trim() ) ){
         select.addWhere( "username LIKE '%" + fieldUsername.getText().trim() + "%'" );
      }

      return select.build();
   }


   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
    */
   @SuppressWarnings( "unchecked" )
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel4 = new javax.swing.JPanel();
      btnBuscar = new design.CMButton();
      btnLimpar = new design.CMButton();
      fieldUsername = new design.TextField();
      btnEditar = new design.CMButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTableUsuarios = new javax.swing.JTable();
      btnAdicionar = new design.CMButton();
      btnExcluir = new design.CMButton();

      setDefaultCloseOperation( javax.swing.WindowConstants.DISPOSE_ON_CLOSE );
      setTitle( "Consulta de Visitantes" );
      setResizable( false );

      jPanel4.setBorder( javax.swing.BorderFactory.createTitledBorder( "Filtros" ) );
      jPanel4.setLayout( null );

      btnBuscar.setText( "Buscar" );
      btnBuscar.setRadius( 15 );
      btnBuscar.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnBuscarActionPerformed( evt );
         }
      } );
      jPanel4.add( btnBuscar );
      btnBuscar.setBounds( 1020, 40, 72, 41 );

      btnLimpar.setText( "Limpar" );
      btnLimpar.setRadius( 15 );
      btnLimpar.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnLimparActionPerformed( evt );
         }
      } );
      jPanel4.add( btnLimpar );
      btnLimpar.setBounds( 930, 40, 72, 40 );

      fieldUsername.setLabelText( "Nome" );
      jPanel4.add( fieldUsername );
      fieldUsername.setBounds( 30, 40, 300, 42 );

      btnEditar.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/editar-texto.png" ) ) ); // NOI18N
      btnEditar.setRadius( 25 );
      btnEditar.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnEditarActionPerformed( evt );
         }
      } );

      jTableUsuarios.setModel( new javax.swing.table.DefaultTableModel( new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" } ) );
      jScrollPane1.setViewportView( jTableUsuarios );

      btnAdicionar.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/adicionar.png" ) ) ); // NOI18N
      btnAdicionar.setRadius( 25 );
      btnAdicionar.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnAdicionarActionPerformed( evt );
         }
      } );

      btnExcluir.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/lixeira.png" ) ) ); // NOI18N
      btnExcluir.setRadius( 25 );
      btnExcluir.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnExcluirActionPerformed( evt );
         }
      } );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
      getContentPane().setLayout( layout );
      layout.setHorizontalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addContainerGap().addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addComponent( btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 18, 18, 18 ).addComponent( btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 18, 18, 18 ).addComponent( btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 240, 240, 240 ).addGap( 0, 0, Short.MAX_VALUE ) ).addComponent( jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE ) ).addContainerGap() ).addGroup( layout.createSequentialGroup().addGap( 47, 47, 47 ).addComponent( jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE ).addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) ) );
      layout.setVerticalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addGap( 28, 28, 28 ).addComponent( jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 18, 18, 18 ).addComponent( jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.UNRELATED ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) ).addGap( 14, 14, 14 ) ) );

      pack();
      setLocationRelativeTo( null );
   }// </editor-fold>//GEN-END:initComponents


   private void btnBuscarActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnBuscarActionPerformed
      try{
         result.setQuery( getSelect() );

      }
      catch( Exception ex ){
         LogTracker.getInstance().addException( ex, true, this );
      }
   }// GEN-LAST:event_btnBuscarActionPerformed


   private void btnLimparActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnLimparActionPerformed
      fieldUsername.setText( "" );
      try{
         result.setQuery( getSelect() );

      }
      catch( Exception ex ){
         LogTracker.getInstance().addException( ex, true, this );
      }
   }// GEN-LAST:event_btnLimparActionPerformed


   private void btnEditarActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnEditarActionPerformed

      int linhaSelecionada = jTableUsuarios.getSelectedRow();

      if( linhaSelecionada != -1 ){

         String username = (String)result.getValueAt( linhaSelecionada, 0 );

         usuario = new Usuario();
         usuario.setUsername( username );

         try{
            usuario.load();

            FrmUsuarioForm crud = new FrmUsuarioForm( usuario, false, true );
            crud.setVisible( true );
            crud.addWindowListener( new java.awt.event.WindowAdapter() {
               @Override
               public void windowClosed( java.awt.event.WindowEvent evt ) {
                  try{
                     System.out.println( "atualizar" );
                     result.setQuery( getSelect() );
                  }
                  catch( Exception e ){
                     e.printStackTrace();
                  }
               }
            } );

         }
         catch( Exception e ){
            e.printStackTrace();
         }
      }
   }// GEN-LAST:event_btnEditarActionPerformed


   private void btnAdicionarActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnAdicionarActionPerformed

      FrmUsuarioForm formularioUsuario;
      try{
         formularioUsuario = new FrmUsuarioForm( null, false, false );

         formularioUsuario.setVisible( true );
         // ATUALIZAR APENAS SE HOUVE ALTERACAO/EDICAO

         formularioUsuario.addWindowListener( new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed( java.awt.event.WindowEvent evt ) {
               try{
                  result.setQuery( getSelect() );
               }
               catch( Exception e ){
                  e.printStackTrace();
               }
            }
         } );

      }
      catch( Exception e ){
         e.printStackTrace();
      }
   }// GEN-LAST:event_btnAdicionarActionPerformed


   private void btnExcluirActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnExcluirActionPerformed
      int linhaSelecionada = jTableUsuarios.getSelectedRow();
      if( linhaSelecionada != -1 ){

         int opcao = JOptionPane.showConfirmDialog( this, "Deseja realmente excluir?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION );

         if( opcao == JOptionPane.YES_OPTION ){
            usuario = new Usuario();
            String username = (String)result.getValueAt( linhaSelecionada, 0 );
            usuario.setUsername( username );
            try{
               this.usuario.delete();
               result.setQuery( getSelect() );
            }
            catch( Exception ex ){
               ex.printStackTrace();
            }
         }
      }
   }// GEN-LAST:event_btnExcluirActionPerformed


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
         java.util.logging.Logger.getLogger( FrmUsuariosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( InstantiationException ex ){
         java.util.logging.Logger.getLogger( FrmUsuariosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( IllegalAccessException ex ){
         java.util.logging.Logger.getLogger( FrmUsuariosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( javax.swing.UnsupportedLookAndFeelException ex ){
         java.util.logging.Logger.getLogger( FrmUsuariosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      // </editor-fold>
      // </editor-fold>
      // </editor-fold>
      // </editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater( new Runnable() {
         public void run() {
            try{
               new FrmUsuariosGrid( null, false, true ).setVisible( true );
            }
            catch( SQLException ex ){
               Logger.getLogger( FrmUsuariosGrid.class.getName() ).log( Level.SEVERE, null, ex );
            }
         }
      } );
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private design.CMButton         btnAdicionar;
   private design.CMButton         btnBuscar;
   private design.CMButton         btnEditar;
   private design.CMButton         btnExcluir;
   private design.CMButton         btnLimpar;
   private design.TextField        fieldUsername;
   private javax.swing.JPanel      jPanel4;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable      jTableUsuarios;
   // End of variables declaration//GEN-END:variables
}
