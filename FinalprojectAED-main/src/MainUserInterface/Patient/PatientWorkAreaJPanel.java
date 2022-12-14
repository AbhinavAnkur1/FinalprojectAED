/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.Patient;

import BusinessModel.Ecosystem;
import BusinessModel.Patient.PatientBills;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indian
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
    private final JPanel userProCont;
    private final Ecosystem ecoSystem;
    User userAcc;

    public PatientWorkAreaJPanel(JPanel userProcessContainer, User account, Ecosystem business) {
        initComponents();
        this.userProCont = userProcessContainer;
        this.ecoSystem = business;
        this.userAcc = account;
        
        
        populatePatientInformationTable();
        populateBillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblDisplayPatient = new javax.swing.JLabel();
        fNameTxt = new javax.swing.JTextField();
        lblPatientStatus = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPatientAddress = new javax.swing.JLabel();
        dobTxt = new javax.swing.JTextField();
        lNameTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        patStatusTxt = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        lblPatientAge = new javax.swing.JLabel();
        lblPatientLastName = new javax.swing.JLabel();
        lblPatientPhone = new javax.swing.JLabel();
        injuryTxt = new javax.swing.JTextField();
        lblPhoneNumber4 = new javax.swing.JLabel();
        lblPhoneNumber5 = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        bloodGrpTxt = new javax.swing.JTextField();
        lblPatientFirstName = new javax.swing.JLabel();
        lblPhotoImage = new javax.swing.JLabel();
        lblPatientGender = new javax.swing.JLabel();
        dateOfAdmitTxt = new javax.swing.JTextField();
        mailTxt = new javax.swing.JTextField();
        lblAddress4 = new javax.swing.JLabel();
        genderTxt = new javax.swing.JTextField();
        mobileTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTalble = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 100, 40));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 1300, 20));

        lblDisplayPatient.setBackground(new java.awt.Color(0, 153, 204));
        lblDisplayPatient.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        lblDisplayPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplayPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisplayPatient.setText("WELCOME");
        add(lblDisplayPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1394, 73));

        fNameTxt.setEditable(false);
        fNameTxt.setBackground(new java.awt.Color(93, 255, 183));
        fNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTxtActionPerformed(evt);
            }
        });
        add(fNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 150, -1));

        lblPatientStatus.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientStatus.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientStatus.setText("Patient Status");
        add(lblPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        lblPatientAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setText("Address");
        add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        dobTxt.setEditable(false);
        dobTxt.setBackground(new java.awt.Color(93, 255, 183));
        dobTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTxtActionPerformed(evt);
            }
        });
        add(dobTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 150, -1));

        lNameTxt.setEditable(false);
        lNameTxt.setBackground(new java.awt.Color(93, 255, 183));
        lNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTxtActionPerformed(evt);
            }
        });
        add(lNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 150, -1));

        ageTxt.setEditable(false);
        ageTxt.setBackground(new java.awt.Color(93, 255, 183));
        ageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtActionPerformed(evt);
            }
        });
        add(ageTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 150, -1));

        patStatusTxt.setEditable(false);
        patStatusTxt.setBackground(new java.awt.Color(93, 255, 183));
        patStatusTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patStatusTxtActionPerformed(evt);
            }
        });
        add(patStatusTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 150, -1));

        lblPhoto.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoto.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPhoto.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoto.setText("Photo");
        add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, -1, -1));

        lblPatientAge.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientAge.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setText("Age");
        add(lblPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setText("Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        lblPatientPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setText("Phone Number");
        add(lblPatientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, 40));

        injuryTxt.setEditable(false);
        injuryTxt.setBackground(new java.awt.Color(93, 255, 183));
        injuryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                injuryTxtActionPerformed(evt);
            }
        });
        add(injuryTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 150, -1));

        lblPhoneNumber4.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPhoneNumber4.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setText("Injury Type");
        add(lblPhoneNumber4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        lblPhoneNumber5.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPhoneNumber5.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber5.setText("Date of Admit ");
        add(lblPhoneNumber5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        lblDOB.setBackground(new java.awt.Color(255, 255, 255));
        lblDOB.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB.setText("Date of Birth");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        addressTxt.setEditable(false);
        addressTxt.setBackground(new java.awt.Color(93, 255, 183));
        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 150, -1));

        bloodGrpTxt.setEditable(false);
        bloodGrpTxt.setBackground(new java.awt.Color(93, 255, 183));
        bloodGrpTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGrpTxtActionPerformed(evt);
            }
        });
        add(bloodGrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 150, -1));

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setText("First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        lblPhotoImage.setBackground(new java.awt.Color(255, 255, 255));
        add(lblPhotoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, 140, 136));

        lblPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientGender.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setText("Gender");
        add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, 40));

        dateOfAdmitTxt.setEditable(false);
        dateOfAdmitTxt.setBackground(new java.awt.Color(93, 255, 183));
        dateOfAdmitTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateOfAdmitTxtActionPerformed(evt);
            }
        });
        add(dateOfAdmitTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 150, -1));

        mailTxt.setEditable(false);
        mailTxt.setBackground(new java.awt.Color(93, 255, 183));
        mailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTxtActionPerformed(evt);
            }
        });
        add(mailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 150, -1));

        lblAddress4.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblAddress4.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress4.setText("Blood Group");
        add(lblAddress4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, -1, -1));

        genderTxt.setEditable(false);
        genderTxt.setBackground(new java.awt.Color(93, 255, 183));
        add(genderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 150, -1));

        mobileTxt.setEditable(false);
        mobileTxt.setBackground(new java.awt.Color(93, 255, 183));
        add(mobileTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 150, -1));

        BillTalble.setBackground(new java.awt.Color(204, 255, 204));
        BillTalble.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BillTalble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Organization", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BillTalble);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 1200, 219));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/images-modified.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 150, 190, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void populatePatientInformationTable() {
        for (Patient patient : ecoSystem.getPatientDirect().getPatientList()) {
            if (userAcc.getUserName().equals(patient.getpUserName())) {
                fNameTxt.setText(patient.getpFirstName());
                lNameTxt.setText(patient.getpLastName());
                ageTxt.setText(Integer.toString(patient.getpAge()));
                genderTxt.setText(patient.getpGender());
                addressTxt.setText(patient.getpAddress());
                mobileTxt.setText(patient.getpPhoneNo());
                mailTxt.setText(patient.getpEmailAddress());
                dobTxt.setText(new SimpleDateFormat("MM-dd-yyyy").format(patient.getPdob()));
                dateOfAdmitTxt.setText(new SimpleDateFormat("MM-dd-yyyy").format(patient.getpDateOfAdmit()));
                injuryTxt.setText(patient.getpInjuryType());
                bloodGrpTxt.setText(patient.getpBloodType());
                patStatusTxt.setText(patient.getpStatus());

                ImageIcon ii = new ImageIcon(patient.getpImageUrl());
                Image image = ii.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH);
                lblPhotoImage.setIcon(new ImageIcon(image));
            }

        }

    }

    private void populateBillTable() {
        DefaultTableModel model = (DefaultTableModel) BillTalble.getModel();

        model.setRowCount(0);
        for (Patient patient : ecoSystem.getPatientDirect().getPatientList()) {
            if (userAcc.getUserName().equals(patient.getpUserName())) {
                for (PatientBills b : patient.getpBills()) {

                    Object[] row = new Object[7];
                    row[0] = b.getName();
                    row[1] = b.getOrgType();
                    row[2] = b.getAmount();
                    model.addRow(row);

                }
            }
        }
    }

    private void dobTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTxtActionPerformed

    private void lNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameTxtActionPerformed

    private void ageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtActionPerformed

    private void patStatusTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patStatusTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patStatusTxtActionPerformed

    private void injuryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_injuryTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_injuryTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void bloodGrpTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGrpTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodGrpTxtActionPerformed

    private void dateOfAdmitTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateOfAdmitTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateOfAdmitTxtActionPerformed

    private void mailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTxtActionPerformed

    private void fNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTalble;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField bloodGrpTxt;
    private javax.swing.JTextField dateOfAdmitTxt;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JTextField injuryTxt;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lNameTxt;
    private javax.swing.JLabel lblAddress4;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDisplayPatient;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPatientAddress;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPatientPhone;
    private javax.swing.JLabel lblPatientStatus;
    private javax.swing.JLabel lblPhoneNumber4;
    private javax.swing.JLabel lblPhoneNumber5;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPhotoImage;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JTextField patStatusTxt;
    // End of variables declaration//GEN-END:variables
}
