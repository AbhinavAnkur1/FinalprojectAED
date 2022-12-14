/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainUserInterface.Doctor;

import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author daddy
 */
public class DoctorRequestBloodJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorRequestBloodJPanel
     */
    private JPanel userProCont;
    private Ecosystem ecosystem;
    private User userAcc;
    private Patient pat;

    public DoctorRequestBloodJPanel(JPanel userProcessContainer, User account, Ecosystem ecosystem, Patient patient) {
        initComponents();
        this.userProCont = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = account;
        this.pat = patient;
        selectBloodBagQuantityDropDown.addItem("Select Quantity");
        selectBloodBagQuantityDropDown.addItem("1");
        selectBloodBagQuantityDropDown.addItem("2");
        selectBloodBagQuantityDropDown.addItem("3");
        selectBloodBagQuantityDropDown.addItem("4");
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
        selectBloodBagQuantityDropDown = new javax.swing.JComboBox<>();
        lblRequestBloodQuantity = new javax.swing.JLabel();
        processReqBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Request Blood");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 40, 1274, -1));

        selectBloodBagQuantityDropDown.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        selectBloodBagQuantityDropDown.setForeground(new java.awt.Color(0, 102, 102));
        selectBloodBagQuantityDropDown.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        selectBloodBagQuantityDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBloodBagQuantityDropDownActionPerformed(evt);
            }
        });
        add(selectBloodBagQuantityDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 162, 180, 40));

        lblRequestBloodQuantity.setBackground(new java.awt.Color(255, 255, 255));
        lblRequestBloodQuantity.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        lblRequestBloodQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblRequestBloodQuantity.setText("Select Blood Bag Quantity");
        add(lblRequestBloodQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 260, 40));

        processReqBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        processReqBtn.setForeground(new java.awt.Color(255, 0, 0));
        processReqBtn.setText("Process Request");
        processReqBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        processReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processReqBtnActionPerformed(evt);
            }
        });
        add(processReqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 197, 40));

        backBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 102, 102));
        backBtn.setText("<< BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 128, 42));
    }// </editor-fold>//GEN-END:initComponents

    private void selectBloodBagQuantityDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBloodBagQuantityDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectBloodBagQuantityDropDownActionPerformed

    private void processReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processReqBtnActionPerformed
        // TODO add your handling code here:

        if (!((String) selectBloodBagQuantityDropDown.getSelectedItem()).equals("Select Quantity")) {

            pat.setpBloodBankStatus("Requested");
            pat.setpBloodBagQuantity((String) selectBloodBagQuantityDropDown.getSelectedItem());
            
            JOptionPane.showMessageDialog(null, "Blood Request Sent", "Information Message", JOptionPane.INFORMATION_MESSAGE);
            DoctorVisitJPanel doctorVisit = new DoctorVisitJPanel(userProCont, userAcc, ecosystem, pat);
            userProCont.add("Visit Doctor", doctorVisit);
            CardLayout layout = (CardLayout) userProCont.getLayout();
            layout.next(userProCont);
        }
    }//GEN-LAST:event_processReqBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        DoctorVisitJPanel doctorVisit = new DoctorVisitJPanel(userProCont, userAcc, ecosystem, pat);
        userProCont.add("Visit Doctor", doctorVisit);
        CardLayout layout = (CardLayout) userProCont.getLayout();
        layout.next(userProCont);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblRequestBloodQuantity;
    private javax.swing.JButton processReqBtn;
    private javax.swing.JComboBox<String> selectBloodBagQuantityDropDown;
    // End of variables declaration//GEN-END:variables
}
