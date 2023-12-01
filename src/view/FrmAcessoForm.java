/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.LogTracker;
import model.Acesso;
import model.Casa;
import model.Visitante;
import utils.FormataTextInput;
import utils.RegexUtils;
import utils.StringUtils;

/**
 * @author Afonso
 */
public class FrmAcessoForm extends javax.swing.JFrame {

   private Acesso    acesso;
   private boolean   disconnectOnClose;
   private boolean   formEdicao;

   private Casa      casa;
   private Visitante visitante;

   public FrmAcessoForm( Acesso acesso, boolean disconnectOnClose, boolean formEdicao ) throws SQLException, Exception {
      initComponents();
      fieldCasa.setEditable( false );

      formataCampos();
      this.formEdicao = formEdicao;

      if( this.formEdicao ){
         // this.jTextFieldCpf.setEnabled( false );
      }
      else{
         this.btnSalvar.setText( "Incluir" );
      }

      if( acesso == null ){
         this.acesso = new Acesso();
      }
      else{
         this.acesso = acesso;

         if( this.acesso.getCasa() != null ){
            this.casa = new Casa();
            this.casa.setNumero( this.acesso.getCasa().getNumero() );
            this.casa.load();
         }

         if( this.acesso.getVisitante() != null ){
            this.visitante = new Visitante();
            this.visitante.setIdVisitante( this.acesso.getVisitante().getIdVisitante() );
            this.visitante.load();
         }

         fillFields();
      }
      this.disconnectOnClose = disconnectOnClose;
   }


   private void formataCampos() {
      // fieldNome.setDocument( new FormataTextInput( 50,
      // FormataTextInput.TipoEntrada.NOME ) );
      // fieldEmail.setDocument( new FormataTextInput( 50,
      // FormataTextInput.TipoEntrada.EMAIL ) );
      fieldEntrada.setDocument( new FormataTextInput( 10, FormataTextInput.TipoEntrada.DATA ) );
      fieldSaida.setDocument( new FormataTextInput( 10, FormataTextInput.TipoEntrada.DATA ) );
   }


   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
    */
   @SuppressWarnings( "unchecked" )
   // <editor-fold defaultstate="collapsed" desc="Generated
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      fieldCasa = new utils.TextField();
      btnSelecionarCasa = new utils.CMButton();
      fieldEntrada = new utils.TextField();
      fieldSaida = new utils.TextField();
      btnSalvar = new utils.CMButton();
      btnSelecionarVisitante = new utils.CMButton();
      fieldVisitante = new utils.TextField();

      setDefaultCloseOperation( javax.swing.WindowConstants.DISPOSE_ON_CLOSE );
      setTitle( "Cadastro Veículos" );

      fieldCasa.setLabelText( "Casa" );

