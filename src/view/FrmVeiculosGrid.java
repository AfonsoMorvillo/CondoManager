/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.SQLException;

import controller.LogTracker;
import controller.ResultSetTableModel;
import model.Casa;
import model.Veiculos;
import utils.Select;
import utils.StringUtils;

/**
 * @author aluno
 */
public class FrmVeiculosGrid extends javax.swing.JFrame {

   private Veiculos            data;
   private boolean             select;
   private boolean             disconnectOnClose;

   private ResultSetTableModel result;

   private Casa                casa;

   public FrmVeiculosGrid( boolean select, boolean disconnectOnClose ) throws SQLException {
      initComponents();

      this.select = select;
      // jButtonSelecionar.setEnabled( this.select );
      this.disconnectOnClose = disconnectOnClose;

      result = new ResultSetTableModel( getSelect() );

      jTableVeiculos.setModel( result );
   }


   @SuppressWarnings( "unchecked" )
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      btnEditar = new design.CMButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTableVeiculos = new javax.swing.JTable();
      btnAdicionar = new design.CMButton();
      btnExcluir = new design.CMButton();
      jPanel1 = new javax.swing.JPanel();
      btnLimparCasa = new javax.swing.JButton();
      fieldCasa = new design.TextField();
      btnSelecionarCasa = new design.CMButton();
      btnBuscar = new design.CMButton();
      btnLimpar = new design.CMButton();
      fieldPlaca = new design.TextField();

      setDefaultCloseOperation( javax.swing.WindowConstants.DISPOSE_ON_CLOSE );
      setTitle( "Consulta de Veículos" );
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

