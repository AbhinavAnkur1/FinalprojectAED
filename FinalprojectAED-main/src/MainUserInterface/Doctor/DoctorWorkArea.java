/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainUserInterface.Doctor;

import BusinessModel.Doctor.Dr;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import MainUserInterface.DoctorAdministration.DisplayPatientInformation;
import MainUserInterface.Lab.LabWorkArea;
import MainUserInterface.Pharmacy.PharmacyWorkArea;

/**
 *
 * @author mayurchaudhari
 */
public class DoctorWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkArea
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;

    public DoctorWorkArea(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.userAccount = account;
        populatePatientTable();
        populatePatientTable1();
    }

    private void populatePatientTable() {
        try{
        DefaultTableModel model = (DefaultTableModel) PatientTable.getModel();
        model.setRowCount(0);
        for (Dr doctor : ecoSystem.getDoctorDirect().getDoctors()) {
            if (doctor.getdocUserName().equals(userAccount.getUserName())) {
                for (Patient patient : doctor.getTreatedPatientList()) 
                {
                    Object[] row = new Object[8];
                    row[0] = patient.getpFirstName();
                    row[1] = patient.getpLastName();
                    row[2] = patient.getpInjuryType();
                    row[3] = patient.getpBloodType();
                    row[4] = patient.getpAge();
                    row[5] = patient.getpGender();
                    row[6] = patient.getpStatus();
                    row[7] = patient;
                    if(!patient.getpStatus().equals("Discharged")){
                    model.addRow(row);}
                }
            }
        }
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("error message ---"+e.getMessage());
            System.out.println("no patients yet");
        }
    }
    private void populatePatientTable1() {
        try{
        DefaultTableModel model = (DefaultTableModel) PatientTable1.getModel();

        model.setRowCount(0);

        for (Dr doctor : ecoSystem.getDoctorDirect().getDoctors()) {
            if (doctor.getdocUserName().equals(userAccount.getUserName())) {
                for (Patient patient : doctor.getTreatedPatientList()) 
                {
                    Object[] row = new Object[8];
                    row[0] = patient.getpFirstName();
                    row[1] = patient.getpLastName();
                    row[2] = patient.getpInjuryType();
                    row[3] = patient.getpBloodType();
                    row[4] = patient.getpAge();
                    row[5] = patient.getpGender();
                    row[6] = patient.getpStatus();
                    row[7] = patient;
                    if(patient.getpStatus().equals("Discharged")){
                    model.addRow(row);}
                }
            }
        }
        }
        catch(Exception e){
            System.out.println("no patients yet");
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

        lblManageCustomers = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        visitBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        PatientTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageCustomers.setBackground(new java.awt.Color(0, 153, 204));
        lblManageCustomers.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        lblManageCustomers.setForeground(new java.awt.Color(255, 255, 255));
        lblManageCustomers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageCustomers.setText("Doctor WorkArea");
        add(lblManageCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 340, -1));

        PatientTable.setBackground(new java.awt.Color(204, 255, 255));
        PatientTable.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        PatientTable.setForeground(new java.awt.Color(0, 102, 102));
        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Injury", "Blood Type", "Age", "Gender", "Status", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PatientTable.setSelectionBackground(new java.awt.Color(0, 102, 102));
        PatientTable.setSelectionForeground(new java.awt.Color(204, 255, 255));
        jScrollPane2.setViewportView(PatientTable);
        if (PatientTable.getColumnModel().getColumnCount() > 0) {
            PatientTable.getColumnModel().getColumn(7).setMinWidth(0);
            PatientTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            PatientTable.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 740, 191));

        visitBtn.setBackground(new java.awt.Color(204, 255, 255));
        visitBtn.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        visitBtn.setForeground(new java.awt.Color(0, 102, 102));
        visitBtn.setText("Visit");
        visitBtn.setBorder(null);
        visitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitBtnActionPerformed(evt);
            }
        });
        add(visitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 120, 44));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 100, 1404, 10));

        PatientTable1.setBackground(new java.awt.Color(204, 255, 255));
        PatientTable1.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        PatientTable1.setForeground(new java.awt.Color(0, 102, 102));
        PatientTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Injury", "Blood Type", "Age", "Gender", "Status", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PatientTable1.setSelectionBackground(new java.awt.Color(0, 102, 102));
        PatientTable1.setSelectionForeground(new java.awt.Color(204, 255, 255));
        jScrollPane3.setViewportView(PatientTable1);
        if (PatientTable1.getColumnModel().getColumnCount() > 0) {
            PatientTable1.getColumnModel().getColumn(7).setMinWidth(0);
            PatientTable1.getColumnModel().getColumn(7).setPreferredWidth(0);
            PatientTable1.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 730, 191));

        jLabel1.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("My Previously Treated Patients");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 280, 34));

        jLabel2.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patients Assigned to me");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 220, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/doctor.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 70, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void visitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = PatientTable.getSelectedRow();
        if (selectedRowIndex < 0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {
            Patient patient = (Patient) PatientTable.getValueAt(selectedRowIndex, 7);
            if(patient.getpStatus().equals("Doctor Visiting")){
            JOptionPane.showMessageDialog(null, "Patient is in visit.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
            patient.setpStatus("Doctor Visiting");
            DocVisit doctorVisit = new DocVisit(userProcessContainer, userAccount, ecoSystem, patient);
            userProcessContainer.add("Visit Doctor", doctorVisit);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            }
        }
        
        
    }//GEN-LAST:event_visitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientTable;
    private javax.swing.JTable PatientTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblManageCustomers;
    private javax.swing.JButton visitBtn;
    // End of variables declaration//GEN-END:variables
}
