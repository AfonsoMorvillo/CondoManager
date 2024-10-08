/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.WindowEvent;
import java.sql.SQLException;

import controller.LogTracker;
import model.Casa;
import model.Proprietario;
import utils.FormataTextInput;
import utils.StringUtils;

/**
 * @author Afonso
 */
public class FrmCasaForm extends javax.swing.JFrame {

   private Casa         casa;
   private boolean      disconnectOnClose;
   private boolean      formEdicao;

   private Proprietario proprietario;

   public FrmCasaForm( Casa casa, boolean disconnectOnClose, boolean formEdicao ) throws SQLException, Exception {
      initComponents();

      formataCampos();
      fieldProprietario.setEditable( false );

      this.formEdicao = formEdicao;

      if( this.formEdicao ){
         // this.jTextFieldCpf.setEnabled( false );
      }
      else{
         this.btnSalvar.setText( "Incluir" );
      }

      if( casa == null ){
         this.casa = new Casa();
      }
      else{
         this.casa = casa;

         if( this.casa.getProprietario() != null ){
            this.proprietario = new Proprietario();
            this.proprietario.setIdProprietario( casa.getProprietario().getIdProprietario() );
            this.proprietario.load();
         }

         fillFields();

      }
      this.disconnectOnClose = disconnectOnClose;
   }


   private void formataCampos() {
      fieldNumero.setDocument( new FormataTextInput( 10, FormataTextInput.TipoEntrada.NUMEROINTEIRO ) );
      fieldVagas.setDocument( new FormataTextInput( 10, FormataTextInput.TipoEntrada.NUMEROINTEIRO ) );
   }


   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
    */
   @SuppressWarnings( "unchecked" )
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      fieldProprietario = new design.TextField();
      cMButton1 = new design.CMButton();
      fieldNumero = new design.TextField();
      fieldVagas = new design.TextField();
      fieldBloco = new design.TextField();
      btnSalvar = new design.CMButton();

      setDefaultCloseOperation( javax.swing.WindowConstants.DISPOSE_ON_CLOSE );

      fieldProprietario.setLabelText( "Proprietário" );

      cMButton1.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/resources/pesquisa.png" ) ) ); // NOI18N
      cMButton1.setRadius( 25 );
      cMButton1.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            cMButton1ActionPerformed( evt );
         }
      } );

      fieldNumero.setLabelText( "Número" );

      fieldVagas.setLabelText( "Vagas" );

      fieldBloco.setLabelText( "Bloco" );

      btnSalvar.setText( "Salvar" );
      btnSalvar.setRadius( 25 );
      btnSalvar.addActionListener( new java.awt.event.ActionListener() {
         public void actionPerformed( java.awt.event.ActionEvent evt ) {
            btnSalvarActionPerformed( evt );
         }
      } );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
      getContentPane().setLayout( layout );
      layout.setHorizontalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addGap( 46, 46, 46 ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE ).addGroup( layout.createSequentialGroup().addComponent( fieldProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addComponent( cMButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 18, 18, 18 ).addComponent( fieldBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 31, 31, 31 ).addComponent( fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 31, 31, 31 ).addComponent( fieldVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE ) ) ).addContainerGap( 157, Short.MAX_VALUE ) ) );
      layout.setVerticalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addGap( 40, 40, 40 ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false ).addComponent( cMButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ).addComponent( fieldProprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE ).addComponent( fieldBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( fieldVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) ) ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE ).addComponent( btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE ).addGap( 82, 82, 82 ) ) );

      pack();
      setLocationRelativeTo( null );
   }// </editor-fold>//GEN-END:initComponents


   private void btnSalvarActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnSalvarActionPerformed

      try{
         checkInput();
         dataDown();
         casa.save();
         this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING ) );
      }
      catch( Exception e ){
         LogTracker.getInstance().addException( e, true, null );
      }
   }


   private void checkInput() throws Exception {

      if( proprietario == null ){
         fieldProprietario.setError();
         fieldProprietario.requestFocus();
         throw new Exception( "Selecione um proprietário para cadastrar a casa" );
      }

      if( StringUtils.isEmpty( fieldBloco.getText().trim() ) ){
         fieldBloco.setText( "" );
         fieldBloco.setError();
         fieldBloco.requestFocus();
         throw new Exception( "Digite o bloco da casa" );
      }

      if( StringUtils.isEmpty( fieldNumero.getText().trim() ) ){
         fieldNumero.setError();
         fieldNumero.requestFocus();
         throw new Exception( "Digite o número da casa" );
      }

      if( StringUtils.isEmpty( fieldVagas.getText().trim() ) ){
         fieldVagas.setError();
         fieldVagas.requestFocus();
         throw new Exception( "Digite a quantidade de vagas" );
      }

   }


   private void fillFields() {

      fieldBloco.setText( casa.getBloco() );
      fieldNumero.setText( String.valueOf( casa.getNumero() ) );
      fieldVagas.setText( String.valueOf( casa.getVagas() ) );

      if( casa.getProprietario().getNome() != null ){
         fieldProprietario.setText( casa.getProprietario().getNome() );
      }

   }


   private void dataDown() throws Exception {

      casa.setBloco( fieldBloco.getText() );
      casa.setNumero( Integer.parseInt( fieldNumero.getText() ) );
      casa.setVagas( Integer.parseInt( fieldVagas.getText() ) );
      casa.setProprietario( proprietario );

      if( !formEdicao ){
         casa.setDataRegistro( StringUtils.getCurrentDateMySQLFormat() );
      }

   }


   private void cMButton1ActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_cMButton1ActionPerformed

      try{

         if( proprietario == null ){
            proprietario = new Proprietario();
         }

         FrmProprietariosGrid jFrameConsulta;
         jFrameConsulta = new FrmProprietariosGrid( proprietario, true, false );

         jFrameConsulta.addWindowListener( new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed( java.awt.event.WindowEvent evt ) {
               if( proprietario.getNome() != null ){
                  fieldProprietario.setText( proprietario.getNome() );
               }
            }
         } );

         jFrameConsulta.setVisible( true );
      }
      catch( Exception ex ){
         LogTracker.getInstance().addException( ex, true, this );
         proprietario = null;
      }

   }// GEN-LAST:event_cMButton1ActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private design.CMButton  btnSalvar;
   private design.CMButton  cMButton1;
   private design.TextField fieldBloco;
   private design.TextField fieldNumero;
   private design.TextField fieldProprietario;
   private design.TextField fieldVagas;
   // End of variables declaration//GEN-END:variables
}
