/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.InsuranceAuthority;

import BusinessModel.Ecosystem;
import BusinessModel.Patient.PatientBills;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import MainUserInterface.Patient.PatientBillJPanel;

/**
 *
 * @author indian
 */
public class InsuranceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
    private final JPanel userProCont;
    private final Ecosystem ecoSystem;
    User userAcc;
    public InsuranceWorkAreaJPanel(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProCont = userProcessContainer;
        this.ecoSystem = system;
        this.userAcc = account;
        populatePatientTable();
        
        
    }
          private void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) PatientTbl.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoSystem.getInsuranceDirect().getInsuranceRecord()) {

            Object[] row = new Object[8];
            row[0] = patient.getpFirstName();
            row[1] = patient.getpLastName();
            row[2] = Float.toString(ecoSystem.getPatientDirect().billTotal(patient));
            row[3] = patient.getpHealthInsuranceID();
            row[4] = patient.getpEmailAddress();
            row[5] = patient.getpPoliceStatus();
            row[6] = patient.getpInsuranceStatus();
            row[7] = patient;
            if(patient.getpInsuranceStatus().equals("Verifying Insurance")){
            model.addRow(row);
            }

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

        jLabel1 = new javax.swing.JLabel();
        viewDetailsBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        PatientTbl = new javax.swing.JTable();
        viewPastRecBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insurer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 50, 1380, -1));

        viewDetailsBtn.setBackground(new java.awt.Color(0, 153, 204));
        viewDetailsBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        viewDetailsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewDetailsBtn.setText("View Details");
        viewDetailsBtn.setBorderPainted(false);
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });
        add(viewDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 150, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 126, 1380, 10));

        PatientTbl.getTableHeader().setFont(new java.awt.Font("Trebuchet MS", 1, 16));
        PatientTbl.setBackground(new java.awt.Color(255, 255, 204));
        PatientTbl.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        PatientTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Last", "Bill Total", "HealthId", "Email", "Police Verification", "Insurance Status", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(PatientTbl);
        if (PatientTbl.getColumnModel().getColumnCount() > 0) {
            PatientTbl.getColumnModel().getColumn(7).setMinWidth(0);
            PatientTbl.getColumnModel().getColumn(7).setPreferredWidth(0);
            PatientTbl.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 980, 260));

        viewPastRecBtn.setBackground(new java.awt.Color(0, 153, 204));
        viewPastRecBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        viewPastRecBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewPastRecBtn.setText("View Past Records");
        viewPastRecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPastRecBtnActionPerformed(evt);
            }
        });
        add(viewPastRecBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 210, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = PatientTbl.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            Patient d = (Patient) PatientTbl.getValueAt(selectedRow, 7);
            //d.get
            CustomerInfo bill = new CustomerInfo(userProCont,ecoSystem, d, userAcc);
            userProCont.add("Customer Bill", bill);
            CardLayout layout = (CardLayout) userProCont.getLayout();
            layout.next(userProCont);
                   
          
        }
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void viewPastRecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPastRecBtnActionPerformed
        // TODO add your handling code here:
            InsurancePastCustomers bill = new InsurancePastCustomers(userProCont, userAcc,ecoSystem);
            userProCont.add("Past Customers", bill);
            CardLayout layout = (CardLayout) userProCont.getLayout();
            layout.next(userProCont);
    }//GEN-LAST:event_viewPastRecBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton viewDetailsBtn;
    private javax.swing.JButton viewPastRecBtn;
    // End of variables declaration//GEN-END:variables
}
