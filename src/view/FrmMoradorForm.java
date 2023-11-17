/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.WindowEvent;
import java.sql.SQLException;

import model.Casa;
import model.Morador;
import utils.StringUtils;

/**
 * @author Afonso
 */
public class FrmMoradorForm extends javax.swing.JFrame {

   private Morador morador;
   private boolean disconnectOnClose;
   private boolean formEdicao;

   private Casa    casa;

   public FrmMoradorForm( Morador morador, boolean disconnectOnClose, boolean formEdicao ) throws SQLException, Exception {
      initComponents();
      fieldCasa.setEditable( false );
      fieldCasa.setFocusable( false );

      formataCampos();
      this.formEdicao = formEdicao;

      if( this.formEdicao ){
         // this.jTextFieldCpf.setEnabled( false );
      }
      else{
         this.btnSalvar.setText( "Incluir" );
      }

      if( morador == null ){
         this.morador = new Morador();
      }
      else{
         this.morador = morador;

         if( this.morador.getCasa() != null ){
            this.casa = new Casa();
            this.casa.setNumero( morador.getCasa().getNumero() );
            this.casa.load();
         }

         fillFields();
      }
      this.disconnectOnClose = disconnectOnClose;
   }


   private void formataCampos() {
      // fieldNome.setDocument( new FormataTextInput( 50, FormataTextInput.TipoEntrada.NOME ) );
      // fieldEmail.setDocument( new FormataTextInput( 50, FormataTextInput.TipoEntrada.EMAIL ) );

   }


   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
    */
   @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldCasa = new utils.TextField();
        btnConsultaCasa = new utils.CMButton();
        fieldEmail = new utils.TextField();
        fieldDataNascimento = new utils.TextField();
        fieldNome = new utils.TextField();
        btnSalvar = new utils.CMButton();
        fieldRG = new utils.TextField();
        fieldCpf = new utils.TextField();
        fieldCelular = new utils.TextField();
        fieldTelefone = new utils.TextField();
        fieldInicioMoradia = new utils.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        fieldCasa.setLabelText("Casa");

        btnConsultaCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pesquisa.png"))); // NOI18N
        btnConsultaCasa.setRadius(25);
        btnConsultaCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaCasaActionPerformed(evt);
            }
        });

        fieldEmail.setLabelText("E-mail");

        fieldDataNascimento.setLabelText("Data de Nascimento");

        fieldNome.setLabelText("Nome");

        btnSalvar.setText("Salvar");
        btnSalvar.setRadius(25);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        fieldRG.setLabelText("RG");
        fieldRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRGActionPerformed(evt);
            }
        });

        fieldCpf.setLabelText("CPF");

        fieldCelular.setLabelText("Celular");

        fieldTelefone.setLabelText("Telefone");

        fieldInicioMoradia.setLabelText("Início Moradia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldCasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(fieldInicioMoradia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(fieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(fieldCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 33, Short.MAX_VALUE)
                .addComponent(btnConsultaCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultaCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldInicioMoradia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaCasaActionPerformed
        // TODO add your handling code here:
          try{

         if( casa == null ){
            casa = new Casa();
         }

         FrmCasasGrid consultaCasas;
         consultaCasas = new FrmCasasGrid( casa, true, false );

         consultaCasas.addWindowListener( new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed( java.awt.event.WindowEvent evt ) {
               if( casa.getNumero() > 0 ){
                  fieldCasa.setText( String.valueOf( casa.getNumero() ) );
               }
            }
         } );

         consultaCasas.setVisible( true );
      }
      catch( Exception ex ){
         ex.printStackTrace();
         casa = null;
      }
    }//GEN-LAST:event_btnConsultaCasaActionPerformed


   private void btnSalvarActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnSalvarActionPerformed

      try{
         dataDown();
         morador.save();
         this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING ) );
      }
      catch( Exception e ){
         e.printStackTrace();
      }
   }// GEN-LAST:event_btnSalvarActionPerformed


   private void fieldRGActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_fieldRGActionPerformed
      // TODO add your handling code here:
   }// GEN-LAST:event_fieldRGActionPerformed


   private void fillFields() {

      if( casa.getNumero() > 0 ){
         fieldCasa.setText( String.valueOf( casa.getNumero() ) );
      }
      fieldCelular.setText( morador.getCelular() );
      fieldEmail.setText( morador.getEmail() );
      fieldCpf.setText( morador.getCpf() );
      fieldDataNascimento.setText( StringUtils.dataParaTela( morador.getDataNascimento() ) );
      fieldInicioMoradia.setText( StringUtils.dataParaTela( morador.getInicioMoradia() ) );
      fieldNome.setText( morador.getNome() );
      fieldRG.setText( morador.getRg() );
      fieldTelefone.setText( morador.getTelefone() );

   }


   private void dataDown() throws Exception {

      morador.setCasa( casa );
      morador.setCelular( fieldCelular.getText() );
      morador.setEmail( fieldEmail.getText() );
      morador.setCpf( fieldCpf.getText() );
      morador.setDataNascimento( StringUtils.dataParaBanco( fieldDataNascimento.getText() ) );
      morador.setInicioMoradia( StringUtils.dataParaBanco( fieldInicioMoradia.getText() ) );
      morador.setNome( fieldNome.getText() );
      morador.setRg( fieldRG.getText() );
      morador.setTelefone( fieldTelefone.getText() );
   }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.CMButton btnConsultaCasa;
    private utils.CMButton btnSalvar;
    private utils.TextField fieldCasa;
    private utils.TextField fieldCelular;
    private utils.TextField fieldCpf;
    private utils.TextField fieldDataNascimento;
    private utils.TextField fieldEmail;
    private utils.TextField fieldInicioMoradia;
    private utils.TextField fieldNome;
    private utils.TextField fieldRG;
    private utils.TextField fieldTelefone;
    // End of variables declaration//GEN-END:variables
}
