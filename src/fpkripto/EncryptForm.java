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
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
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

        jTextField1 = new javax.swing.JTextField();
        EncryptPanel = new javax.swing.JPanel();
        encryptMode = new javax.swing.JComboBox<>();
        modeLabel = new javax.swing.JLabel();
        panelTitle = new javax.swing.JLabel();
        btnEncryptMode = new javax.swing.JRadioButton();
        btnDecryptMode = new javax.swing.JRadioButton();
        panelTitle1 = new javax.swing.JLabel();
        keyLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        keyText = new javax.swing.JTextArea();
        cipherTextLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        plainText = new javax.swing.JTextArea();
        plainTextLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cipherText = new javax.swing.JTextArea();
        btnEncrypt = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        aboutUs = new javax.swing.JMenu();
        help = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        encryptMode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Triple DES", "AES" }));
        encryptMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptModeActionPerformed(evt);
            }
        });

        modeLabel.setLabelFor(encryptMode);
        modeLabel.setText("Select Mode");

        panelTitle.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        panelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelTitle.setText("Final Project Kriptografi");

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

        keyLabel.setText("Key");

        keyText.setColumns(20);
        keyText.setRows(5);
        jScrollPane1.setViewportView(keyText);

        cipherTextLabel.setText("Plaintext");

        plainText.setColumns(20);
        plainText.setRows(5);
        jScrollPane2.setViewportView(plainText);

        plainTextLabel.setText("Ciphertext");

        cipherText.setEditable(false);
        cipherText.setColumns(20);
        cipherText.setRows(5);
        jScrollPane3.setViewportView(cipherText);

        btnEncrypt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEncrypt.setText("Encrypt");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EncryptPanelLayout = new javax.swing.GroupLayout(EncryptPanel);
        EncryptPanel.setLayout(EncryptPanelLayout);
        EncryptPanelLayout.setHorizontalGroup(
            EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnEncryptMode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDecryptMode)
                .addGap(69, 69, 69))
            .addGroup(EncryptPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EncryptPanelLayout.createSequentialGroup()
                        .addGroup(EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keyLabel)
                            .addComponent(cipherTextLabel)
                            .addComponent(plainTextLabel))
                        .addGap(18, 18, 18)
                        .addGroup(EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEncrypt, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addGroup(EncryptPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(EncryptPanelLayout.createSequentialGroup()
                            .addComponent(modeLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(encryptMode, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                    .addComponent(keyLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cipherTextLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EncryptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plainTextLabel)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEncrypt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTitle.getAccessibleContext().setAccessibleDescription("");

        aboutUs.setText("About Us");
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

        help.setText("Help");
        help.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                helpMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        help.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                helpMenuSelected(evt);
            }
        });
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EncryptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void encryptModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptModeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encryptModeActionPerformed

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

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        // TODO add your handling code here:
        // create an empty combo box with items of type String

        if (keyText.getText().isEmpty() || plainText.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Field tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            if (encryptMode.getSelectedItem() == "Triple DES") {
                if (keyText.getText().length() < 24) {
                    JOptionPane.showMessageDialog(this, "Key minimal 24 karakter", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    String key = keyText.getText().toString();
                    try {
                        String getKey = tripleDES.setKey(key);
                    } catch (Exception ex) {
                        Logger.getLogger(EncryptForm.class.getName()).log(Level.SEVERE, null, ex);
                        String errorMessage = "Message: " + ex.getMessage()
                                    + "\nStackTrace: " + Arrays.toString(ex.getStackTrace());
                        String title = ex.getClass().getName();
                        JOptionPane.showMessageDialog(this, errorMessage, title, JOptionPane.ERROR_MESSAGE);
                    }

                    String ciphertext = plainText.getText().toString();
                    String encrypt = tripleDES.encrypt(ciphertext);

                    cipherText.setText(encrypt);
                }
            }
            else {
                String key = keyText.getText().toString();
                try {
                    String getKey = AES.setKey(key);
                } catch (Exception ex) {
                    String errorMessage = "Message: " + ex.getMessage()
                                + "\nStackTrace: " + Arrays.toString(ex.getStackTrace());
                    String title = ex.getClass().getName();
                    JOptionPane.showMessageDialog(this, errorMessage, title, JOptionPane.ERROR_MESSAGE);
                }

                String ciphertext = plainText.getText().toString();
                String encrypt = AES.encrypt(ciphertext);

                cipherText.setText(encrypt);
            }
        }

    }//GEN-LAST:event_btnEncryptActionPerformed

    private void helpMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_helpMenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpMenuKeyPressed

    private void helpMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_helpMenuSelected
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Masukkan key berupa string ataupun angka, minimal 24 karakter untuk TripleDES.\n" + 
                "Jumlah karakter untuk plaintext tidak dibatasi, namun disarankan untuk tidak berlebihan dalam memasukkan plaintext.");
    }//GEN-LAST:event_helpMenuSelected

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpActionPerformed

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
    private javax.swing.JTextArea cipherText;
    private javax.swing.JLabel cipherTextLabel;
    private javax.swing.JComboBox<String> encryptMode;
    private javax.swing.JMenu help;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel keyLabel;
    private javax.swing.JTextArea keyText;
    private javax.swing.JLabel modeLabel;
    private javax.swing.JLabel panelTitle;
    private javax.swing.JLabel panelTitle1;
    private javax.swing.JTextArea plainText;
    private javax.swing.JLabel plainTextLabel;
    // End of variables declaration//GEN-END:variables
}
