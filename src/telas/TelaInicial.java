/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.JOptionPane;
import teligamagrao.Pessoa;
/**
 *
 * @author ArthurCyrilloGeiger
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        telaInicial = new javax.swing.JLabel();
        saldoDisponivel = new javax.swing.JLabel();
        exibirSaldo = new javax.swing.JTextField();
        addDespesa = new javax.swing.JButton();
        addGanhos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historico = new javax.swing.JTextPane();
        voltarTelaLogin = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        telaInicial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        telaInicial.setText("Tela inicial");

        saldoDisponivel.setText("Saldo Disponível:");

        exibirSaldo.setEditable(false);
        exibirSaldo.setAutoscrolls(false);
        exibirSaldo.setRequestFocusEnabled(false);
        exibirSaldo.setVerifyInputWhenFocusTarget(false);
        exibirSaldo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                exibirSaldoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        addDespesa.setText("+ despesas");
        addDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDespesaActionPerformed(evt);
            }
        });

        addGanhos.setText("+ ganhos");
        addGanhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGanhosActionPerformed(evt);
            }
        });

        historico.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                historicoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(historico);

        voltarTelaLogin.setText("< Voltar para a tela de login");
        voltarTelaLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarTelaLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saldoDisponivel)
                    .addComponent(telaInicial))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addDespesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(addGanhos))
                            .addComponent(exibirSaldo))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarTelaLogin)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telaInicial)
                    .addComponent(voltarTelaLogin))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saldoDisponivel)
                    .addComponent(exibirSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDespesa)
                    .addComponent(addGanhos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        addDespesa.getAccessibleContext().setAccessibleName("+ Despesas");
        addGanhos.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDespesaActionPerformed
        AdicionarDespesa addDespesa = new AdicionarDespesa();
        this.dispose();
        addDespesa.setVisible(true);
    }//GEN-LAST:event_addDespesaActionPerformed

    private void addGanhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGanhosActionPerformed
        AdicionarGanho addGanho = new AdicionarGanho();
        this.dispose();
        addGanho.setVisible(true);

    }//GEN-LAST:event_addGanhosActionPerformed

    private void historicoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_historicoAncestorAdded
        Pessoa p = new Pessoa();
        historico.setText(""+p.getHistorico());
    }//GEN-LAST:event_historicoAncestorAdded

    private void exibirSaldoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_exibirSaldoAncestorAdded
        Pessoa p = new Pessoa();
        exibirSaldo.setText("R$ "+p.getSaldo());
    }//GEN-LAST:event_exibirSaldoAncestorAdded

    private void voltarTelaLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarTelaLoginMouseClicked
        Login login = new Login();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_voltarTelaLoginMouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDespesa;
    private javax.swing.JButton addGanhos;
    private javax.swing.JTextField exibirSaldo;
    private javax.swing.JTextPane historico;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel saldoDisponivel;
    private javax.swing.JLabel telaInicial;
    private javax.swing.JLabel voltarTelaLogin;
    // End of variables declaration//GEN-END:variables

    private void setText(String exibir_saldo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
