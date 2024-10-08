/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.WindowEvent;
import java.sql.SQLException;

import controller.LogTracker;
import model.Casa;
import model.Entrega;
import utils.FormataTextInput;
import utils.RegexUtils;
import utils.StringUtils;

/**
 * @author Afonso
 */
public class FrmEntregaForm extends javax.swing.JFrame {

   private boolean disconnectOnClose;
   private Entrega entrega;
   private boolean formEdicao;

   private Casa    casa;

   public FrmEntregaForm( Entrega entrega, boolean disconnectOnClose, boolean formEdicao ) throws SQLException, Exception {
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

      if( entrega == null ){
         this.entrega = new Entrega();
      }
      else{
         this.entrega = entrega;

         if( this.entrega.getCasa() != null ){
            this.casa = new Casa();
            this.casa.setNumero( this.entrega.getCasa().getNumero() );
            this.casa.load();
         }

         fillFields();
      }
      this.disconnectOnClose = disconnectOnClose;
   }


   private void formataCampos() {
      // fieldNome.setDocument( new FormataTextInput( 50, FormataTextInput.TipoEntrada.NOME ) );
      // fieldEmail.setDocument( new FormataTextInput( 50, FormataTextInput.TipoEntrada.EMAIL ) );

      fieldEntrega.setDocument( new FormataTextInput( 10, FormataTextInput.TipoEntrada.DATA ) );
      fieldRetirada.setDocument( new FormataTextInput( 10, FormataTextInput.TipoEntrada.DATA ) );

      fieldHorarioEntrega.setDocument( new FormataTextInput( 5, FormataTextInput.TipoEntrada.HORA ) );
      fieldHorarioRetirada.setDocument( new FormataTextInput( 5, FormataTextInput.TipoEntrada.HORA ) );
   }


   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
    */
   @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldCasa = new design.TextField();
        btnSelecionarCasa = new design.CMButton();
        fieldEntregador = new design.TextField();
        fieldRetirada = new design.TextField();
        btnSalvar = new design.CMButton();
        fieldHorarioRetirada = new design.TextField();
        fieldEntrega = new design.TextField();
        fieldHorarioEntrega = new design.TextField();
        fieldObservacao = new design.TextField();
        cbStatus = new design.Combobox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Veículos");

        fieldCasa.setLabelText("Casa");

        btnSelecionarCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pesquisa.png"))); // NOI18N
        btnSelecionarCasa.setRadius(25);
        btnSelecionarCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarCasaActionPerformed(evt);
            }
        });

        fieldEntregador.setLabelText("Nome entregador");

        fieldRetirada.setLabelText("Data retirada");

        btnSalvar.setText("Salvar");
        btnSalvar.setRadius(25);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        fieldHorarioRetirada.setLabelText("Horário retirada");

        fieldEntrega.setLabelText("Data entrega");

        fieldHorarioEntrega.setLabelText("Horário entrega");

        fieldObservacao.setLabelText("Observação");

        cbStatus.setBackground(new java.awt.Color(214, 217, 223));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Entregue", "Retirado" }));
        cbStatus.setSelectedIndex(-1);
        cbStatus.setLabeText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSelecionarCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldHorarioEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldEntregador, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldHorarioRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionarCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldEntregador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldHorarioEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldHorarioRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
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
         LogTracker.getInstance().addException( ex, true, null );
         casa = null;
      }
   }// GEN-LAST:event_btnSelecionarCasaActionPerformed


   private void btnSalvarActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnSalvarActionPerformed

      try{
         checkInput();
         dataDown();
         entrega.save();
         this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING ) );
      }
      catch( Exception e ){
         LogTracker.getInstance().addException( e, true, null );

      }
   }// GEN-LAST:event_btnSalvarActionPerformed


   private void checkInput() throws Exception {

      if( casa == null ){
         fieldCasa.setError();
         fieldCasa.requestFocus();
         throw new Exception( "Selecione uma casa para cadastrar a entrega" );
      }

      if( StringUtils.isEmpty( fieldEntregador.getText().trim() ) ){
         fieldEntregador.setText( "" );
         fieldEntregador.setError();
         fieldEntregador.requestFocus();
         throw new Exception( "Digite o nome do entregador" );
      }

      if( !fieldEntrega.getText().matches( RegexUtils.DATA ) ){
         fieldEntrega.setError();
         fieldEntrega.requestFocus();
         throw new Exception( "Data para entrega inválida, deve estar no formato '##/##/####'" );
      }

      if( !fieldHorarioEntrega.getText().matches( RegexUtils.HORA ) ){
         fieldHorarioEntrega.setError();
         fieldHorarioEntrega.requestFocus();
         throw new Exception( "Hora para entrega inválida, deve estar no formato 'MM:ss'" );
      }

      if( !StringUtils.isEmpty( fieldRetirada.getText() ) && !fieldRetirada.getText().matches( RegexUtils.DATA ) ){
         fieldRetirada.setError();
         fieldRetirada.requestFocus();
         throw new Exception( "Data para retirada inválida, deve estar no formato '##/##/####'" );
      }

      if( !StringUtils.isEmpty( fieldHorarioRetirada.getText() ) && !fieldHorarioEntrega.getText().matches( RegexUtils.HORA ) ){
         fieldHorarioRetirada.setError();
         fieldHorarioRetirada.requestFocus();
         throw new Exception( "Hora para retirada inválida, deve estar no formato 'MM:ss'" );
      }

   }


   private void fillFields() {

      if( entrega.getCasa().getNumero() > 0 ){
         fieldCasa.setText( String.valueOf( entrega.getCasa().getNumero() ) );
      }
      fieldEntregador.setText( entrega.getNomeEntregador() );
      fieldEntrega.setText( StringUtils.dataParaTela( entrega.getEntrega() ) );
      fieldHorarioEntrega.setText( StringUtils.horarioParaTela( entrega.getHorario_entrega() ) );
      fieldObservacao.setText( entrega.getObservacao() );

      if( entrega.getStatus().equals( "Entregue" ) ){
         cbStatus.setSelectedIndex( 0 );
      }
      else{
         cbStatus.setSelectedIndex( 1 );
      }

      if( !StringUtils.isEmpty( entrega.getRetirada() ) ){

         fieldRetirada.setText( StringUtils.dataParaTela( entrega.getRetirada() ) );
      }

      if( !StringUtils.isEmpty( entrega.getHorario_retirada() ) ){

         fieldHorarioRetirada.setText( entrega.getHorario_retirada() );

      }

   }


   private void dataDown() throws Exception {

      entrega.setCasa( casa );
      entrega.setNomeEntregador( fieldEntregador.getText() );
      entrega.setEntrega( StringUtils.dataParaBanco( fieldEntrega.getText() ) );
      entrega.setHorario_entrega( fieldHorarioEntrega.getText() );
      entrega.setRetirada( StringUtils.dataParaBanco( fieldRetirada.getText() ) );
      entrega.setHorario_retirada( fieldHorarioRetirada.getText() );
      entrega.setStatus( cbStatus.getSelectedItem().toString() );
      entrega.setObservacao( fieldObservacao.getText() );

   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private design.CMButton btnSalvar;
    private design.CMButton btnSelecionarCasa;
    private design.Combobox cbStatus;
    private design.TextField fieldCasa;
    private design.TextField fieldEntrega;
    private design.TextField fieldEntregador;
    private design.TextField fieldHorarioEntrega;
    private design.TextField fieldHorarioRetirada;
    private design.TextField fieldObservacao;
    private design.TextField fieldRetirada;
    // End of variables declaration//GEN-END:variables
}
