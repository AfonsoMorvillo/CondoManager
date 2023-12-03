/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.SQLException;

import controller.LogTracker;
import controller.ResultSetTableModel;
import model.Acesso;
import model.Casa;
import model.Visitante;
import utils.FormataTextInput;
import utils.Select;
import utils.StringUtils;

/**
 * @author aluno
 */
public class FrmAcessosGrid extends javax.swing.JFrame {

   private Acesso              data;
   private boolean             select;
   private boolean             disconnectOnClose;

   private ResultSetTableModel result;

   private Casa                casa;
   private Visitante           visitante;

   public FrmAcessosGrid( boolean select, boolean disconnectOnClose ) throws SQLException {
      initComponents();

      setControles();
      this.select = select;
      // jButtonSelecionar.setEnabled( this.select );
      this.disconnectOnClose = disconnectOnClose;

      result = new ResultSetTableModel( getSelect() );

      jTableProprietarios.setModel( result );
   }


   private void setControles() {
      fieldEntrada.setDocument( new FormataTextInput( 10, FormataTextInput.TipoEntrada.DATA ) );
      fieldSaida.setDocument( new FormataTextInput( 10, FormataTextInput.TipoEntrada.DATA ) );
   }


   @SuppressWarnings( "unchecked" )
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      btnEditar = new design.CMButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTableProprietarios = new javax.swing.JTable();
      btnAdicionar = new design.CMButton();
      btnExcluir = new design.CMButton();
      jPanel1 = new javax.swing.JPanel();
      btnLimparVisitante = new javax.swing.JButton();
      btnLimparCasa1 = new javax.swing.JButton();
      fieldCasa = new design.TextField();
      fieldEntrada = new design.TextField();
      fieldSaida = new design.TextField();
      fieldVisitante = new design.TextField();
      btnSelecionarCasa = new design.CMButton();
      btnSelecionarVisitante = new design.CMButton();
      btnBuscar = new design.CMButton();
      btnLimpar = new design.CMButton();

      setDefaultCloseOperation( javax.swing.WindowConstants.DISPOSE_ON_CLOSE );
      setTitle( "Consulta de Acessos" );
      setResizable( false );
      addWindowListener( new java.awt.event.WindowAdapter() {
         public void windowClosing( java.awt.event.WindowEvent evt ) {
            formWindowClosing( evt );
         }
      } );