      btnSelecionarCasa.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/pesquisa.png" ) ) ); // NOI18N
      btnSelecionarCasa.setRadius( 25 );
      btnSelecionarCasa.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnSelecionarCasaActionPerformed( evt );
         }
      } );

      fieldEntrada.setLabelText( "Entrada" );

      fieldSaida.setLabelText( "Saída" );

      btnSalvar.setText( "Salvar" );
      btnSalvar.setRadius( 25 );
      btnSalvar.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnSalvarActionPerformed( evt );
         }
      } );

      btnSelecionarVisitante.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/pesquisa.png" ) ) ); // NOI18N
      btnSelecionarVisitante.setRadius( 25 );
      btnSelecionarVisitante.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnSelecionarVisitanteActionPerformed( evt );
         }
      } );

      fieldVisitante.setLabelText( "Visitante" );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
      getContentPane().setLayout( layout );
      layout.setHorizontalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addGap( 46, 46, 46 ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE ).addGroup( layout.createSequentialGroup().addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false ).addGroup( layout.createSequentialGroup().addComponent( fieldEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ).addGap( 85, 85, 85 ) ).addGroup( layout.createSequentialGroup().addComponent( fieldCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.UNRELATED ).addComponent( btnSelecionarCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 33, 33, 33 ) ) ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false ).addComponent( fieldVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE ).addComponent( fieldSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) ).addGap( 18, 18, 18 ).addComponent( btnSelecionarVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE ) ) ).addContainerGap( 28, Short.MAX_VALUE ) ) );
      layout.setVerticalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addGap( 40, 40, 40 ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( fieldCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( btnSelecionarCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( fieldVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( btnSelecionarVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE ) ).addGap( 37, 37, 37 ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE ).addComponent( fieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( fieldSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) ).addGap( 198, 198, 198 ).addComponent( btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE ) ) );

      pack();
      setLocationRelativeTo( null );
   }// </editor-fold>//GEN-END:initComponents


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
         ex.printStackTrace();
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
         ex.printStackTrace();
         visitante = null;
      }
   }// GEN-LAST:event_btnSelecionarVisitanteActionPerformed


   private void btnSalvarActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnSalvarActionPerformed

      try{
         checkInput();
         dataDown();
         acesso.save();
         this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING ) );
      }
      catch( Exception e ){
         LogTracker.getInstance().addException( e, true, null );
      }
   }// GEN-LAST:event_btnSalvarActionPerformed


   private void checkInput() throws Exception {

      if( casa == null ){
         JOptionPane.showMessageDialog( null, "Selecione uma casa para cadastrar a visita", "Erro", JOptionPane.ERROR_MESSAGE );
         fieldCasa.setError();
         fieldCasa.requestFocus();
         throw new Exception( "erro" );
      }

      if( visitante == null ){
         JOptionPane.showMessageDialog( null, "Selecione um visitante para cadastrar a visita", "Erro", JOptionPane.ERROR_MESSAGE );
         fieldVisitante.setError();
         fieldVisitante.requestFocus();
         throw new Exception( "erro" );
      }

      if( !fieldEntrada.getText().matches( RegexUtils.DATA ) ){
         JOptionPane.showMessageDialog( null, "Data para entrada inválida, deve estar no formato '##/##/####'", "Erro", JOptionPane.ERROR_MESSAGE );
         fieldEntrada.setError();
         fieldEntrada.requestFocus();
         throw new Exception( "erro" );
      }

      if( !StringUtils.isEmpty( fieldSaida.getText() ) && !fieldSaida.getText().matches( RegexUtils.DATA ) ){
         JOptionPane.showMessageDialog( null, "Data para saída inválida, deve estar no formato '##/##/####'", "Erro", JOptionPane.ERROR_MESSAGE );
         fieldSaida.setError();
         fieldSaida.requestFocus();
         throw new Exception( "erro" );
      }

   }


   private void fillFields() {

      fieldEntrada.setText( acesso.getEntrada() );

      if( !StringUtils.isEmpty( acesso.getSaida() ) ){
         fieldSaida.setText( StringUtils.dataParaTela( acesso.getSaida() ) );
      }

      if( acesso.getCasa().getNumero() > 0 ){
         fieldCasa.setText( String.valueOf( acesso.getCasa().getNumero() ) );
      }

      if( acesso.getVisitante().getNome() != null ){
         fieldVisitante.setText( acesso.getVisitante().getNome() );
      }

   }


   private void dataDown() throws Exception {

      acesso.setEntrada( StringUtils.dataParaBanco( fieldEntrada.getText() ) );
      acesso.setSaida( StringUtils.dataParaBanco( fieldSaida.getText() ) );

      acesso.setCasa( casa );
      acesso.setVisitante( visitante );

   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private utils.CMButton  btnSalvar;
   private utils.CMButton  btnSelecionarCasa;
   private utils.CMButton  btnSelecionarVisitante;
   private utils.TextField fieldCasa;
   private utils.TextField fieldEntrada;
   private utils.TextField fieldSaida;
   private utils.TextField fieldVisitante;
   // End of variables declaration//GEN-END:variables
}
