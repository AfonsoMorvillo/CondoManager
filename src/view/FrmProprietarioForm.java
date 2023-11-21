/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.LogTracker;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

import model.Proprietario;
import utils.FormataTextInput;
import utils.StringUtils;

/**
 * @author Afonso
 */
public class FrmProprietarioForm extends javax.swing.JFrame {

   private Proprietario data;
   private boolean      disconnectOnClose;
   private boolean      formEdicao;

   public FrmProprietarioForm( Proprietario data, boolean disconnectOnClose, boolean formEdicao ) {
      initComponents();

      this.formEdicao = formEdicao;

      // jTextFieldNome.setDocument( new FormataTextInput( 10, FormataTextInput.TipoEntrada.NOME ) );
      setFormatoCampos();

      if( this.formEdicao ){
         // this.jTextFieldCpf.setEnabled( false );
      }
      else{
         this.btnSalvar.setText( "Incluir" );
      }

      if( data == null ){
         this.data = new Proprietario();
      }
      else{
         this.data = data;
         fillFields();
      }
      this.disconnectOnClose = disconnectOnClose;
   }


   private void setFormatoCampos() {
      fieldNome.setDocument( new FormataTextInput( 50, FormataTextInput.TipoEntrada.NOME ) );
      fieldEmail.setDocument( new FormataTextInput( 50, FormataTextInput.TipoEntrada.EMAIL ) );

   }
   private void checkInput () throws Exception {
        if (!fieldTelefone.getText().trim().matches("(\\+\\d{2,})?\\(\\d{2}\\)\\d{4,5}-\\d{4}")) {
            JOptionPane.showMessageDialog(null, "“O telefone deve estar no formato '(XX) XXXX-XXXX' ou '(XX) XXXXXXXXX'.", "Erro", JOptionPane.ERROR_MESSAGE);
            throw new Exception("erro");
        }
         if (!fieldCpf.getText().trim().matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")) {
        JOptionPane.showMessageDialog(null, "O cpf deve estr no formato XXX.XXX.XXX-XX.", "Erro", JOptionPane.ERROR_MESSAGE);
        throw new Exception("erro");
       }
         if (!fieldRg.getText().trim().matches("\\d{2}.\\d{3}.\\d{3}.\\d{1}")) {
        JOptionPane.showMessageDialog(null, "O rg deve estr no formato XX.XXX.XXX-X.", "Erro", JOptionPane.ERROR_MESSAGE);
        throw new Exception("erro");
       }
       if (!fieldDataNascimento.getText().trim().matches("\\d{4}-\\d{2}-\\d{2}")) {
        JOptionPane.showMessageDialog(null, "A Data de Nascimento deve estar no formato AAAA-MM-DD.", "Erro", JOptionPane.ERROR_MESSAGE);
        throw new Exception("erro");
    }
   }


   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
    */
   @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldNome = new utils.TextField();
        fieldCpf = new utils.TextField();
        fieldDataNascimento = new utils.TextField();
        fieldEmail = new utils.TextField();
        fieldRg = new utils.TextField();
        fieldTelefone = new utils.TextField();
        btnSalvar = new utils.CMButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fieldNome.setLabelText("Nome");

        fieldCpf.setLabelText("CPF");

        fieldDataNascimento.setLabelText("Data de Nascimento");

        fieldEmail.setLabelText("E-mail");

        fieldRg.setLabelText("RG");

        fieldTelefone.setLabelText("Telefone");

        btnSalvar.setText("Salvar");
        btnSalvar.setRadius(25);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(fieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldRg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(49, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


   private void btnSalvarActionPerformed( java.awt.event.ActionEvent evt ) {// GEN-FIRST:event_btnSalvarActionPerformed
      try{
         checkInput();
         dataDown();
         data.save();
         this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING ) );
      }
      catch( Exception e ){
         LogTracker.getInstance().addException(e,true,null);
      }
   }// GEN-LAST:event_btnSalvarActionPerformed


   private void fillFields() {

      fieldNome.setText( data.getNome() );
      fieldEmail.setText( data.getEmail() );
      fieldCpf.setText( data.getCpf() );
      fieldRg.setText( data.getRg() );
      fieldTelefone.setText( data.getTelefone() );
      fieldDataNascimento.setText( StringUtils.dataParaTela( data.getDataNascimento() ) );
   }


   private void dataDown() {

      data.setNome( fieldNome.getText() );
      data.setEmail( fieldEmail.getText() );
      data.setCpf( fieldCpf.getText() );
      data.setRg( fieldRg.getText() );
      data.setDataNascimento( StringUtils.dataParaBanco( fieldDataNascimento.getText() ) );
      data.setTelefone( fieldTelefone.getText() );
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.CMButton btnSalvar;
    private utils.TextField fieldCpf;
    private utils.TextField fieldDataNascimento;
    private utils.TextField fieldEmail;
    private utils.TextField fieldNome;
    private utils.TextField fieldRg;
    private utils.TextField fieldTelefone;
    // End of variables declaration//GEN-END:variables
}
