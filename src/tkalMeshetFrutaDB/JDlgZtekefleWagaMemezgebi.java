package tkalMeshetFrutaDB;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class JDlgZtekefleWagaMemezgebi extends javax.swing.JDialog {

    public JDlgZtekefleWagaMemezgebi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
//         jLabel3.setText("                                             "); 
    }

    public void checkIfKeyTypedDigit(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!((c >= 48 && c <= 57) || c == 46)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTeklalaWaga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtZkfelWaga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel1.setText("ጠቕላላ ዋጋ ፡");

        txtTeklalaWaga.setEditable(false);
        txtTeklalaWaga.setText(NewJFrame.getTeklalaWaga() + "");
        txtTeklalaWaga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTeklalaWagaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel2.setText(" እዩ። ዝኽፈል ዋጋ ምላእ።");

        txtZkfelWaga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtZkfelWagaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZkfelWagaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Nyala", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("                                                               ");

        jButton1.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jButton1.setText("ምላእ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTeklalaWaga, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(txtZkfelWaga, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtTeklalaWaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtZkfelWaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTeklalaWagaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeklalaWagaKeyTyped
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtTeklalaWagaKeyTyped

    private void txtZkfelWagaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZkfelWagaKeyTyped
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtZkfelWagaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!"".equals(txtTeklalaWaga.getText()) && !"".equals(txtZkfelWaga.getText())) {
            try {
                NewJFrame.setZtekefleWaga(Double.parseDouble(txtZkfelWaga.getText()));
                dispose();
            } catch (Exception ex) {
                jLabel3.setText("ዝኽፈል ዋጋ ብ ግቡእ ምላእ፥ ተዘይተኸፊሉ \"0\" ምላእ");
                txtZkfelWaga.requestFocus();
                txtZkfelWaga.setText(null);
            }
        } else {
            jLabel3.setText("ዝኽፈል ዋጋ ብ ግቡእ ምላእ፥ ተዘይተኸፊሉ \"0\" ምላእ");
            txtZkfelWaga.requestFocus();
            txtZkfelWaga.setText(null);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtZkfelWagaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZkfelWagaKeyPressed
        // TODO add your handling code here:
        jLabel3.setText("                                                  ");
    }//GEN-LAST:event_txtZkfelWagaKeyPressed

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
            java.util.logging.Logger.getLogger(JDlgZtekefleWagaMemezgebi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgZtekefleWagaMemezgebi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgZtekefleWagaMemezgebi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgZtekefleWagaMemezgebi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgZtekefleWagaMemezgebi dialog = new JDlgZtekefleWagaMemezgebi(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtTeklalaWaga;
    private javax.swing.JTextField txtZkfelWaga;
    // End of variables declaration//GEN-END:variables
}
