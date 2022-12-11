/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.ReceptionRole;

import BusinessModel.Ecosystem;

import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import MainUserInterface.Ambulance.AmbulanceWorkAreaJPanel;

//import MainUserInterface.Patient.PatientBillJPanel;


/**
 *
 * @author indian
 */
public class ReceptionWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
    private final JPanel userProCont;

    private final Ecosystem ecoSystem;
    User userAcc;

    public ReceptionWorkAreaJPanel(JPanel userProcessContainer, User account, Ecosystem system) {

        initComponents();
        System.out.println("inside Reception work area");
        this.userProCont = userProcessContainer;
        this.ecoSystem = system;
        System.out.println("existing patients in the portal ---");
        for (Patient patient : ecoSystem.getPatientDirect().getPatientList()) {
            System.out.println("patient---"+patient.getpFirstName());
        }
        populateNetworkTable();
    }

    private void populateNetworkTable() {
        
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        model.setRowCount(0);
        for (Patient patient : ecoSystem.getPatientDirect().getPatientList()) {
            Object[] row = new Object[11];
            row[0] = patient.getpFirstName();
            row[1] = patient.getpLastName();
            row[2] = patient.getpHealthInsuranceID();
            row[3] = patient.getpAge(); 
            row[4] = patient.getpEmailAddress();
            row[5] = patient.getpStatus();
            row[6] = patient;
            if(!patient.getpStatus().equals("Discharged")){
            model.addRow(row);}
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createPatBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        billPatBtn = new javax.swing.JButton();
        delPatBtn = new javax.swing.JButton();
        ambulanceRecBtn = new javax.swing.JButton();
        updatePatBtn = new javax.swing.JButton();
        dischargePatientBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dischargePatBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setToolTipText("");
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createPatBtn.setBackground(new java.awt.Color(0, 0, 153));
        createPatBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        createPatBtn.setForeground(new java.awt.Color(255, 255, 255));
        createPatBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/add.png"))); // NOI18N
        createPatBtn.setText("Create New Patient");
        createPatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatBtnActionPerformed(evt);
            }
        });
        add(createPatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 250, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 160, 80));

        patientTable.setBackground(new java.awt.Color(204, 255, 255));
        patientTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patientTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First name", "Last name", "Insurance Id", "Age", "Email Id", "Status", "Ob"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientTable);
        if (patientTable.getColumnModel().getColumnCount() > 0) {
            patientTable.getColumnModel().getColumn(6).setMinWidth(0);
            patientTable.getColumnModel().getColumn(6).setPreferredWidth(0);
            patientTable.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 1230, 280));

        billPatBtn.setBackground(new java.awt.Color(0, 0, 153));
        billPatBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        billPatBtn.setForeground(new java.awt.Color(255, 255, 255));
        billPatBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/icons8-qualification-45.png"))); // NOI18N
        billPatBtn.setText("Bill the Patient");
        billPatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billPatBtnActionPerformed(evt);
            }
        });
        add(billPatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 490, 230, 50));

        delPatBtn.setBackground(new java.awt.Color(0, 0, 153));
        delPatBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        delPatBtn.setForeground(new java.awt.Color(255, 255, 255));
        delPatBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/delete.png"))); // NOI18N
        delPatBtn.setText("Delete Patient");
        delPatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delPatBtnActionPerformed(evt);
            }
        });
        add(delPatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 200, 50));

        ambulanceRecBtn.setBackground(new java.awt.Color(0, 0, 153));
        ambulanceRecBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        ambulanceRecBtn.setForeground(new java.awt.Color(255, 255, 255));
        ambulanceRecBtn.setText("Ambulance Record");
        ambulanceRecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambulanceRecBtnActionPerformed(evt);
            }
        });
        add(ambulanceRecBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, 210, 30));

        updatePatBtn.setBackground(new java.awt.Color(0, 0, 153));
        updatePatBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        updatePatBtn.setForeground(new java.awt.Color(255, 255, 255));
        updatePatBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/icons8-update-40.png"))); // NOI18N
        updatePatBtn.setText("Update Patient");
        updatePatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePatBtnActionPerformed(evt);
            }
        });
        add(updatePatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 230, 50));

        dischargePatientBtn.setBackground(new java.awt.Color(0, 0, 153));
        dischargePatientBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        dischargePatientBtn.setForeground(new java.awt.Color(255, 255, 255));
        dischargePatientBtn.setText("Discharged Patients");
        dischargePatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dischargePatientBtnActionPerformed(evt);
            }
        });
        add(dischargePatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 220, 30));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Current Patients List");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/icons8-hospital-50.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/icons8-patient-50 (1).png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        dischargePatBtn.setBackground(new java.awt.Color(0, 0, 153));
        dischargePatBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        dischargePatBtn.setForeground(new java.awt.Color(255, 255, 255));
        dischargePatBtn.setText("Discharge a Patient");
        dischargePatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dischargePatBtnActionPerformed(evt);
            }
        });
        add(dischargePatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, 210, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void createPatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatBtnActionPerformed
        // TODO add your handling code here:
        try{
            CreatePatientJPanel createPatient = new CreatePatientJPanel(userProCont, ecoSystem, userAcc);
            userProCont.add("Add Patient", createPatient);
            CardLayout layout = (CardLayout) userProCont.getLayout();
            layout.next(userProCont);
        }catch(Exception e){
            System.out.println("exception due to---"+e.getMessage());
        }
        
    }//GEN-LAST:event_createPatBtnActionPerformed

    private void billPatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billPatBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientTable.getSelectedRow();
        if (selectedRow >= 0) {

            Patient patient = (Patient) patientTable.getValueAt(selectedRow, 6);
            BillJPanel patientBillJPanel = new BillJPanel(userProCont, patient,userAcc,ecoSystem);
            userProCont.add("Patient Bill", patientBillJPanel);
            CardLayout layout = (CardLayout) userProCont.getLayout();
            layout.next(userProCont);
            populateNetworkTable();

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Patient!");
        }

    }//GEN-LAST:event_billPatBtnActionPerformed

    private void delPatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delPatBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Delete User: " + "??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                
                Patient p = (Patient) patientTable.getValueAt(selectedRow, 6);
                //System.out.print(p.getGender());
                ecoSystem.getUserAccountDirectory().deleteUser(p.getpUserName());
                //UserAccount user = (UserAccount) networkJTable.getValueAt(selectedRow, 0); 
                ecoSystem.getPatientDirect().deletePatient(p);
                populateNetworkTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Patient!");
        }
    }//GEN-LAST:event_delPatBtnActionPerformed

    private void ambulanceRecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambulanceRecBtnActionPerformed
        // TODO add your handling code here:
        try{
            System.out.println("ambulance record button clicked");
            AmbulanceWorkAreaJPanel ambulanceWAJPanel = new AmbulanceWorkAreaJPanel(userProCont, userAcc, ecoSystem);
            //AmbulanceWorkAreaJPanel ambulanceWorkAreaJPanel = new AmbulanceWorkAreaJPanel(userProCont, userAcc, ecoSystem);
            userProCont.add("AmbulanceWorkArea", ambulanceWAJPanel);
            CardLayout layout = (CardLayout) userProCont.getLayout();
            layout.next(userProCont);
        }
        catch(Exception e){
            System.out.println("exception due to---"+e.getMessage());
        }
        
    }//GEN-LAST:event_ambulanceRecBtnActionPerformed

    private void updatePatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePatBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientTable.getSelectedRow();
        if (selectedRow >= 0) {

            Patient patient = (Patient) patientTable.getValueAt(selectedRow, 6);
            UpdatePatientJPanel ambulanceWorkAreaJPanel = new UpdatePatientJPanel(userProCont, ecoSystem, userAcc, patient);
            userProCont.add("Discharge", ambulanceWorkAreaJPanel);
            CardLayout layout = (CardLayout) userProCont.getLayout();
            layout.next(userProCont);

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Patient!");
        }

    }//GEN-LAST:event_updatePatBtnActionPerformed

    private void dischargePatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dischargePatBtnActionPerformed
        // TODO add your handling code here:
        ReceptionDischarge receptionDischarge = new ReceptionDischarge(userProCont, userAcc, ecoSystem);
        userProCont.add("Discharge", receptionDischarge);
        CardLayout layout = (CardLayout) userProCont.getLayout();
        layout.next(userProCont);
    }//GEN-LAST:event_dischargePatBtnActionPerformed

    private void dischargePatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dischargePatientBtnActionPerformed
        // TODO add your handling code here:
        PastRecords pastRecords = new PastRecords(userProCont, userAcc, ecoSystem);
        userProCont.add("Past Records", pastRecords);
        CardLayout layout = (CardLayout) userProCont.getLayout();
        layout.next(userProCont);
    }//GEN-LAST:event_dischargePatientBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambulanceRecBtn;
    private javax.swing.JButton billPatBtn;
    private javax.swing.JButton createPatBtn;
    private javax.swing.JButton delPatBtn;
    private javax.swing.JButton dischargePatBtn;
    private javax.swing.JButton dischargePatientBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton updatePatBtn;
    // End of variables declaration//GEN-END:variables
}
