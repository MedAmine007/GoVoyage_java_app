/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.dao.graphique;

import com.esprit.dao.entities.Evenement;
import com.esprit.implementations.*;
import datechooser.beans.DateChooserCombo;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author islem_nawara
 */
public class ModifierEvent extends javax.swing.JFrame {

    Evenement event = new Evenement();
    int id_event;

    public ModifierEvent(int id) {
        initComponents();
        this.setSize(750, 500);
        this.id_event = id;
    }

    public ModifierEvent(Evenement event) {
        this.event = event;
    }

    public DateChooserCombo getDateChooserCombo1() {
        return dateChooserCombo1;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public JLabel getlMessage() {
        return lMessage;
    }

    public JLabel getlMessage2() {
        return lMessage2;
    }

    public void setDateChooserCombo1(DateChooserCombo dateChooserCombo1) {
        this.dateChooserCombo1 = dateChooserCombo1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public void setlMessage(JLabel lMessage) {
        this.lMessage = lMessage;
    }

    public void setlMessage2(JLabel lMessage2) {
        this.lMessage2 = lMessage2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lMessage = new javax.swing.JLabel();
        lMessage2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(250, 240, 240));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Lieu:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 130, 120, 19);

        jLabel3.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Date :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 220, 80, 25);

        jLabel4.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Detail :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 300, 100, 25);

        lMessage.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lMessage);
        lMessage.setBounds(140, 180, 190, 20);

        lMessage2.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lMessage2);
        lMessage2.setBounds(140, 260, 200, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(390, 120, 220, 30);

        try {
            dateChooserCombo1.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }
        jPanel1.add(dateChooserCombo1);
        dateChooserCombo1.setBounds(390, 210, 220, 30);

        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(300, 440, 90, 40);

        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(500, 440, 90, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(390, 290, 220, 96);

        jLabel1.setBackground(new java.awt.Color(250, 240, 240));
        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 840, 550);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        lMessage.setText("");
        lMessage2.setText("");

//        Evenement evenement = new Evenement();
        if (jTextField1.getText().trim().equals("")) {
            lMessage.setText("Lieu should not be left blank ");
        }

        if ((dateChooserCombo1.getText().trim().equals(""))) {
            lMessage2.setText(" Date should not be left blank ");
        } else {

            String lieu;
            String date;
            String detail;
            lieu = getjTextField1().getText();
            date = dateChooserCombo1.getText();
            detail = getjTextArea1().getText();
            event.setLieu(lieu);
            event.setDate(date);
            event.setDetail(detail);
            event.setIdpublication(id_event);
  
            EvenementDAO dao = new EvenementDAO();
            dao.modifierEvenement(event);
            JOptionPane.showMessageDialog(null, "modification effectué");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ModifierEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifierEvent(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lMessage;
    private javax.swing.JLabel lMessage2;
    // End of variables declaration//GEN-END:variables
}
