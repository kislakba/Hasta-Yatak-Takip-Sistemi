package odevim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Baris
 */
public class hastaEkrani extends javax.swing.JFrame {

    DefaultTableModel yataklar = new DefaultTableModel();

    /**
     * Creates new form hastaEkrani
     */
    public hastaEkrani() {
        initComponents();
        jTable1.setModel(yataklar);
        yataklar.setColumnIdentifiers(new Object[]{"Bed Number", "Is Empty"});
        jComboBoxHastaneSec.addItem("FATIH_SULTAN_MEHMET");
        jComboBoxHastaneSec.addItem("SADI_KONUK_HASTANESI");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonSil = new javax.swing.JButton();
        jButtonEkle = new javax.swing.JButton();
        jComboBoxHastaneSec = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonSil.setText("Sil");
        jButtonSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSilActionPerformed(evt);
            }
        });

        jButtonEkle.setText("Ekle");
        jButtonEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEkleActionPerformed(evt);
            }
        });

        jComboBoxHastaneSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHastaneSecActionPerformed(evt);
            }
        });

        jLabel3.setText("Hastane Seç");

        jPanel1.setBackground(new java.awt.Color(31, 58, 147));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cast.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cast.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("                   Hasta Yatak Rezervasyon Paneli");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel2)
                    .addContainerGap(836, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(10, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxHastaneSec, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSil, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxHastaneSec, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButtonSil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //getir bana databaseyi dönecek ve default olarak atadıgım 0 veya randevu alındıysa 1i var, yok şeklinde yazıcak

    private void getirBana() {
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app")) {
            String selectedHospital = jComboBoxHastaneSec.getItemAt(jComboBoxHastaneSec.getSelectedIndex());
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT PATIENTSCITIZENNUMBER FROM " + selectedHospital);
            int i = 1;
            yataklar.setRowCount(0);
            while (rs.next()) {
                long ctnum = rs.getLong("PATIENTSCITIZENNUMBER");
                if (ctnum == 0) {
                    yataklar.addRow(new Object[]{i + "", "Bed is Empty"});
                    i++;
                } else {
                    yataklar.addRow(new Object[]{i + "", "Bed is full"});
                    i++;

                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(hastaEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButtonEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEkleActionPerformed
        //ekle de aynı şekilde databasedeki yeri update edecek kullanıcının blgiler ile
        int selectedRow = jTable1.getSelectedRow() + 1;
        // int selectedHospital = jComboBoxHastaneSec.getSelectedIndex();
        int hasAppointment = kayitliHastaGiris.icerde.get(0).getHasapointment();
        String selectedHospital = jComboBoxHastaneSec.getItemAt(jComboBoxHastaneSec.getSelectedIndex());
        if (hasAppointment == 0) {
            try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app")) {
                Statement stm = con.createStatement();
                stm.executeUpdate("UPDATE " + selectedHospital + " SET PATIENTSCITIZENNUMBER="
                        + kayitliHastaGiris.icerde.get(0).getCitizennumber()
                        + ",PATIENTSNAME='" + kayitliHastaGiris.icerde.get(0).getName() + "',PATIENTSSURNAME='"
                        + kayitliHastaGiris.icerde.get(0).getSurname()
                        + "',PATIENTSAGE=" + kayitliHastaGiris.icerde.get(0).getAge() + " WHERE BEDNUMBER=" + selectedRow);
                kayitliHastaGiris.icerde.get(0).setHasapointment(1);
            } catch (SQLException ex) {
                Logger.getLogger(hastaEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "You already have a bed please delete that register first");
        }
        getirBana();
    }//GEN-LAST:event_jButtonEkleActionPerformed

    private void jButtonSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSilActionPerformed
        String selectedHospital = jComboBoxHastaneSec.getItemAt(jComboBoxHastaneSec.getSelectedIndex());
        int selectedBed = jComboBoxHastaneSec.getSelectedIndex();
        if (kayitliHastaGiris.icerde.get(0).getHasapointment() == 1) {
            try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app")) {
                Statement stm = con.createStatement();
                stm.executeUpdate("UPDATE " + selectedHospital + " SET PATIENTSCITIZENNUMBER=0,PATIENTSNAME=NULL,PATIENTSSURNAME=NULL"
                        + ",PATIENTSAGE=0" + " WHERE PATIENTSCITIZENNUMBER=" + kayitliHastaGiris.icerde.get(0).getCitizennumber());
                kayitliHastaGiris.icerde.get(0).setHasapointment(0);
                getirBana();
                JOptionPane.showMessageDialog(this, "Your register successfully deleted");
            } catch (SQLException ex) {
                Logger.getLogger(hastaEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButtonSilActionPerformed

    private void jComboBoxHastaneSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHastaneSecActionPerformed
        getirBana();
    }//GEN-LAST:event_jComboBoxHastaneSecActionPerformed

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
            java.util.logging.Logger.getLogger(hastaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hastaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hastaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hastaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hastaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEkle;
    private javax.swing.JButton jButtonSil;
    private javax.swing.JComboBox<String> jComboBoxHastaneSec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
