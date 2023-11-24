/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.WindowEvent;
import java.sql.SQLException;

import controller.ResultSetTableModel;
import model.Proprietario;
import utils.Select;

/**
 * @author aluno
 */
public class FrmProprietariosGrid extends javax.swing.JFrame {

   private Proprietario        data;
   private boolean             select;
   private boolean             disconnectOnClose;

   private ResultSetTableModel result;

   public FrmProprietariosGrid( Proprietario data, boolean select, boolean disconnectOnClose ) throws SQLException {
      initComponents();

      this.select = select;
      this.data = data;
      // jButtonSelecionar.setEnabled( this.select );
      this.disconnectOnClose = disconnectOnClose;

      result = new ResultSetTableModel( getSelect() );

      jTableProprietarios.setModel( result );
   }


   @SuppressWarnings( "unchecked" )
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      btnEditar = new utils.CMButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTableProprietarios = new javax.swing.JTable();
      btnAdicionar = new utils.CMButton();
      btnExcluir = new utils.CMButton();
      jButton1 = new javax.swing.JButton();

      setDefaultCloseOperation( javax.swing.WindowConstants.DISPOSE_ON_CLOSE );
      setTitle( "Consulta de Proprietários" );
      setResizable( false );
      addWindowListener( new java.awt.event.WindowAdapter() {
         public void windowClosing( java.awt.event.WindowEvent evt ) {
            formWindowClosing( evt );
         }
      } );

      btnEditar.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/editar-texto.png" ) ) ); // NOI18N
      btnEditar.setRadius( 25 );
      btnEditar.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnEditarActionPerformed( evt );
         }
      } );

      jTableProprietarios.setModel( new javax.swing.table.DefaultTableModel( new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" } ) );
      jScrollPane1.setViewportView( jTableProprietarios );

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

      jButton1.setText( "selecionar" );
      jButton1.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            jButton1ActionPerformed( evt );
         }
      } );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
      getContentPane().setLayout( layout );
      layout.setHorizontalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addContainerGap().addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addComponent( jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE ).addContainerGap() ).addGroup( layout.createSequentialGroup().addComponent( btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 18, 18, 18 ).addComponent( btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 18, 18, 18 ).addComponent( btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ).addComponent( jButton1 ).addGap( 420, 420, 420 ) ) ) ) );
      layout.setVerticalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addGap( 90, 90, 90 ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( jButton1 ) ).addGap( 12, 12, 12 ).addComponent( jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE ).addContainerGap() ) );

      pack();
      setLocationRelativeTo( null );
   }// </editor-fold>//GEN-END:initComponents


   private void jButton1ActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_jButton1ActionPerformed
      // TODO add your handling code here:
      int row = jTableProprietarios.getSelectedRow();
      if( row != -1 ){

         System.out.println( "Selecionar" );

         int codigo = (int)result.getValueAt( row, 0 );

         this.data.setIdProprietario( codigo );

         try{
            this.data.load();
            this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING ) );
         }
         catch( Exception ex ){
            ex.printStackTrace();
         }

      }
   }// GEN-LAST:event_jButton1ActionPerformed


   private void formWindowClosing( java.awt.event.WindowEvent evt ) {// GEN-FIRST:event_formWindowClosing
      if( this.disconnectOnClose ){
         result.disconnectFromDatabase();
      }

   }// GEN-LAST:event_formWindowClosing


   private void btnEditarActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnEditarActionPerformed

      int linhaSelecionada = jTableProprietarios.getSelectedRow();

      if( linhaSelecionada != -1 ){

         int codigo = (int)result.getValueAt( linhaSelecionada, 0 );
         
         data  = new Proprietario();
         data.setIdProprietario(codigo);

         try{
            data.load();
            
            FrmProprietarioForm crud = new FrmProprietarioForm( data, false, true );
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

      FrmProprietarioForm formularioProprietario;
      formularioProprietario = new FrmProprietarioForm( null, false, false );
      formularioProprietario.setVisible( true );
      // ATUALIZAR APENAS SE HOUVE ALTERACAO/EDICAO

      formularioProprietario.addWindowListener( new java.awt.event.WindowAdapter() {
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
   }// GEN-LAST:event_btnAdicionarActionPerformed


   private void btnExcluirActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnExcluirActionPerformed
       int linhaSelecionada = jTableProprietarios.getSelectedRow();
       if( linhaSelecionada != -1 ){
            System.out.println("Excluir");
            data = new Proprietario();
            int numero = (int)result.getValueAt( linhaSelecionada, 0 );
            data.setIdProprietario(numero);
        try {
         this.data.delete();
         
        } catch (Exception ex){
          ex.printStackTrace();
        }
        finally {
        	 result.setQuery( getSelect() );
        }
       }
   }// GEN-LAST:event_btnExcluirActionPerformed


   private String getSelect() {
      Select select = new Select( "Proprietario" );

      select.add( "idProprietario", "ID" );
      select.add( "nome", "Nome" );
      select.add( "email", "Email" );
      select.add( "dataNascimento", "Nascimento" );
      select.add( "cpf", "CPF" );
      select.add( "rg", "RG" );
      select.add( "telefone", "Telefone" );

      return select.build();
   }


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
         java.util.logging.Logger.getLogger( FrmProprietariosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( InstantiationException ex ){
         java.util.logging.Logger.getLogger( FrmProprietariosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( IllegalAccessException ex ){
         java.util.logging.Logger.getLogger( FrmProprietariosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( javax.swing.UnsupportedLookAndFeelException ex ){
         java.util.logging.Logger.getLogger( FrmProprietariosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      // </editor-fold>
      // </editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater( new Runnable() {
         public void run() {
            try{
               new FrmProprietariosGrid( null, false, true ).setVisible( true );
            }
            catch( SQLException e ){
               e.printStackTrace();
            }
         }
      } );
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private utils.CMButton          btnAdicionar;
   private utils.CMButton          btnEditar;
   private utils.CMButton          btnExcluir;
   private javax.swing.JButton     jButton1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable      jTableProprietarios;
   // End of variables declaration//GEN-END:variables
}
