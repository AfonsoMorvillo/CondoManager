/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author aluno
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAgendamento = new javax.swing.JMenu();
        FrmAcessoForm = new javax.swing.JMenuItem();
        FrmAcessoGrid = new javax.swing.JMenuItem();
        FrmCasaForm = new javax.swing.JMenuItem();
        FrmCasaGrid = new javax.swing.JMenuItem();
        FrmEntregaForm = new javax.swing.JMenuItem();
        FmrEntregaGrid = new javax.swing.JMenuItem();
        FrmMoradorForm = new javax.swing.JMenuItem();
        FrmMoradorGrid = new javax.swing.JMenuItem();
        FrmProprietarioForm = new javax.swing.JMenuItem();
        FrmProprietarioGrid = new javax.swing.JMenuItem();
        FrmVeiculosForm = new javax.swing.JMenuItem();
        FrmVeiculosGrid = new javax.swing.JMenuItem();
        FrmVisitanteForm = new javax.swing.JMenuItem();
        FrmVisitanteGrid = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuAgendamento.setText("Frames(teste)");

        FrmAcessoForm.setText("AcessoForm");
        FrmAcessoForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmAcessoFormActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FrmAcessoForm);

        FrmAcessoGrid.setText("AcessoGrid");
        FrmAcessoGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmAcessoGridActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FrmAcessoGrid);

        FrmCasaForm.setText("CasaForm");
        FrmCasaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmCasaFormActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FrmCasaForm);

        FrmCasaGrid.setText("CasaGrid");
        FrmCasaGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmCasaGridActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FrmCasaGrid);

        FrmEntregaForm.setText("EntregaForm");
        FrmEntregaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmEntregaFormActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FrmEntregaForm);

        FmrEntregaGrid.setText("EntregaGrid");
        FmrEntregaGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FmrEntregaGridActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FmrEntregaGrid);

        FrmMoradorForm.setText("MoradorForm");
        FrmMoradorForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmMoradorFormActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FrmMoradorForm);

        FrmMoradorGrid.setText("MoradorGrid");
        FrmMoradorGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmMoradorGridActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FrmMoradorGrid);

        FrmProprietarioForm.setText("ProprietarioForm");
        FrmProprietarioForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmProprietarioFormActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FrmProprietarioForm);

        FrmProprietarioGrid.setText("ProprietarioGrid");
        FrmProprietarioGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmProprietarioGridActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FrmProprietarioGrid);

        FrmVeiculosForm.setText("VeiculoForm");
        FrmVeiculosForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmVeiculosFormActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FrmVeiculosForm);

        FrmVeiculosGrid.setText("VeiculoGrid");
        FrmVeiculosGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmVeiculosGridActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FrmVeiculosGrid);

        FrmVisitanteForm.setText("VisitanteForm");
        FrmVisitanteForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmVisitanteFormActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FrmVisitanteForm);

        FrmVisitanteGrid.setText("VisitanteGrid");
        FrmVisitanteGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrmVisitanteGridActionPerformed(evt);
            }
        });
        jMenuAgendamento.add(FrmVisitanteGrid);

        jMenuBar1.add(jMenuAgendamento);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FrmProprietarioGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmProprietarioGridActionPerformed
  try {
        FrmProprietariosGrid FrmProprietarioGrid = new FrmProprietariosGrid(null,false, true);
        FrmProprietarioGrid.setVisible(true);
        } catch (Exception ex) {
        ex.printStackTrace();   
      }    }//GEN-LAST:event_FrmProprietarioGridActionPerformed

    private void FrmVeiculosGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmVeiculosGridActionPerformed
  try {
         FrmVeiculosGrid  FrmVeiculosGrid = new  FrmVeiculosGrid(false, true);
         FrmVeiculosGrid.setVisible(true);
        } catch (Exception ex) {
        ex.printStackTrace();   
      }    }//GEN-LAST:event_FrmVeiculosGridActionPerformed

    private void FrmVisitanteGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmVisitanteGridActionPerformed
  try {
        FrmVisitantesGrid FrmVisitanteGrid = new FrmVisitantesGrid(null,false, true);
        FrmVisitanteGrid.setVisible(true);
        } catch (Exception ex) {
        ex.printStackTrace();   
      }    }//GEN-LAST:event_FrmVisitanteGridActionPerformed

    private void FrmAcessoFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmAcessoFormActionPerformed
       try {
        FrmAcessoForm FrmAcessoForm;
        FrmAcessoForm = new FrmAcessoForm(null, true,true);
        FrmAcessoForm.setVisible(true);
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }  
    }//GEN-LAST:event_FrmAcessoFormActionPerformed

    private void FrmAcessoGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmAcessoGridActionPerformed
         try {
      
        FrmAcessosGrid AcessoGrid = new FrmAcessosGrid(false, true);
        AcessoGrid.setVisible(true);
        
        } catch (Exception ex) {
        ex.printStackTrace();   
      }
    }//GEN-LAST:event_FrmAcessoGridActionPerformed

    private void FrmCasaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmCasaFormActionPerformed
        try {
        FrmCasaForm FrmCasaForm;
        FrmCasaForm = new FrmCasaForm(null, true,true);
        FrmCasaForm.setVisible(true);
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_FrmCasaFormActionPerformed

    private void FrmCasaGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmCasaGridActionPerformed
       try {
        FrmCasasGrid FrmCasaGrid = new FrmCasasGrid(null,false, true);
        FrmCasaGrid.setVisible(true);
        } catch (Exception ex) {
        ex.printStackTrace();   
      }
    }//GEN-LAST:event_FrmCasaGridActionPerformed

    private void FrmEntregaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmEntregaFormActionPerformed
          try {
        FrmAcessoForm FrmAcessoForm;
        FrmAcessoForm = new FrmAcessoForm(null, true,true);
        FrmAcessoForm.setVisible(true);
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }  
    }//GEN-LAST:event_FrmEntregaFormActionPerformed

    private void FmrEntregaGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FmrEntregaGridActionPerformed
         try {
        FrmEntregasGrid FrmEntregasGrid = new FrmEntregasGrid(false, true);
        FrmEntregasGrid.setVisible(true);
        } catch (Exception ex) {
        ex.printStackTrace();   
      }
    }//GEN-LAST:event_FmrEntregaGridActionPerformed

    private void FrmMoradorFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmMoradorFormActionPerformed
         try {
        FrmMoradorForm FrmMoradorForm;
        FrmMoradorForm = new FrmMoradorForm(null, true,true);
        FrmMoradorForm.setVisible(true);
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }  
    }//GEN-LAST:event_FrmMoradorFormActionPerformed

    private void FrmMoradorGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmMoradorGridActionPerformed
          try {
        FrmMoradoresGrid FrmMoradorGrid = new FrmMoradoresGrid(false, true);
        FrmMoradorGrid.setVisible(true);
        } catch (Exception ex) {
        ex.printStackTrace();   
      }
    }//GEN-LAST:event_FrmMoradorGridActionPerformed

    private void FrmProprietarioFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmProprietarioFormActionPerformed
        try {
        FrmProprietarioForm FrmProprietarioForm;
        FrmProprietarioForm = new FrmProprietarioForm(null, true,true);
        FrmProprietarioForm.setVisible(true);
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }  
    }//GEN-LAST:event_FrmProprietarioFormActionPerformed

    private void FrmVeiculosFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmVeiculosFormActionPerformed
        try {
         FrmVeiculoForm  FrmVeiculoForm;
         FrmVeiculoForm = new  FrmVeiculoForm(null, true,true);
         FrmVeiculoForm.setVisible(true);
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }  
    }//GEN-LAST:event_FrmVeiculosFormActionPerformed

    private void FrmVisitanteFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrmVisitanteFormActionPerformed
         try {
        FrmVisitanteForm FrmVisitanteForm;
        FrmVisitanteForm = new FrmVisitanteForm(null, true,true);
        FrmVisitanteForm.setVisible(true);
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }  
    }//GEN-LAST:event_FrmVisitanteFormActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem FmrEntregaGrid;
    private javax.swing.JMenuItem FrmAcessoForm;
    private javax.swing.JMenuItem FrmAcessoGrid;
    private javax.swing.JMenuItem FrmCasaForm;
    private javax.swing.JMenuItem FrmCasaGrid;
    private javax.swing.JMenuItem FrmEntregaForm;
    private javax.swing.JMenuItem FrmMoradorForm;
    private javax.swing.JMenuItem FrmMoradorGrid;
    private javax.swing.JMenuItem FrmProprietarioForm;
    private javax.swing.JMenuItem FrmProprietarioGrid;
    private javax.swing.JMenuItem FrmVeiculosForm;
    private javax.swing.JMenuItem FrmVeiculosGrid;
    private javax.swing.JMenuItem FrmVisitanteForm;
    private javax.swing.JMenuItem FrmVisitanteGrid;
    private javax.swing.JMenu jMenuAgendamento;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
