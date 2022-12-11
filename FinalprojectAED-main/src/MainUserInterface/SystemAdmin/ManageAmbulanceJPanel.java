/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainUserInterface.SystemAdmin;

import BusinessModel.Ecosystem;
import BusinessModel.UserAccount.User;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daddy
 */
public class ManageAmbulanceJPanel extends javax.swing.JPanel {

    private final JPanel userProCont;
    private final Ecosystem ecoSystem;
    User userAcc;

    /**
     * Creates new form ManageAmbulanceJPanel
     */
    public ManageAmbulanceJPanel(JPanel userProcessContainer, Ecosystem system)
    {
        initComponents();
        this.userProCont = userProcessContainer;
        this.ecoSystem = system;
        populateTable();
    }
    
   private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) ManageCustomersTable.getModel();

        model.setRowCount(0);

        for (User user : ecoSystem.getUserAccountDirectory().getUserAccountList()) {

            if ("Business.Role.AmbulanceDriverRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3];
                row[1] = user.getUserName();
                row[2] = user.getUserPassword();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ManageCustomersTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblManageCustomers1 = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JPasswordField();
        txtUserName1 = new javax.swing.JTextField();
        lblUserName1 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JPasswordField();
        submitBtn = new javax.swing.JButton();
        userNameTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 204));
        setForeground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageCustomersTable.setBackground(new java.awt.Color(153, 153, 153));
        ManageCustomersTable.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        ManageCustomersTable.setForeground(new java.awt.Color(51, 51, 51));
        ManageCustomersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "User Name", "Password"
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
        ManageCustomersTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        ManageCustomersTable.setSelectionForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(ManageCustomersTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 167, 730, 382));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 153, 204));

        lblManageCustomers1.setBackground(new java.awt.Color(119, 197, 147));
        lblManageCustomers1.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        lblManageCustomers1.setForeground(new java.awt.Color(51, 51, 51));
        lblManageCustomers1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblManageCustomers1.setText("                      Manage Customers");

        lblPassword1.setBackground(new java.awt.Color(0, 0, 0));
        lblPassword1.setFont(new java.awt.Font("Futura", 1, 24)); // NOI18N
        lblPassword1.setForeground(new java.awt.Color(102, 102, 102));
        lblPassword1.setText("Password");

        txtPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword1ActionPerformed(evt);
            }
        });

        txtUserName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserName1ActionPerformed(evt);
            }
        });

        lblUserName1.setBackground(new java.awt.Color(0, 0, 0));
        lblUserName1.setFont(new java.awt.Font("Futura", 1, 24)); // NOI18N
        lblUserName1.setForeground(new java.awt.Color(102, 102, 102));
        lblUserName1.setText("Username");

        lblName1.setBackground(new java.awt.Color(0, 0, 0));
        lblName1.setFont(new java.awt.Font("Futura", 1, 24)); // NOI18N
        lblName1.setForeground(new java.awt.Color(102, 102, 102));
        lblName1.setText("Name");

        passwordtxt.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        passwordtxt.setBorder(null);
        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });

        submitBtn.setBackground(new java.awt.Color(51, 51, 51));
        submitBtn.setFont(new java.awt.Font("Futura", 1, 24)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(204, 204, 204));
        submitBtn.setText("Submit");
        submitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        userNameTxt.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        userNameTxt.setBorder(null);
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });

        nameTxt.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        nameTxt.setBorder(null);
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUserName1)
                    .addComponent(lblPassword1)
                    .addComponent(lblName1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(998, 998, 998))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(lblManageCustomers1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblManageCustomers1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(txtUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3129, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed

        String name = nameTxt.getText();
        String uname = userNameTxt.getText();
        String password = passwordtxt.getText();
        if(name.equals("") || uname.equals("") || password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill all the details");
        }
        else
        {
            //ecoSystem.getUserAccountDirectory().createUserAccount(uname, password, null, new PatientRole());
            //ecoSystem.getPatientDirectory().createPatient(uname);
            populateTable();
        }

        nameTxt.setText("");
        userNameTxt.setText("");
        passwordtxt.setText("");
    }//GEN-LAST:event_submitBtnActionPerformed

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void txtPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword1ActionPerformed

    private void txtUserName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserName1ActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManageCustomersTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageCustomers1;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField txtName1;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JTextField txtUserName1;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
