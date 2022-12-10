/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.Police;

import BusinessModel.Ecosystem;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daddy
 */
public class PastInfo extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
        JPanel userProcont;
    Patient pat;
    Ecosystem ecoSystem;
    User userAcc;
    public PastInfo(JPanel userProcessContainer, Ecosystem business, Patient p,User account) {
        initComponents();
        this.ecoSystem = business;
        this.userProcont = userProcessContainer;
        this.pat = p;
        this.userAcc = account;
        fNameTxt.setText(p.getpFirstName());
        lNameTxt.setText(p.getpLastName());
        addressTxt.setText(p.getpAddress());
        try{
        SimpleDateFormat input =new SimpleDateFormat("yyyy-MM-dd");
        birthDateTxt.setText((input.format(p.getPdob())));
        }
        catch(Exception e){}
        genderTxt.setText(p.getpGender());
        insuranceIDTxt.setText(p.getpHealthInsuranceID());
        mobileTxt.setText(p.getpPhoneNo());
        accidentLocTxt.setText(p.getpAccidentLocation());
        policeVerifyTxt.setText(p.getpPoliceStatus());
        
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
        lblPatientPhone = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        lblPatientAddress = new javax.swing.JLabel();
        insuranceIDTxt = new javax.swing.JTextField();
        lblPatientHealthInsuranceID = new javax.swing.JLabel();
        genderTxt = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        mobileTxt = new javax.swing.JTextField();
        fNameTxt = new javax.swing.JTextField();
        lblPatientFirstName = new javax.swing.JLabel();
        birthDateTxt = new javax.swing.JTextField();
        lblPatientAge = new javax.swing.JLabel();
        lNameTxt = new javax.swing.JTextField();
        lblPatientLastName = new javax.swing.JLabel();
        policeVerifyTxt = new javax.swing.JTextField();
        lblPatientPhone1 = new javax.swing.JLabel();
        lblPatientHealthInsuranceID1 = new javax.swing.JLabel();
        accidentLocTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERSON INFORMATION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1390, 80));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 127, 1402, 10));

        lblPatientPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setText("Phone Number");
        add(lblPatientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, -1, -1));

        addressTxt.setEditable(false);
        addressTxt.setBackground(new java.awt.Color(153, 153, 255));
        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 150, 31));

        lblPatientAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setText("Address");
        add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, -1, -1));

        insuranceIDTxt.setEditable(false);
        insuranceIDTxt.setBackground(new java.awt.Color(153, 153, 255));
        insuranceIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insuranceIDTxtActionPerformed(evt);
            }
        });
        add(insuranceIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 150, 31));

        lblPatientHealthInsuranceID.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientHealthInsuranceID.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID.setText("InsuranceID");
        add(lblPatientHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 128, 30));

        genderTxt.setEditable(false);
        genderTxt.setBackground(new java.awt.Color(153, 153, 255));
        add(genderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 440, 150, 31));

        lblPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientGender.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setText("Gender");
        add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 98, -1));

        mobileTxt.setEditable(false);
        mobileTxt.setBackground(new java.awt.Color(153, 153, 255));
        add(mobileTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 150, 31));

        fNameTxt.setEditable(false);
        fNameTxt.setBackground(new java.awt.Color(153, 153, 255));
        add(fNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 391, 150, 31));

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setText("First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 394, 116, -1));

        birthDateTxt.setEditable(false);
        birthDateTxt.setBackground(new java.awt.Color(153, 153, 255));
        birthDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthDateTxtActionPerformed(evt);
            }
        });
        add(birthDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 391, 150, 31));

        lblPatientAge.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientAge.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setText("DOB");
        add(lblPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 394, 90, -1));

        lNameTxt.setEditable(false);
        lNameTxt.setBackground(new java.awt.Color(153, 153, 255));
        lNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTxtActionPerformed(evt);
            }
        });
        add(lNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 150, 31));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setText("Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 116, -1));

        policeVerifyTxt.setEditable(false);
        policeVerifyTxt.setBackground(new java.awt.Color(153, 153, 255));
        add(policeVerifyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, 150, 31));

        lblPatientPhone1.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientPhone1.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone1.setText("Police Verification");
        add(lblPatientPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, -1, -1));

        lblPatientHealthInsuranceID1.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientHealthInsuranceID1.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID1.setText("Accident Location");
        add(lblPatientHealthInsuranceID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, -1, -1));

        accidentLocTxt.setEditable(false);
        accidentLocTxt.setBackground(new java.awt.Color(153, 153, 255));
        accidentLocTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accidentLocTxtActionPerformed(evt);
            }
        });
        add(accidentLocTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 540, 150, 31));

        backBtn.setBackground(new java.awt.Color(0, 51, 255));
        backBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 690, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/doctor2.jpeg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 100, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void insuranceIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insuranceIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insuranceIDTxtActionPerformed

    private void birthDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthDateTxtActionPerformed

    private void lNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameTxtActionPerformed

    private void accidentLocTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accidentLocTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accidentLocTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        
        PoliceWorkAreaJPanel bill = new PoliceWorkAreaJPanel(userProcont,userAcc,ecoSystem);
        userProcont.add("Police Workarea", bill);
        CardLayout layout = (CardLayout) userProcont.getLayout();
        layout.next(userProcont);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accidentLocTxt;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField birthDateTxt;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JTextField insuranceIDTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lNameTxt;
    private javax.swing.JLabel lblPatientAddress;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientHealthInsuranceID;
    private javax.swing.JLabel lblPatientHealthInsuranceID1;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPatientPhone;
    private javax.swing.JLabel lblPatientPhone1;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JTextField policeVerifyTxt;
    // End of variables declaration//GEN-END:variables
}
