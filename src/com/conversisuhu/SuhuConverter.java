/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.conversisuhu;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Lenovo
 */
public class SuhuConverter extends javax.swing.JFrame {

    /**
     * Creates new form SuhuConverter
     */
    private boolean autoConvertEnabled = false;
    private void enableAutoConvert(boolean enable) {
        autoConvertEnabled = enable;
    }
    public SuhuConverter() {
        initComponents();
        txtInput.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                convertIfAutoEnabled();
            }
            public void removeUpdate(DocumentEvent e) {
                convertIfAutoEnabled();
            }
            public void changedUpdate(DocumentEvent e) {
                convertIfAutoEnabled();
            }

            private void convertIfAutoEnabled() {
                if (autoConvertEnabled && !txtInput.getText().trim().isEmpty()) {
                    btnConvert.doClick(); // Menjalankan konversi otomatis
                }
            }
        });

        
        txtInput.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE && c != '.') {
                    e.consume();
                }
            }
        });
        txtInput.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                toggleConvertClearButtons();
            }
            public void removeUpdate(DocumentEvent e) {
                toggleConvertClearButtons();
            }
            public void changedUpdate(DocumentEvent e) {
                toggleConvertClearButtons();
            }

            private void toggleConvertClearButtons() {
                boolean hasText = !txtInput.getText().trim().isEmpty();
                btnConvert.setEnabled(hasText);
                btnClear.setEnabled(hasText);
            }
        });
        
        // Pastikan tombol Convert dan Clear tidak aktif saat pertama kali
        btnConvert.setEnabled(false);
        btnClear.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cbInputScale = new javax.swing.JComboBox<>();
        rbToCelsius = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnConvert = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        rbToKelvin = new javax.swing.JRadioButton();
        rbToReamur = new javax.swing.JRadioButton();
        rbToFahrenheit = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        lblOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Konversi Suhu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        cbInputScale.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin", "Reamur" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 4, 12);
        jPanel1.add(cbInputScale, gridBagConstraints);

        buttonGroup1.add(rbToCelsius);
        rbToCelsius.setText("Celsius");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 4, 12);
        jPanel1.add(rbToCelsius, gridBagConstraints);

        jLabel2.setText("Masukkan Suhu:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 4, 12);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Pilih Suhu Awal:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 4, 12);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Target Konversi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 4, 12);
        jPanel1.add(jLabel4, gridBagConstraints);

        btnConvert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConvert.setText("Konversi");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 4, 12);
        jPanel1.add(btnConvert, gridBagConstraints);

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 4, 12);
        jPanel1.add(btnClear, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 4, 12);
        jPanel1.add(txtInput, gridBagConstraints);

        buttonGroup1.add(rbToKelvin);
        rbToKelvin.setText("Kelvin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 4, 12);
        jPanel1.add(rbToKelvin, gridBagConstraints);

        buttonGroup1.add(rbToReamur);
        rbToReamur.setText("Reamur");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 4, 12);
        jPanel1.add(rbToReamur, gridBagConstraints);

        buttonGroup1.add(rbToFahrenheit);
        rbToFahrenheit.setText("Fahrenheit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 4, 12);
        jPanel1.add(rbToFahrenheit, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hasil Konversi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setLayout(new java.awt.GridBagLayout());

        lblOutput.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblOutput.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(37, 37, 37, 37);
        jPanel3.add(lblOutput, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jPanel3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private double convertTemperature(double value, String fromScale, String toScale) {
        switch (fromScale + " to " + toScale) {
            case "Celsius to Fahrenheit": return value * 9/5 + 32;
            case "Celsius to Kelvin": return value + 273.15;
            case "Celsius to Reamur": return value * 4/5;

            case "Fahrenheit to Celsius": return (value - 32) * 5/9;
            case "Fahrenheit to Kelvin": return (value - 32) * 5/9 + 273.15;
            case "Fahrenheit to Reamur": return (value - 32) * 4/9;

            case "Kelvin to Celsius": return value - 273.15;
            case "Kelvin to Fahrenheit": return (value - 273.15) * 9/5 + 32;
            case "Kelvin to Reamur": return (value - 273.15) * 4/5;

            case "Reamur to Celsius": return value * 5/4;
            case "Reamur to Fahrenheit": return value * 9/4 + 32;
            case "Reamur to Kelvin": return value * 5/4 + 273.15;

            default: return value; // Tidak ada konversi jika fromScale sama dengan toScale
        }
    }

    private String getSelectedRadioButtonText() {
        if (rbToCelsius.isSelected()) return "Celsius";
        if (rbToFahrenheit.isSelected()) return "Fahrenheit";
        if (rbToKelvin.isSelected()) return "Kelvin";
        if (rbToReamur.isSelected()) return "Reamur";
        return null;
    }

    
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtInput.setText("");
        lblOutput.setText("-");
        enableAutoConvert(false); // Nonaktifkan konversi otomatis
        btnConvert.setEnabled(false);
        btnClear.setEnabled(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        try {
            double inputValue = Double.parseDouble(txtInput.getText());
            String fromScale = cbInputScale.getSelectedItem().toString();
            String toScale = getSelectedRadioButtonText(); // Implementasi di bawah
            double result = convertTemperature(inputValue, fromScale, toScale);
            lblOutput.setText(String.format("%.2f %s", result, toScale));
            enableAutoConvert(true); // Aktifkan konversi otomatis
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input tidak valid. Masukkan angka yang benar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConvertActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(SuhuConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuhuConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuhuConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuhuConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuhuConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConvert;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbInputScale;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JRadioButton rbToCelsius;
    private javax.swing.JRadioButton rbToFahrenheit;
    private javax.swing.JRadioButton rbToKelvin;
    private javax.swing.JRadioButton rbToReamur;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