      jTableVeiculos.setModel( new javax.swing.table.DefaultTableModel( new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" } ) );
      jScrollPane1.setViewportView( jTableVeiculos );

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

      jPanel1.setBorder( javax.swing.BorderFactory.createTitledBorder( "Filtros" ) );
      jPanel1.setLayout( null );

      btnLimparCasa.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/excluirLinha.png" ) ) ); // NOI18N
      btnLimparCasa.setContentAreaFilled( false );
      btnLimparCasa.setCursor( new java.awt.Cursor( java.awt.Cursor.DEFAULT_CURSOR ) );
      btnLimparCasa.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnLimparCasaActionPerformed( evt );
         }
      } );
      jPanel1.add( btnLimparCasa );
      btnLimparCasa.setBounds( 240, 56, 30, 16 );

      fieldCasa.setEditable( false );
      fieldCasa.setFocusable( false );
      fieldCasa.setLabelText( "Casa" );
      jPanel1.add( fieldCasa );
      fieldCasa.setBounds( 30, 43, 238, 41 );

      btnSelecionarCasa.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/pesquisa.png" ) ) ); // NOI18N
      btnSelecionarCasa.setRadius( 25 );
      btnSelecionarCasa.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnSelecionarCasaActionPerformed( evt );
         }
      } );
      jPanel1.add( btnSelecionarCasa );
      btnSelecionarCasa.setBounds( 280, 43, 40, 41 );

      btnBuscar.setText( "Buscar" );
      btnBuscar.setRadius( 15 );
      btnBuscar.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnBuscarActionPerformed( evt );
         }
      } );
      jPanel1.add( btnBuscar );
      btnBuscar.setBounds( 1020, 40, 72, 41 );

      btnLimpar.setText( "Limpar" );
      btnLimpar.setRadius( 15 );
      btnLimpar.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnLimparActionPerformed( evt );
         }
      } );
      jPanel1.add( btnLimpar );
      btnLimpar.setBounds( 930, 40, 72, 40 );

      fieldPlaca.setLabelText( "Placa" );
      jPanel1.add( fieldPlaca );
      fieldPlaca.setBounds( 350, 43, 190, 41 );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
      getContentPane().setLayout( layout );
      layout.setHorizontalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addContainerGap().addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addComponent( jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE ).addContainerGap() ).addGroup( layout.createSequentialGroup().addComponent( btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 18, 18, 18 ).addComponent( btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 18, 18, 18 ).addComponent( btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 420, 1000, Short.MAX_VALUE ) ) ) ).addGroup( layout.createSequentialGroup().addGap( 55, 55, 55 ).addComponent( jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 0, 0, Short.MAX_VALUE ) ) );
      layout.setVerticalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addContainerGap( 14, Short.MAX_VALUE ).addComponent( jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 18, 18, 18 ).addComponent( jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.UNRELATED ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) ).addGap( 7, 7, 7 ) ) );

      pack();
      setLocationRelativeTo( null );
   }// </editor-fold>//GEN-END:initComponents


   private void btnLimparCasaActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnLimparCasaActionPerformed
      casa = null;
      fieldCasa.setText( "" );
            
   }// GEN-LAST:event_btnLimparCasaActionPerformed


   private void btnSelecionarCasaActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnSelecionarCasaActionPerformed
      try{

         if( casa == null ){
            casa = new Casa();
         }

         FrmCasasGrid casasConsulta;
         casasConsulta = new FrmCasasGrid( casa, true, false );

         casasConsulta.addWindowListener( new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed( java.awt.event.WindowEvent evt ) {
               if( casa.getNumero() > 0 ){
                  fieldCasa.setText( String.valueOf( casa.getNumero() ) );
               }
            }
         } );

         casasConsulta.setVisible( true );
      }
      catch( Exception ex ){
         LogTracker.getInstance().addException( ex, true, this );
         casa = null;
      }
   }// GEN-LAST:event_btnSelecionarCasaActionPerformed


   private void btnBuscarActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnBuscarActionPerformed
      try{
         result.setQuery( getSelect() );

      }
      catch( Exception ex ){
         LogTracker.getInstance().addException( ex, true, this );
      }
   }// GEN-LAST:event_btnBuscarActionPerformed


   private void btnLimparActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnLimparActionPerformed
      casa = null;
      fieldCasa.setText( "" );
      fieldPlaca.setText( "" );
      try{
         result.setQuery( getSelect() );

      }
      catch( Exception ex ){
         LogTracker.getInstance().addException( ex, true, this );
      }
   }// GEN-LAST:event_btnLimparActionPerformed


   private void formWindowClosing( java.awt.event.WindowEvent evt ) {// GEN-FIRST:event_formWindowClosing
      if( this.disconnectOnClose ){
         result.disconnectFromDatabase();
      }

   }// GEN-LAST:event_formWindowClosing


   private void btnEditarActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnEditarActionPerformed

      int linhaSelecionada = jTableVeiculos.getSelectedRow();

      if( linhaSelecionada != -1 ){

         String placa = (String)result.getValueAt( linhaSelecionada, 0 );

         data = new Veiculos();

         data.setPlacaCarro( placa );

         try{
            data.load();
            System.out.println( data );
            FrmVeiculoForm crud = new FrmVeiculoForm( data, false, true );
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

      FrmVeiculoForm formularioVeiculo;

      try{
         formularioVeiculo = new FrmVeiculoForm( null, false, false );

         formularioVeiculo.setVisible( true );
         // ATUALIZAR APENAS SE HOUVE ALTERACAO/EDICAO

         formularioVeiculo.addWindowListener( new java.awt.event.WindowAdapter() {
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
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }// GEN-LAST:event_btnAdicionarActionPerformed


   private void btnExcluirActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnExcluirActionPerformed
      int linhaSelecionada = jTableVeiculos.getSelectedRow();
      if( linhaSelecionada != -1 ){
         System.out.println( "Excluir" );
         data = new Veiculos();
         String numero = (String)result.getValueAt( linhaSelecionada, 0 );
         data.setPlacaCarro( numero );
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
   }// GEN-LAST:event_btnExcluirActionPerformed


   private String getSelect() {
      Select select = new Select( "Veículos" );

      select.add( "placaCarro", "Placa" );
      select.add( "modelo", "Nome" );
      select.add( "marca", "Email" );
      select.add( "tipo", "Tipo" );
      select.add( "cor", "Cor" );
      select.add( "ano", "Ano" );
      select.add( "casa", "Casa" );
      
      if( casa != null ){
         select.addWhere( "casa = " + casa.getNumero() );
      }

      if( !StringUtils.isEmpty( fieldPlaca.getText().trim() ) ){
         select.addWhere( "placaCarro LIKE '%" + fieldPlaca.getText().trim() + "%'" );
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
         java.util.logging.Logger.getLogger( FrmVeiculosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( InstantiationException ex ){
         java.util.logging.Logger.getLogger( FrmVeiculosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( IllegalAccessException ex ){
         java.util.logging.Logger.getLogger( FrmVeiculosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( javax.swing.UnsupportedLookAndFeelException ex ){
         java.util.logging.Logger.getLogger( FrmVeiculosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      // </editor-fold>
      // </editor-fold>
      // </editor-fold>
      // </editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater( new Runnable() {
         public void run() {
            try{
               new FrmVeiculosGrid( false, true ).setVisible( true );
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
   private design.CMButton         btnSelecionarCasa;
   private design.TextField        fieldCasa;
   private design.TextField        fieldPlaca;
   private javax.swing.JPanel      jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable      jTableVeiculos;
   // End of variables declaration//GEN-END:variables
}