      btnEditar.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/editar-texto.png" ) ) ); // NOI18N
      btnEditar.setBorderColor( new java.awt.Color( 214, 217, 223 ) );
      btnEditar.setColor( new java.awt.Color( 214, 217, 223 ) );
      btnEditar.setColorOver( new java.awt.Color( 204, 204, 204 ) );
      btnEditar.setRadius( 25 );
      btnEditar.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnEditarActionPerformed( evt );
         }
      } );

      jTableProprietarios.setModel( new javax.swing.table.DefaultTableModel( new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" } ) );
      jScrollPane1.setViewportView( jTableProprietarios );

      btnAdicionar.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/adicionar.png" ) ) ); // NOI18N
      btnAdicionar.setBorderColor( new java.awt.Color( 214, 217, 223 ) );
      btnAdicionar.setColor( new java.awt.Color( 214, 217, 223 ) );
      btnAdicionar.setColorClick( new java.awt.Color( 214, 217, 223 ) );
      btnAdicionar.setColorOver( new java.awt.Color( 204, 204, 204 ) );
      btnAdicionar.setRadius( 25 );
      btnAdicionar.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnAdicionarActionPerformed( evt );
         }
      } );

      btnExcluir.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/lixeira.png" ) ) ); // NOI18N
      btnExcluir.setBorderColor( new java.awt.Color( 214, 217, 223 ) );
      btnExcluir.setColor( new java.awt.Color( 214, 217, 223 ) );
      btnExcluir.setRadius( 25 );
      btnExcluir.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnExcluirActionPerformed( evt );
         }
      } );

      jPanel1.setBorder( javax.swing.BorderFactory.createTitledBorder( "Filtros" ) );
      jPanel1.setLayout( null );

      btnLimparVisitante.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/excluirLinha.png" ) ) ); // NOI18N
      btnLimparVisitante.setContentAreaFilled( false );
      btnLimparVisitante.setCursor( new java.awt.Cursor( java.awt.Cursor.DEFAULT_CURSOR ) );
      btnLimparVisitante.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnLimparVisitanteActionPerformed( evt );
         }
      } );
      jPanel1.add( btnLimparVisitante );
      btnLimparVisitante.setBounds( 550, 56, 30, 16 );

      btnLimparCasa1.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/excluirLinha.png" ) ) ); // NOI18N
      btnLimparCasa1.setContentAreaFilled( false );
      btnLimparCasa1.setCursor( new java.awt.Cursor( java.awt.Cursor.DEFAULT_CURSOR ) );
      btnLimparCasa1.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnLimparCasa1ActionPerformed( evt );
         }
      } );
      jPanel1.add( btnLimparCasa1 );
      btnLimparCasa1.setBounds( 240, 56, 30, 16 );

      fieldCasa.setEditable( false );
      fieldCasa.setFocusable( false );
      fieldCasa.setLabelText( "Casa" );
      jPanel1.add( fieldCasa );
      fieldCasa.setBounds( 30, 43, 238, 41 );

      fieldEntrada.setLabelText( "Entrada" );
      jPanel1.add( fieldEntrada );
      fieldEntrada.setBounds( 658, 43, 85, 41 );

      fieldSaida.setLabelText( "Saída" );
      jPanel1.add( fieldSaida );
      fieldSaida.setBounds( 786, 43, 85, 41 );

      fieldVisitante.setEditable( false );
      fieldVisitante.setFocusable( false );
      fieldVisitante.setLabelText( "Visitante" );
      jPanel1.add( fieldVisitante );
      fieldVisitante.setBounds( 350, 43, 227, 41 );

      btnSelecionarCasa.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/pesquisa.png" ) ) ); // NOI18N
      btnSelecionarCasa.setRadius( 25 );
      btnSelecionarCasa.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnSelecionarCasaActionPerformed( evt );
         }
      } );
      jPanel1.add( btnSelecionarCasa );
      btnSelecionarCasa.setBounds( 280, 43, 40, 41 );

      btnSelecionarVisitante.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/pesquisa.png" ) ) ); // NOI18N
      btnSelecionarVisitante.setRadius( 25 );
      btnSelecionarVisitante.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnSelecionarVisitanteActionPerformed( evt );
         }
      } );
      jPanel1.add( btnSelecionarVisitante );
      btnSelecionarVisitante.setBounds( 589, 43, 40, 41 );

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

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
      getContentPane().setLayout( layout );
      layout.setHorizontalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addGap( 28, 28, 28 ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE ).addGroup( layout.createSequentialGroup().addComponent( btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 18, 18, 18 ).addComponent( btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 18, 18, 18 ).addComponent( btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE ) ) ).addContainerGap( 18, Short.MAX_VALUE ) ) );
      layout.setVerticalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addContainerGap( 53, Short.MAX_VALUE ).addComponent( jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE ).addComponent( jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 18, 18, 18 ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) ).addGap( 17, 17, 17 ) ) );

      pack();
      setLocationRelativeTo( null );
   }// </editor-fold>//GEN-END:initComponents


   private void btnLimparActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnLimparActionPerformed
      fieldVisitante.setText( "" );
      visitante = null;
      fieldCasa.setText( "" );
      casa = null;
      fieldEntrada.setText( "" );
      fieldSaida.setText( "" );
      try{
         result.setQuery( getSelect() );

      }
      catch( Exception ex ){
         LogTracker.getInstance().addException( ex, true, this );
      }
   }// GEN-LAST:event_btnLimparActionPerformed


   private void btnLimparVisitanteActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnLimparVisitanteActionPerformed
      fieldVisitante.setText( "" );
      visitante = null;
   }// GEN-LAST:event_btnLimparVisitanteActionPerformed


   private void btnLimparCasa1ActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnLimparCasa1ActionPerformed
      fieldCasa.setText( "" );
      casa = null;
   }// GEN-LAST:event_btnLimparCasa1ActionPerformed


   private void btnBuscarActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnBuscarActionPerformed
      // TODO add your handling code here:
      try{
         result.setQuery( getSelect() );

      }
      catch( Exception ex ){
         LogTracker.getInstance().addException( ex, true, this );
      }
   }// GEN-LAST:event_btnBuscarActionPerformed


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


   private void btnSelecionarVisitanteActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnSelecionarVisitanteActionPerformed
      try{

         if( visitante == null ){
            visitante = new Visitante();
         }

         FrmVisitantesGrid consultaVisitantes;
         consultaVisitantes = new FrmVisitantesGrid( visitante, true, false );

         consultaVisitantes.addWindowListener( new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed( java.awt.event.WindowEvent evt ) {
               if( visitante.getNome() != null ){
                  fieldVisitante.setText( visitante.getNome() );
               }
            }
         } );

         consultaVisitantes.setVisible( true );
      }
      catch( Exception ex ){
         LogTracker.getInstance().addException( ex, true, this );
         visitante = null;
      }
   }// GEN-LAST:event_btnSelecionarVisitanteActionPerformed


   private void formWindowClosing( java.awt.event.WindowEvent evt ) {// GEN-FIRST:event_formWindowClosing
      if( this.disconnectOnClose ){
         result.disconnectFromDatabase();
      }

   }// GEN-LAST:event_formWindowClosing


   private void btnEditarActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnEditarActionPerformed

      int linhaSelecionada = jTableProprietarios.getSelectedRow();

      if( linhaSelecionada != -1 ){

         int id = (Integer)result.getValueAt( linhaSelecionada, 0 );

         data = new Acesso();

         data.setIdAcesso( id );

         try{
            data.load();
            System.out.println( data );
            FrmAcessoForm crud = new FrmAcessoForm( data, false, true );
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

      FrmAcessoForm formularioAcesso;

      try{
         formularioAcesso = new FrmAcessoForm( null, false, false );

         formularioAcesso.setVisible( true );
         // ATUALIZAR APENAS SE HOUVE ALTERACAO/EDICAO

         formularioAcesso.addWindowListener( new java.awt.event.WindowAdapter() {
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
      int linhaSelecionada = jTableProprietarios.getSelectedRow();
      if( linhaSelecionada != -1 ){
         System.out.println( "Excluir" );
         data = new Acesso();
         int numero = (int)result.getValueAt( linhaSelecionada, 0 );
         data.setIdAcesso( numero );
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


   private String getSelect() {
      Select select = new Select( "Acesso a " );

      select.add( "a.idAcesso", "ID" );
      select.add( "a.entrada", "Entrada" );
      select.add( "a.saida", "Saída" );
      select.add( "c.numero", "Casa" );
      select.add( "v.nome", "Visitante" );

      select.addLeftJoin( "Casa c", "c.numero = casa" );
      select.addLeftJoin( "Visitantes v", "v.idVisitante = visitante" );

      if( casa != null ){
         select.addWhere( "a.casa = " + casa.getNumero() );
      }

      if( visitante != null ){
         select.addWhere( "a.visitante = " + visitante.getIdVisitante() );
      }

      if( !StringUtils.isEmpty( fieldEntrada.getText().trim() ) ){
         select.addWhere( "a.entrada = '" + StringUtils.dataParaBanco( fieldEntrada.getText().trim() ) + "'" );
      }

      if( !StringUtils.isEmpty( fieldSaida.getText().trim() ) ){
         select.addWhere( "a.saida = '" + StringUtils.dataParaBanco( fieldSaida.getText().trim() ) + "'" );
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
         java.util.logging.Logger.getLogger( FrmAcessosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( InstantiationException ex ){
         java.util.logging.Logger.getLogger( FrmAcessosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( IllegalAccessException ex ){
         java.util.logging.Logger.getLogger( FrmAcessosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      catch( javax.swing.UnsupportedLookAndFeelException ex ){
         java.util.logging.Logger.getLogger( FrmAcessosGrid.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
      }
      // </editor-fold>
      // </editor-fold>
      // </editor-fold>
      // </editor-fold>
      // </editor-fold>
      // </editor-fold>
      // </editor-fold>
      // </editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater( new Runnable() {
         public void run() {
            try{
               new FrmAcessosGrid( false, true ).setVisible( true );
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
   private javax.swing.JButton     btnLimparCasa1;
   private javax.swing.JButton     btnLimparVisitante;
   private design.CMButton         btnSelecionarCasa;
   private design.CMButton         btnSelecionarVisitante;
   private design.TextField        fieldCasa;
   private design.TextField        fieldEntrada;
   private design.TextField        fieldSaida;
   private design.TextField        fieldVisitante;
   private javax.swing.JPanel      jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable      jTableProprietarios;
   // End of variables declaration//GEN-END:variables
}
