/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MainUserInterface.Doctor;

import BusinessModel.Ecosystem;
import BusinessModel.Labs.Tests;
import BusinessModel.Patient.PatientBills;
import BusinessModel.Patient.Patient;
import BusinessModel.Pharma.Medicine;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mayurchaudhari
 */
public class DocMedicineRequest extends javax.swing.JPanel {

    /** Creates new form DocMedicineRequest */
    
    private JPanel userProcessContainer;
    private Ecosystem ecosystem;
    private User userAccount;
    private Patient patient;
    Medicine m;
    ArrayList<Medicine> items=new ArrayList<Medicine>();

    
    public DocMedicineRequest(JPanel userProcessContainer, User account, Ecosystem ecosystem, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.patient = patient;
        populatetableMedicine();
    }

    
        private void populatetableMedicine() {
        DefaultTableModel model = (DefaultTableModel) tableRequestMedicine1.getModel();

        model.setRowCount(0); 

        for (Medicine t : ecosystem.getPharma().getmedList()) {

            
               Object[] row = new Object[4];                
                row[0] = t;
                row[1] = t.getMedUsage();
                row[2] =t.getMedQuant();
                row[3] = t.getMedPrice();
                model.addRow(row);
        }
    }
        
        public void populateCart(Medicine item){
        DefaultTableModel model = (DefaultTableModel) cartTableMedicines.getModel();
        model.setRowCount(0);
        
         items.add(item);
         Object[] row = new Object[4];
                for(Medicine t:items){
                     row[0] = t;
                row[1] = t.getMedUsage();
                row[2] =t.getMedQuant();
                row[3] = t.getMedPrice();
                model.addRow(row);
                }  
     }
    private void populatePatientTable() {
        //DefaultTableModel model = (DefaultTableModel) tableAddedLabTest.getModel();

        //model.setRowCount(0);

        for (Patient patient : ecosystem.getPatientDirect().getPatientList()) {

            Object[] row = new Object[7];
            row[0] = patient.getpUserName();
            row[1] = patient.getpHealthInsuranceID();
            row[2] = patient.getpFirstName();
            row[3] = patient.getpLastName();
            row[4] = patient.getpAge();
            row[5] = patient.getpAddress();
            row[6] = patient.getpEmailAddress();
            
          //  model.addRow(row);

        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTableMedicines = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRequestMedicine1 = new javax.swing.JTable();
        removeMedBtn = new javax.swing.JButton();
        addMedBtn = new javax.swing.JButton();
        reqMedBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Request Medicines");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 350, -1));

        cartTableMedicines.setBackground(new java.awt.Color(204, 255, 204));
        cartTableMedicines.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.gray));
        cartTableMedicines.setFont(new java.awt.Font("Futura", 1, 14)); // NOI18N
        cartTableMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Med Name", "Med Usage", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cartTableMedicines);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 500, 170));

        tableRequestMedicine1.setBackground(new java.awt.Color(204, 204, 204));
        tableRequestMedicine1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.gray));
        tableRequestMedicine1.setFont(new java.awt.Font("Futura", 1, 14)); // NOI18N
        tableRequestMedicine1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Med Name", "Med Usage", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableRequestMedicine1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 510, 170));

        removeMedBtn.setBackground(new java.awt.Color(255, 0, 0));
        removeMedBtn.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        removeMedBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeMedBtn.setText("<< REMOVE");
        removeMedBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.gray));
        removeMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMedBtnActionPerformed(evt);
            }
        });
        add(removeMedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 120, 46));

        addMedBtn.setBackground(new java.awt.Color(204, 255, 204));
        addMedBtn.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        addMedBtn.setForeground(new java.awt.Color(0, 102, 102));
        addMedBtn.setText("ADD >>");
        addMedBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.gray));
        addMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedBtnActionPerformed(evt);
            }
        });
        add(addMedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 120, 47));

        reqMedBtn.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        reqMedBtn.setForeground(new java.awt.Color(255, 0, 51));
        reqMedBtn.setText("REQUEST MEDICINE");
        reqMedBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.gray));
        reqMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqMedBtnActionPerformed(evt);
            }
        });
        add(reqMedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 180, 42));

        backBtn.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 0, 51));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/back.png"))); // NOI18N
        backBtn.setText(" BACK");
        backBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.gray));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, 140, 42));

        jLabel2.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Available Medicine");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selected Medicine");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/request.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 30, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void removeMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMedBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = cartTableMedicines.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Medicine item=(Medicine)cartTableMedicines.getValueAt(selectedRow, 0);
            items.remove(item);
            DefaultTableModel model = (DefaultTableModel) cartTableMedicines.getModel();
        model.setRowCount(0);
            Object[] row = new Object[4];
                for(Medicine t:items){
                        row[0] = t;
                row[1] = t.getMedUsage();
                row[2] =t.getMedQuant();
                row[3] = t.getMedPrice();
                model.addRow(row);
                }
        }
     
    }//GEN-LAST:event_removeMedBtnActionPerformed

    private void addMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedBtnActionPerformed
        // TODO add your handling code here:
                int selectedRow = tableRequestMedicine1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Medicine item=(Medicine)tableRequestMedicine1.getValueAt(selectedRow, 0);
            
            populateCart(item);
          
        }
    }//GEN-LAST:event_addMedBtnActionPerformed

    private void reqMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqMedBtnActionPerformed
        // TODO add your handling code here:
        if(items.size()==0){
            JOptionPane.showMessageDialog(null,"Please add test to the cart.","Warning",JOptionPane.WARNING_MESSAGE);

        }
        else{
            for(Medicine t:items){
                //String itemName,String organization1,float itemAmount, String result, String itemStatus

                PatientBills bill = new PatientBills(t.getMedName(), "Pharmacy", t.getMedPrice(),"","Requested");
                patient.addbill(bill);
                
                //ecosystem.AddTreatedPatientList(patient);
            }
            ecosystem.getPharma().AddpharmaRecordList(patient);
            patient.setpPharmaStatus("Requested");
            
            DocVisit doctorVisit = new DocVisit(userProcessContainer, userAccount, ecosystem, patient);
            userProcessContainer.add("Visit Doctor", doctorVisit);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_reqMedBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        DocVisit doctorVisit = new DocVisit(userProcessContainer, userAccount, ecosystem, patient);
        userProcessContainer.add("Visit Doctor", doctorVisit);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable cartTableMedicines;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeMedBtn;
    private javax.swing.JButton reqMedBtn;
    private javax.swing.JTable tableRequestMedicine1;
    // End of variables declaration//GEN-END:variables

}
