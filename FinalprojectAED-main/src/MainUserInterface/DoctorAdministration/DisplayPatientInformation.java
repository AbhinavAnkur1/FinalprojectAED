/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainUserInterface.DoctorAdministration;

import BusinessModel.Doctor.Dr;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import MainUserInterface.Ambulance.DisplayAmbulancePatient;

/**
 *
 * @author daddy
 */
public class DisplayPatientInformation extends javax.swing.JPanel {

    /**
     * Creates new form DisplayPatientInformation
     */
    private final JPanel userProCont;
    private final Ecosystem ecoSystem;
    private final Patient patient;
    User userAcc;

    public DisplayPatientInformation(JPanel userProcessContainer, User account, Ecosystem system, Patient patient) {
        initComponents();
        this.userProCont = userProcessContainer;
        this.ecoSystem = system;
        this.userAcc = account;
        this.patient = patient;
        populateTable();
        populatePatientInformationTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mobileTxt = new javax.swing.JTextField();
        injuryTxt = new javax.swing.JTextField();
        lblPatientAge = new javax.swing.JLabel();
        lblPhoneNumber5 = new javax.swing.JLabel();
        lblPatientFirstName = new javax.swing.JLabel();
        birthDateTxt = new javax.swing.JTextField();
        lblPatientLastName = new javax.swing.JLabel();
        fNameTxt = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        mailTxt = new javax.swing.JTextField();
        lblPatientAddress = new javax.swing.JLabel();
        bloodGrpTxt = new javax.swing.JTextField();
        admitDateTxt = new javax.swing.JTextField();
        patientStatusTxt = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        lblPatientPhone = new javax.swing.JLabel();
        lblDisplayPatient = new javax.swing.JLabel();
        lblAddress4 = new javax.swing.JLabel();
        assignDocBtn = new javax.swing.JButton();
        lblPatientStatus = new javax.swing.JLabel();
        gengerTxt = new javax.swing.JTextField();
        lblPhoneNumber4 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        lNameTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
        lblPhotoImage = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mobileTxt.setEditable(false);
        mobileTxt.setBackground(new java.awt.Color(153, 153, 153));
        mobileTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileTxtActionPerformed(evt);
            }
        });
        add(mobileTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 160, 30));

        injuryTxt.setEditable(false);
        injuryTxt.setBackground(new java.awt.Color(153, 153, 153));
        injuryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                injuryTxtActionPerformed(evt);
            }
        });
        add(injuryTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 160, 30));

        lblPatientAge.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientAge.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setText("Age");
        add(lblPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        lblPhoneNumber5.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPhoneNumber5.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber5.setText("Date of Admit ");
        add(lblPhoneNumber5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, 20));

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setText("First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        birthDateTxt.setEditable(false);
        birthDateTxt.setBackground(new java.awt.Color(153, 153, 153));
        birthDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthDateTxtActionPerformed(evt);
            }
        });
        add(birthDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 160, 30));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setText("Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        fNameTxt.setEditable(false);
        fNameTxt.setBackground(new java.awt.Color(153, 153, 153));
        fNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTxtActionPerformed(evt);
            }
        });
        add(fNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 160, 30));

        lblDOB.setBackground(new java.awt.Color(255, 255, 255));
        lblDOB.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB.setText("Date of Birth");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, 20));

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, -1, 20));

        addressTxt.setEditable(false);
        addressTxt.setBackground(new java.awt.Color(153, 153, 153));
        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 160, 70));

        mailTxt.setEditable(false);
        mailTxt.setBackground(new java.awt.Color(153, 153, 153));
        mailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTxtActionPerformed(evt);
            }
        });
        add(mailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 160, 30));

        lblPatientAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientAddress.setText("Address");
        add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        bloodGrpTxt.setEditable(false);
        bloodGrpTxt.setBackground(new java.awt.Color(153, 153, 153));
        bloodGrpTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGrpTxtActionPerformed(evt);
            }
        });
        add(bloodGrpTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 160, 30));

        admitDateTxt.setEditable(false);
        admitDateTxt.setBackground(new java.awt.Color(153, 153, 153));
        admitDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admitDateTxtActionPerformed(evt);
            }
        });
        add(admitDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 160, 30));

        patientStatusTxt.setEditable(false);
        patientStatusTxt.setBackground(new java.awt.Color(153, 153, 153));
        patientStatusTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientStatusTxtActionPerformed(evt);
            }
        });
        add(patientStatusTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 160, 30));

        lblPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientGender.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setText("Gender");
        add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        lblPatientPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setText("Phone Number");
        add(lblPatientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        lblDisplayPatient.setBackground(new java.awt.Color(255, 255, 255));
        lblDisplayPatient.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblDisplayPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplayPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisplayPatient.setText("Patient Details");
        add(lblDisplayPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 280, 82));

        lblAddress4.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblAddress4.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress4.setText("Blood Group");
        add(lblAddress4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, 20));

        assignDocBtn.setBackground(new java.awt.Color(51, 51, 255));
        assignDocBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        assignDocBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignDocBtn.setText("Assign Doctor");
        assignDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignDocBtnActionPerformed(evt);
            }
        });
        add(assignDocBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, -1, -1));

        lblPatientStatus.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientStatus.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientStatus.setText("Patient Status");
        add(lblPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, 20));

        gengerTxt.setEditable(false);
        gengerTxt.setBackground(new java.awt.Color(153, 153, 153));
        gengerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gengerTxtActionPerformed(evt);
            }
        });
        add(gengerTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 160, 30));

        lblPhoneNumber4.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPhoneNumber4.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setText("Injury Type");
        add(lblPhoneNumber4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, 40));

        ageTxt.setEditable(false);
        ageTxt.setBackground(new java.awt.Color(153, 153, 153));
        ageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtActionPerformed(evt);
            }
        });
        add(ageTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 160, 30));

        lNameTxt.setEditable(false);
        lNameTxt.setBackground(new java.awt.Color(153, 153, 153));
        lNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTxtActionPerformed(evt);
            }
        });
        add(lNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 160, 30));

        DoctorTable.setBackground(new java.awt.Color(204, 204, 255));
        DoctorTable.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        DoctorTable.getTableHeader().setFont(new java.awt.Font("Trebuchet", 1, 16));
        DoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Health ID", "Experience", "Age", "Gender", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DoctorTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 1140, 170));
        add(lblPhotoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 160, 200, 200));

        backBtn.setBackground(new java.awt.Color(51, 51, 255));
        backBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Available doctors");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 360, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/patient.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 80, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/icons8-doctor-male-skin-type-4-48.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 50, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void injuryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_injuryTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_injuryTxtActionPerformed

    private void birthDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthDateTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void mailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTxtActionPerformed

    private void bloodGrpTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGrpTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodGrpTxtActionPerformed

    private void admitDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admitDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admitDateTxtActionPerformed

    private void patientStatusTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientStatusTxtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_patientStatusTxtActionPerformed

    private void assignDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignDocBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = DoctorTable.getSelectedRow();
        if (selectedRowIndex < 0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {
            
            Dr doctor = (Dr) DoctorTable.getValueAt(selectedRowIndex, 0);
            System.out.println("doctor details ---"+doctor);
            System.out.println("patient details ---"+this.patient);
            ecoSystem.getDoctorDirect().AddPatient(doctor, this.patient);
            
            JOptionPane.showMessageDialog(null, "Doctor Assigned", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_assignDocBtnActionPerformed
    
    
    
    private void ageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtActionPerformed

    private void lNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameTxtActionPerformed

    private void mobileTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        DocAdminWorkArea doctorAdminWorkArea = new DocAdminWorkArea(userProCont, userAcc, ecoSystem);
        userProCont.add("Admin Work Panel", doctorAdminWorkArea);
        CardLayout layout = (CardLayout) userProCont.getLayout();
        layout.next(userProCont);
    }//GEN-LAST:event_backBtnActionPerformed

    private void gengerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gengerTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gengerTxtActionPerformed

    private void fNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTxtActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) DoctorTable.getModel();

        model.setRowCount(0);

        for (Dr Doctor : ecoSystem.getDoctorDirect().getDoctors()) {

            Object[] row = new Object[9];
            row[0] = Doctor;
            row[1] = Doctor.getdocLastName();
            row[2] = Doctor.getdocWorkID();
            row[3] = Doctor.getdocAddress();
            row[4] = Doctor.getdocAge();
            row[5] = Doctor.getdocGender();
            row[6] = Doctor.getdocEmail();

            model.addRow(row);

        }
    }

     private void populatePatientInformationTable() {
        
        fNameTxt.setText(patient.getpFirstName());
        lNameTxt.setText(patient.getpLastName());
        ageTxt.setText(Integer.toString(patient.getpAge()));
        gengerTxt.setText(patient.getpGender());
        addressTxt.setText(patient.getpAddress());
        mobileTxt.setText(patient.getpPhoneNo());
        mailTxt.setText(patient.getpEmailAddress());
        if(patient.getPdob()!= null)
        {
            birthDateTxt.setText(new SimpleDateFormat("MM-dd-yyyy").format(patient.getPdob()));
        }
        if(patient.getpDateOfAdmit()!= null)
        {
            admitDateTxt.setText(new SimpleDateFormat("MM-dd-yyyy").format(patient.getPdob()));
        }
        
        injuryTxt.setText(patient.getpInjuryType());
        bloodGrpTxt.setText(patient.getpBloodType());
        patientStatusTxt.setText(patient.getpStatus());
        
        ImageIcon ii = new ImageIcon(patient.getpImageUrl());
        Image image = ii.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        lblPhotoImage.setIcon(new ImageIcon(image));


    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoctorTable;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField admitDateTxt;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton assignDocBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField birthDateTxt;
    private javax.swing.JTextField bloodGrpTxt;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JTextField gengerTxt;
    private javax.swing.JTextField injuryTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JLabel lblPhotoImage;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JTextField patientStatusTxt;
    // End of variables declaration//GEN-END:variables

}
