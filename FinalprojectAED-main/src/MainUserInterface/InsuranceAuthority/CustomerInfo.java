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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indian
 */
public class CustomerInfo extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
        JPanel userProCont;
    Patient pat;
    User userAcc;
    Ecosystem ecoSystem;
    public CustomerInfo(JPanel userProcessContainer, Ecosystem business, Patient p, User account) {
        initComponents();
        this.ecoSystem = business;
        this.userProCont = userProcessContainer;
        this.pat = p;
        this.userAcc = account;
        fNameTxt.setText(p.getpFirstName());
        lNameTxt.setText(p.getpLastName());
        addressTxt.setText(p.getpAddress());
        ageTxt.setText(Integer.toString(p.getpAge()));
        genderTxt.setText(p.getpGender());
        insuranceIDTxt.setText(p.getpHealthInsuranceID());
        mobileTxt.setText(p.getpPhoneNo());
        policeVerifyxt.setText(p.getpPoliceStatus());
        try{
            String s = p.getpHealthInsuranceID().substring(3,7)+"-"+p.getpHealthInsuranceID().substring(7,9)+"-"+p.getpHealthInsuranceID().substring(9,11);
            SimpleDateFormat input =new SimpleDateFormat("yyyy-MM-dd");
            Date d = input.parse(s);
            Date today = new Date();
            s = input.format(today);
            today = input.parse(s);
            System.out.print(s + d);
            int r = d.compareTo(today);
            if(r>0){
            //System.out.print("Not Expired");
            jLabel2.setText("Valid Insurance");
            } 
            else{
                //System.out.print("Expired");
                jLabel3.setText("Insurance Expired");
            }
        }
        catch(Exception e){
            jLabel3.setText("Invalid Insurance ID");
        }
        jLabel4.setText("Bill Total: "+ecoSystem.getPatientDirect().billTotal(pat));
        populateBillTable();
    }
          private void populateBillTable() {
        DefaultTableModel model = (DefaultTableModel) customerInformaitonInsuranceTable.getModel();

        model.setRowCount(0);

        for (PatientBills b : pat.getpBills()) {

            Object[] row = new Object[7];
            row[0] = b.getName();
            row[1] = b.getOrgType();
            row[2] = b.getAmount();
            model.addRow(row);

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
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerInformaitonInsuranceTable = new javax.swing.JTable();
        lblpPhone = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        lblpAddress = new javax.swing.JLabel();
        insuranceIDTxt = new javax.swing.JTextField();
        lblpHealthInsuranceID = new javax.swing.JLabel();
        genderTxt = new javax.swing.JTextField();
        lblpGender = new javax.swing.JLabel();
        mobileTxt = new javax.swing.JTextField();
        fNameTxt = new javax.swing.JTextField();
        lblpFirstName = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        lblpAge = new javax.swing.JLabel();
        lNameTxt = new javax.swing.JTextField();
        lblpLastName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        approveBtn = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();
        verificationBtn = new javax.swing.JButton();
        policeVerifyxt = new javax.swing.JTextField();
        lblpVerification = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Information");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 590, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1392, 10));

        customerInformaitonInsuranceTable.getTableHeader().setFont(new java.awt.Font("Trebuchet MS", 1, 16));
        customerInformaitonInsuranceTable.setBackground(new java.awt.Color(255, 255, 204));
        customerInformaitonInsuranceTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        customerInformaitonInsuranceTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(customerInformaitonInsuranceTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 680, 460));

        lblpPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblpPhone.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblpPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblpPhone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblpPhone.setText("Phone Number");
        add(lblpPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, 30));

        addressTxt.setEditable(false);
        addressTxt.setBackground(new java.awt.Color(255, 255, 153));
        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 150, 40));

        lblpAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblpAddress.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblpAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblpAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblpAddress.setText("Address");
        add(lblpAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 76, 18));

        insuranceIDTxt.setEditable(false);
        insuranceIDTxt.setBackground(new java.awt.Color(255, 255, 153));
        insuranceIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insuranceIDTxtActionPerformed(evt);
            }
        });
        add(insuranceIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 150, 40));

        lblpHealthInsuranceID.setBackground(new java.awt.Color(255, 255, 255));
        lblpHealthInsuranceID.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblpHealthInsuranceID.setForeground(new java.awt.Color(255, 255, 255));
        lblpHealthInsuranceID.setText("Insurance Id");
        add(lblpHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 106, -1));

        genderTxt.setEditable(false);
        genderTxt.setBackground(new java.awt.Color(255, 255, 153));
        add(genderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 150, 40));

        lblpGender.setBackground(new java.awt.Color(255, 255, 255));
        lblpGender.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblpGender.setForeground(new java.awt.Color(255, 255, 255));
        lblpGender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblpGender.setText("Gender");
        add(lblpGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 98, 30));

        mobileTxt.setEditable(false);
        mobileTxt.setBackground(new java.awt.Color(255, 255, 153));
        mobileTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileTxtActionPerformed(evt);
            }
        });
        add(mobileTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 150, 40));

        fNameTxt.setEditable(false);
        fNameTxt.setBackground(new java.awt.Color(255, 255, 153));
        add(fNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 150, 40));

        lblpFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblpFirstName.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblpFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblpFirstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblpFirstName.setText("First Name");
        add(lblpFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 116, -1));

        ageTxt.setEditable(false);
        ageTxt.setBackground(new java.awt.Color(255, 255, 153));
        ageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtActionPerformed(evt);
            }
        });
        add(ageTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 150, 40));

        lblpAge.setBackground(new java.awt.Color(255, 255, 255));
        lblpAge.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblpAge.setForeground(new java.awt.Color(255, 255, 255));
        lblpAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblpAge.setText("Age");
        add(lblpAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 50, -1));

        lNameTxt.setEditable(false);
        lNameTxt.setBackground(new java.awt.Color(255, 255, 153));
        lNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTxtActionPerformed(evt);
            }
        });
        add(lNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 216, 150, 40));

        lblpLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblpLastName.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblpLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblpLastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblpLastName.setText("Last Name");
        add(lblpLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 116, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 308, 33));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 284, 304, 33));

        approveBtn.setBackground(new java.awt.Color(0, 255, 0));
        approveBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        approveBtn.setForeground(new java.awt.Color(255, 255, 255));
        approveBtn.setText("Approve");
        approveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBtnActionPerformed(evt);
            }
        });
        add(approveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 140, 30));

        rejectBtn.setBackground(new java.awt.Color(255, 0, 51));
        rejectBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        rejectBtn.setForeground(new java.awt.Color(255, 255, 255));
        rejectBtn.setText("Reject");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });
        add(rejectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 630, 120, 30));

        verificationBtn.setBackground(new java.awt.Color(0, 51, 255));
        verificationBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        verificationBtn.setForeground(new java.awt.Color(255, 255, 255));
        verificationBtn.setText("Send for Verification");
        verificationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificationBtnActionPerformed(evt);
            }
        });
        add(verificationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, 220, 30));

        policeVerifyxt.setEditable(false);
        policeVerifyxt.setBackground(new java.awt.Color(255, 255, 153));
        policeVerifyxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policeVerifyxtActionPerformed(evt);
            }
        });
        add(policeVerifyxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 150, 40));

        lblpVerification.setBackground(new java.awt.Color(255, 255, 255));
        lblpVerification.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblpVerification.setForeground(new java.awt.Color(255, 255, 255));
        lblpVerification.setText("Police Verification");
        add(lblpVerification, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 156, -1));

        backBtn.setBackground(new java.awt.Color(0, 153, 204));
        backBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 540, 210, 41));
    }// </editor-fold>//GEN-END:initComponents

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void insuranceIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insuranceIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insuranceIDTxtActionPerformed

    private void ageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtActionPerformed

    private void lNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameTxtActionPerformed

    private void approveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBtnActionPerformed
        // TODO add your handling code here:
        pat.setpInsuranceStatus("Approved");
        try{
        //ecoSystem.sendEmail("hospital.aed@zohomail.com", "Approval Confirmation for "+pat.getpFirstName(), "Patient Insurance Approved Name: "+pat.getpFirstName()+" "+pat.getpLastName(), "insurance.aed@zohomail.com", "Bangbang@8899");
        }
        catch(Exception e){}
        InsuranceWorkAreaJPanel bill = new InsuranceWorkAreaJPanel(userProCont, userAcc, ecoSystem);
        userProCont.add("Insurance main", bill);
        CardLayout layout = (CardLayout) userProCont.getLayout();
        layout.next(userProCont);
    }//GEN-LAST:event_approveBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        // TODO add your handling code here:
        pat.setpInsuranceStatus("Rejected");
        InsuranceWorkAreaJPanel bill = new InsuranceWorkAreaJPanel(userProCont, userAcc, ecoSystem);
        userProCont.add("Insurance main", bill);
        CardLayout layout = (CardLayout) userProCont.getLayout();
        layout.next(userProCont);
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void verificationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificationBtnActionPerformed
        // TODO add your handling code here:
        if(pat.getpPoliceStatus().equals("Verifying")||pat.getpPoliceStatus().equals("Verified")||pat.getpPoliceStatus().equals("Rejected")){
            JOptionPane.showMessageDialog(null, "Already verifying/Verified.");
        }
        else{
        pat.setpPoliceStatus("Verifying");
        ecoSystem.getPoliceRecords().addtoRecord(pat);
        policeVerifyxt.setText(pat.getpPoliceStatus());
        }
    }//GEN-LAST:event_verificationBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        //patient.setInsuranceStatus("Approved");
        InsuranceWorkAreaJPanel bill = new InsuranceWorkAreaJPanel(userProCont, userAcc, ecoSystem);
        userProCont.add("Insurance main", bill);
        CardLayout layout = (CardLayout) userProCont.getLayout();
        layout.next(userProCont);
    }//GEN-LAST:event_backBtnActionPerformed

    private void policeVerifyxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policeVerifyxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_policeVerifyxtActionPerformed

    private void mobileTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton approveBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable customerInformaitonInsuranceTable;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JTextField insuranceIDTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lNameTxt;
    private javax.swing.JLabel lblpAddress;
    private javax.swing.JLabel lblpAge;
    private javax.swing.JLabel lblpFirstName;
    private javax.swing.JLabel lblpGender;
    private javax.swing.JLabel lblpHealthInsuranceID;
    private javax.swing.JLabel lblpLastName;
    private javax.swing.JLabel lblpPhone;
    private javax.swing.JLabel lblpVerification;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JTextField policeVerifyxt;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JButton verificationBtn;
    // End of variables declaration//GEN-END:variables
}