/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.LogTracker;
import controller.ResultSetTableModel;
import model.Proprietario;
import utils.Select;
import utils.StringUtils;

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

      jPanel1 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTableProprietarios = new javax.swing.JTable();
      jPanel2 = new javax.swing.JPanel();
      btnAdicionar = new design.CMButton();
      btnEditar = new design.CMButton();
      btnExcluir = new design.CMButton();
      jButton1 = new javax.swing.JButton();
      jPanel4 = new javax.swing.JPanel();
      btnBuscar = new design.CMButton();
      btnLimpar = new design.CMButton();
      fieldNome = new design.TextField();

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout( jPanel1 );
      jPanel1.setLayout( jPanel1Layout );
      jPanel1Layout.setHorizontalGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGap( 0, 100, Short.MAX_VALUE ) );
      jPanel1Layout.setVerticalGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGap( 0, 100, Short.MAX_VALUE ) );

      setDefaultCloseOperation( javax.swing.WindowConstants.DISPOSE_ON_CLOSE );
      setTitle( "Consulta de Proprietários" );
      setResizable( false );
      addWindowListener( new java.awt.event.WindowAdapter() {
         public void windowClosing( java.awt.event.WindowEvent evt ) {
            formWindowClosing( evt );
         }
      } );

      jTableProprietarios.setModel( new javax.swing.table.DefaultTableModel( new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" } ) );
      jScrollPane1.setViewportView( jTableProprietarios );

      jPanel2.setBorder( javax.swing.BorderFactory.createBevelBorder( javax.swing.border.BevelBorder.RAISED, new java.awt.Color( 153, 153, 153 ), new java.awt.Color( 153, 153, 153 ), new java.awt.Color( 153, 153, 153 ), new java.awt.Color( 153, 153, 153 ) ) );
      jPanel2.setLayout( null );

      btnAdicionar.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/adicionar.png" ) ) ); // NOI18N
      btnAdicionar.setToolTipText( "" );
      btnAdicionar.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnAdicionarActionPerformed( evt );
         }
      } );
      jPanel2.add( btnAdicionar );
      btnAdicionar.setBounds( 10, 5, 70, 40 );

      btnEditar.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/editar-texto.png" ) ) ); // NOI18N
      btnEditar.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnEditarActionPerformed( evt );
         }
      } );
      jPanel2.add( btnEditar );
      btnEditar.setBounds( 80, 5, 70, 40 );

      btnExcluir.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/lixeira.png" ) ) ); // NOI18N
      btnExcluir.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnExcluirActionPerformed( evt );
         }
      } );
      jPanel2.add( btnExcluir );
      btnExcluir.setBounds( 150, 5, 70, 40 );

      jButton1.setText( "selecionar" );
      jButton1.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            jButton1ActionPerformed( evt );
         }
      } );
      jPanel2.add( jButton1 );
      jButton1.setBounds( 740, 20, 83, 22 );

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

      fieldNome.setLabelText( "Nome" );
      jPanel4.add( fieldNome );
      fieldNome.setBounds( 30, 40, 300, 41 );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
      getContentPane().setLayout( layout );
      layout.setHorizontalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addContainerGap().addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1246, Short.MAX_VALUE ).addComponent( jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1246, Short.MAX_VALUE ) ) ).addGroup( layout.createSequentialGroup().addGap( 37, 37, 37 ).addComponent( jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 0, 0, Short.MAX_VALUE ) ) );
      layout.setVerticalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addGap( 19, 19, 19 ).addComponent( jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE ).addComponent( jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 18, 18, 18 ).addComponent( jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 17, 17, 17 ) ) );

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
      fieldNome.setText( "" );
      try{
         result.setQuery( getSelect() );

      }
      catch( Exception ex ){
         LogTracker.getInstance().addException( ex, true, this );
      }
   }// GEN-LAST:event_btnLimparActionPerformed


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

         data = new Proprietario();
         data.setIdProprietario( codigo );

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

         int opcao = JOptionPane.showConfirmDialog( this, "Deseja realmente excluir?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION );

         if( opcao == JOptionPane.YES_OPTION ){
            data = new Proprietario();
            int numero = (int)result.getValueAt( linhaSelecionada, 0 );
            data.setIdProprietario( numero );
            try{
               this.data.delete();

            }
            catch( Exception ex ){
               ex.printStackTrace();
            }
            finally{
               result.setQuery( getSelect() );
            }
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

      if( !StringUtils.isEmpty( fieldNome.getText().trim() ) ){
         select.addWhere( "nome LIKE '%" + fieldNome.getText().trim() + "%'" );
      }

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
   private design.CMButton         btnAdicionar;
   private design.CMButton         btnBuscar;
   private design.CMButton         btnEditar;
   private design.CMButton         btnExcluir;
   private design.CMButton         btnLimpar;
   private javax.swing.JButton     btnLimparCasa;
   private design.TextField        fieldNome;
   private javax.swing.JButton     jButton1;
   private javax.swing.JPanel      jPanel1;
   private javax.swing.JPanel      jPanel2;
   private javax.swing.JPanel      jPanel3;
   private javax.swing.JPanel      jPanel4;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable      jTableProprietarios;
   // End of variables declaration//GEN-END:variables
}
