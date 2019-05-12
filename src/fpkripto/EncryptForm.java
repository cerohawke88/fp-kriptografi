/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpkripto;

import javax.swing.JComboBox;
import fpkripto.TripleDES;
import fpkripto.AES;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.security.Key;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;


/**
 *
 * @author VICKY
 */
public class EncryptForm extends javax.swing.JFrame {
    
    TripleDES tripleDES;
    AES aes;

    /**
     * Creates new form CryptForm
     */
    public EncryptForm() {
        this.tripleDES = new TripleDES();
        this.aes = new AES();
        initComponents();
        dimension();
        groupButton();
        setTitle("Aplikasi Enkripsi - Dekripsi");

    }
    
    private void dimension() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

        int x = screen.width / 2  - this.getSize().width / 2;
        int y = screen.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EncryptPanel = new javax.swing.JPanel();
        encryptMode = new javax.swing.JComboBox<>();
        modeLabel = new javax.swing.JLabel();
        plainTextLabel = new javax.swing.JLabel();
        plainText = new javax.swing.JTextField();
        cipherTextLabel = new javax.swing.JLabel();
        cipherText = new javax.swing.JTextField();
        btnEncrypt = new javax.swing.JButton();
        panelTitle = new javax.swing.JLabel();
        keyText = new javax.swing.JTextField();
        keyLabel = new javax.swing.JLabel();
        btnEncryptMode = new javax.swing.JRadioButton();
        btnDecryptMode = new javax.swing.JRadioButton();
        panelTitle1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        aboutUs = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        encryptMode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Triple DES", "AES" }));
        encryptMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptModeActionPerformed(evt);
            }
        });

        modeLabel.setLabelFor(encryptMode);
        modeLabel.setText("Select Mode");

        plainTextLabel.setLabelFor(plainText);
        plainTextLabel.setText("Plaintext");

        plainText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plainTextActionPerformed(evt);
            }
        });

        cipherTextLabel.setLabelFor(cipherText);
        cipherTextLabel.setText("Ciphertext");

        cipherText.setEditable(false);
        cipherText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cipherTextActionPerformed(evt);
            }
        });

        btnEncrypt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEncrypt.setText("Encrypt");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        panelTitle.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        panelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelTitle.setText("Final Project Kriptografi");

        keyText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        keyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyTextActionPerformed(evt);
            }
        });

        keyLabel.setText("Key");

        btnEncryptMode.setText("Encrypt");
        btnEncryptMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptModeActionPerformed(evt);
            }
        });

        btnDecryptMode.setText("Decrypt");
        btnDecryptMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptModeActionPerformed(evt);
            }
        });

        panelTitle1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        panelTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelTitle1.setText("Aplikasi Enkripsi - Dekripsi");

        javax.swing.GroupLayout EncryptPanelLayout = new javax.swing.GroupLayout(EncryptPanel);
        EncryptPanel.setLayout(EncryptPanelLayout);
        EncryptPanelLayout.setHorizontalGroup(
            EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnEncryptMode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDecryptMode)
                .addGap(73, 73, 73))
            .addGroup(EncryptPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EncryptPanelLayout.createSequentialGroup()
                        .addGroup(EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modeLabel)
                            .addComponent(keyLabel)
                            .addComponent(plainTextLabel)
                            .addComponent(cipherTextLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keyText, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(encryptMode, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plainText, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cipherText, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        EncryptPanelLayout.setVerticalGroup(
            EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncryptMode)
                    .addComponent(btnDecryptMode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modeLabel)
                    .addComponent(encryptMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keyText, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plainText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plainTextLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cipherText, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cipherTextLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnEncrypt)
                .addContainerGap())
        );

        panelTitle.getAccessibleContext().setAccessibleDescription("");

        aboutUs.setText("Tentang Kami");
        aboutUs.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                aboutUsMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        aboutUs.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                aboutUsMenuSelected(evt);
            }
        });
        aboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsActionPerformed(evt);
            }
        });
        jMenuBar1.add(aboutUs);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EncryptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(EncryptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        // TODO add your handling code here:
        // create an empty combo box with items of type String
        
        if (encryptMode.getSelectedItem() == "Triple DES") {
            String key = keyText.getText().toString();
            try {
                String getKey = tripleDES.setKey(key);
            } catch (Exception ex) {
                Logger.getLogger(EncryptForm.class.getName()).log(Level.SEVERE, null, ex);
            }

            String plaintext = plainText.getText().toString();
            String encrypt = tripleDES.encrypt(plaintext);

            cipherText.setText(encrypt);
        }
        else {
            String key = keyText.getText().toString();
            String getKey = AES.setKey(key);

            String plaintext = plainText.getText().toString();
            String encrypt = AES.encrypt(plaintext);

            cipherText.setText(encrypt);
        }
        
        
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void cipherTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cipherTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cipherTextActionPerformed

    private void plainTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plainTextActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_plainTextActionPerformed

    private void encryptModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptModeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encryptModeActionPerformed

    private void keyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_keyTextActionPerformed

    private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_aboutUsActionPerformed

    private void groupButton() {
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(btnEncryptMode);
        btnEncryptMode.setSelected(true);
        bg1.add(btnDecryptMode);
    }
    
    private void btnEncryptModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptModeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnEncryptModeActionPerformed
);
    }                                              
    private void btnDecryptModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptModeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DecryptForm d = new DecryptForm();
        d.setVisible(true);
    }//GEN-LAST:event_btnDecryptModeActionPerformed

    private void aboutUsMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_aboutUsMenuSelected
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Aplikasi ini dibuat dalam rangka Final Project Kriptografi \n\n" + "Dibuat oleh: \n" + 
                "1. Vicky Sultan Ahmad (105216010) \n" + "2. Arie Ardiansyah Siswanto (105216015) \n\n" + "Ilmu Komputer Universitas Pertamina 2016"
                ); 
    }//GEN-LAST:event_aboutUsMenuSelected

    private void aboutUsMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_aboutUsMenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutUsMenuKeyPressed

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
            java.util.logging.Logger.getLogger(EncryptForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncryptForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncryptForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncryptForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncryptForm().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EncryptPanel;
    private javax.swing.JMenu aboutUs;
    private javax.swing.JRadioButton btnDecryptMode;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JRadioButton btnEncryptMode;
    private javax.swing.JTextField cipherText;
    private javax.swing.JLabel cipherTextLabel;
    private javax.swing.JComboBox<String> encryptMode;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel keyLabel;
    private javax.swing.JTextField keyText;
    private javax.swing.JLabel modeLabel;
    private javax.swing.JLabel panelTitle;
    private javax.swing.JLabel panelTitle1;
    private javax.swing.JTextField plainText;
    private javax.swing.JLabel plainTextLabel;
    // End of variables declaration//GEN-END:variables
}
