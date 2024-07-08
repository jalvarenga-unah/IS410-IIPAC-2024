/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controles;

/**
 *
 * @author juanalvarenga
 */
public class FormularioPage extends javax.swing.JFrame {

    /**
     * Creates new form FormularioPage
     */
    public FormularioPage() {
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

        grupoMoneda = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        hnl = new javax.swing.JRadioButton();
        usd = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        lblMoneda = new javax.swing.JLabel();
        btnModal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Uso de controles");

        grupoMoneda.add(hnl);
        hnl.setText("HNL");
        hnl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hnlActionPerformed(evt);
            }
        });

        grupoMoneda.add(usd);
        usd.setText("USD");
        usd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usdActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione una moneda:");

        lblMoneda.setText("Moneda seleccionada:");

        btnModal.setText("Mostar Modal");
        btnModal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModal)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(hnl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usd)
                        .addGap(81, 81, 81)
                        .addComponent(lblMoneda))
                    .addComponent(jLabel1))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hnl)
                    .addComponent(usd)
                    .addComponent(lblMoneda))
                .addGap(36, 36, 36)
                .addComponent(btnModal)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usdActionPerformed
        // TODO add your handling code here:
        if (usd.isSelected()) {
//            lblMoneda.setText("Moneda seleccionada: "+ usd.getText());
            lblMoneda.setText(String.format("Moneda seleccionada: %s", usd.getText()));
        }
    }//GEN-LAST:event_usdActionPerformed

    private void hnlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hnlActionPerformed
        // TODO add your handling code here:
        if (hnl.isSelected()) {
            lblMoneda.setText("Moneda seleccionada: " + hnl.getText());
        }
    }//GEN-LAST:event_hnlActionPerformed

    private void btnModalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModalActionPerformed
        // TODO add your handling code here:
//        new LoginPage().setVisible(true);


        MiModal modal = new MiModal(this , true);
        
        modal.setVisible(true);
        
    }//GEN-LAST:event_btnModalActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModal;
    private javax.swing.ButtonGroup grupoMoneda;
    private javax.swing.JRadioButton hnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblMoneda;
    private javax.swing.JRadioButton usd;
    // End of variables declaration//GEN-END:variables
}
