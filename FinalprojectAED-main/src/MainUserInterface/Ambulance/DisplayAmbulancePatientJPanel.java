/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainUserInterface.Ambulance;

import BusinessModel.Ambulance.Ambulance;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import MainUserInterface.ReceptionRole.UpdatePatientJPanel;

/**
 *
 * @author daddy
 */
public class DisplayAmbulancePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayAmbulancePatientJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    private User userAccount;

    public DisplayAmbulancePatientJPanel(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecoSystem = system;
        PopulateAmbulanceTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        AmbulanceTable = new javax.swing.JTable();
        btnCurrentPatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 246, 246));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AmbulanceTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AmbulanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Driver First Name", "Driver Last Name", "Age", "Vehicle Number", "Ambulance Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AmbulanceTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 1310, 191));

        btnCurrentPatient.setBackground(new java.awt.Color(0, 0, 204));
        btnCurrentPatient.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnCurrentPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnCurrentPatient.setText("Current Patient");
        btnCurrentPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrentPatientActionPerformed(evt);
            }
        });
        add(btnCurrentPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 140, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AMBULANCES DETAILS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 420, 80));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1432, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/icons8-ambulance-50.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 70, 50));

        jLabel3.setBackground(new java.awt.Color(238, 238, 238));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/details gif.gif"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 870, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void PopulateAmbulanceTable() {
        DefaultTableModel model = (DefaultTableModel) AmbulanceTable.getModel();

        model.setRowCount(0);

        for (Ambulance ambulance : ecoSystem.getAmbulanceDirect().getAmbu()) {

            Object[] row = new Object[5];
            row[0] = ambulance;
            row[1] = ambulance.getDriverLName();
            row[2] = ambulance.getAge_Driver();
            row[3] = ambulance.getVehicleNo();
            row[4] = ambulance.getStatus();
            model.addRow(row);

        }
    }
/**/
    private void btnCurrentPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurrentPatientActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = AmbulanceTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Ambulance ambulance = (Ambulance) AmbulanceTable.getValueAt(selectedRowIndex, 0);
            if (ambulance.getStatus().toLowerCase().equals("busy")) {
                CurrentPatientDetailsJPanel currentPatientDetailsJPanel = new CurrentPatientDetailsJPanel(userProcessContainer, userAccount, ecoSystem, ambulance);
                userProcessContainer.add("Display Current Patient", currentPatientDetailsJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            else
            {
                  JOptionPane.showMessageDialog(null, "No Active Patients Assigned", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCurrentPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AmbulanceTable;
    private javax.swing.JButton btnCurrentPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
