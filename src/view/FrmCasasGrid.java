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

import controller.ResultSetTableModel;
import model.Casa;
import utils.Select;

/**
 * @author aluno
 */
public class FrmCasasGrid extends javax.swing.JFrame {

	private Casa casa;
	private boolean select;
	private boolean disconnectOnClose;

	private ResultSetTableModel result;

	public FrmCasasGrid(Casa casa, boolean select, boolean disconnectOnClose) throws SQLException {
		initComponents();

		this.casa = casa;
		this.select = select;
		// jButtonSelecionar.setEnabled( this.select );
		this.disconnectOnClose = disconnectOnClose;

		result = new ResultSetTableModel(getSelect());

		jTableCasas.setModel(result);
	}

	public void showDialog(JFrame parent) {
		JDialog dialog = new JDialog(parent, true);
		dialog.setContentPane(this.getContentPane());
		dialog.pack();
		dialog.setLocationRelativeTo(parent);
		dialog.setVisible(true);
	}

	private String getSelect() {
		Select select = new Select("Casa c");

		select.add("numero", "Número");
		select.add("bloco", "Bloco");
		select.add("nome", "Proprietário");
		select.add("p.idProprietario", "ID");
		select.add("dataRegistro", "Registro");
		select.add("vagas", "Vagas");
		select.addLeftJoin("Proprietario p", "p.idProprietario = c.idProprietario");

		return select.build();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		btnEditar = new utils.CMButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTableCasas = new javax.swing.JTable();
		btnAdicionar = new utils.CMButton();
		btnExcluir = new utils.CMButton();
		btnSelecionar = new utils.CMButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Consulta de Casas");
		setResizable(false);

		btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/editar-texto.png"))); // NOI18N
		btnEditar.setRadius(25);
		btnEditar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnEditarActionPerformed(evt);
			}
		});

		jTableCasas
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTableCasas);

		btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/adicionar.png"))); // NOI18N
		btnAdicionar.setRadius(25);
		btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAdicionarActionPerformed(evt);
			}
		});

		btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lixeira.png"))); // NOI18N
		btnExcluir.setRadius(25);
		btnExcluir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExcluirActionPerformed(evt);
			}
		});

		btnSelecionar.setText("Selecionar");
		btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSelecionarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(240, 240, 240)
										.addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 113,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
								.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(90, 90, 90)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEditarActionPerformed

		int linhaSelecionada = jTableCasas.getSelectedRow();

		if (linhaSelecionada != -1) {

			int numero = (int) result.getValueAt(linhaSelecionada, 0);

			casa = new Casa();
			casa.setNumero(numero);

			try {
				casa.load();

				FrmCasaForm crud = new FrmCasaForm(casa, false, true);
				crud.setVisible(true);
				crud.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosed(java.awt.event.WindowEvent evt) {
						try {
							System.out.println("atualizar");
							result.setQuery(getSelect());
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// GEN-LAST:event_btnEditarActionPerformed

	private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAdicionarActionPerformed

		FrmCasaForm formularioCasa;
		try {
			formularioCasa = new FrmCasaForm(null, false, false);

			formularioCasa.setVisible(true);
			// ATUALIZAR APENAS SE HOUVE ALTERACAO/EDICAO

			formularioCasa.addWindowListener(new java.awt.event.WindowAdapter() {
				@Override
				public void windowClosed(java.awt.event.WindowEvent evt) {
					try {
						// result.setQuery( getSelect() );
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}// GEN-LAST:event_btnAdicionarActionPerformed

	private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcluirActionPerformed
		int linhaSelecionada = jTableCasas.getSelectedRow();
		if (linhaSelecionada != -1) {
			System.out.println("Excluir");
			casa = new Casa();
			int numero = (int) result.getValueAt(linhaSelecionada, 0);
			casa.setNumero(numero);
			try {
				this.casa.delete();

			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				result.setQuery(getSelect());
			}
		}
	}// GEN-LAST:event_btnExcluirActionPerformed

	private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSelecionarActionPerformed
		// TODO add your handling code here:
		int row = jTableCasas.getSelectedRow();
		if (row != -1) {

			System.out.println("Selecionar");

			int codigo = (int) result.getValueAt(row, 0);

			this.casa.setNumero(codigo);

			try {
				this.casa.load();
				this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
	}// GEN-LAST:event_btnSelecionarActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FrmCasasGrid.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrmCasasGrid.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrmCasasGrid.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrmCasasGrid.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new FrmCasasGrid(null, false, true).setVisible(true);
				} catch (SQLException ex) {
					Logger.getLogger(FrmCasasGrid.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private utils.CMButton btnAdicionar;
	private utils.CMButton btnEditar;
	private utils.CMButton btnExcluir;
	private utils.CMButton btnSelecionar;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTableCasas;
	// End of variables declaration//GEN-END:variables
}
