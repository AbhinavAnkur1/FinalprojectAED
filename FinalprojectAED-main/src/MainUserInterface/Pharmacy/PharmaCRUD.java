/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.Pharmacy;

import BusinessModel.Ecosystem;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.Pharma.Medicine;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indian
 */
public class PharmaCRUD extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Ecosystem ecosystem;
    User userAccount;
    Medicine m;
    
    public PharmaCRUD(JPanel userProcessContainer, User account, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = business;
        this.userAccount = account;
        populatetableMedicine();
        //populatePatientTable();
    }
    
        private void populatetableMedicine() {
        DefaultTableModel model = (DefaultTableModel) tableTests.getModel();

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
        addMedBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTests = new javax.swing.JTable();
        lblName2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtUsage = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblName3 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        saveUpdateBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pharmacy");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 190, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 139, 1328, 10));

        addMedBtn.setBackground(new java.awt.Color(51, 51, 51));
        addMedBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        addMedBtn.setForeground(new java.awt.Color(255, 255, 204));
        addMedBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/add.png"))); // NOI18N
        addMedBtn.setText("Add Medicine");
        addMedBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.gray));
        addMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedBtnActionPerformed(evt);
            }
        });
        add(addMedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, 210, 40));

        tableTests.setBackground(new java.awt.Color(255, 255, 153));
        tableTests.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 0))); // NOI18N
        tableTests.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        tableTests.getTableHeader().setFont(new java.awt.Font("Trebuchet MS", 1, 16));
        tableTests.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableTests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 177, 788, 186));

        lblName2.setBackground(new java.awt.Color(0, 0, 0));
        lblName2.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        lblName2.setForeground(new java.awt.Color(102, 102, 0));
        lblName2.setText("Price");
        add(lblName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, -1, 30));

        txtPrice.setBackground(new java.awt.Color(255, 255, 153));
        txtPrice.setForeground(new java.awt.Color(153, 153, 0));
        txtPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 0))); // NOI18N
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 144, 30));

        txtUsage.setBackground(new java.awt.Color(255, 255, 153));
        txtUsage.setForeground(new java.awt.Color(153, 153, 0));
        txtUsage.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 0))); // NOI18N
        add(txtUsage, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 144, 30));

        txtName.setBackground(new java.awt.Color(255, 255, 153));
        txtName.setForeground(new java.awt.Color(153, 153, 0));
        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 0))); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 144, 30));

        lblName.setBackground(new java.awt.Color(0, 0, 0));
        lblName.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(102, 102, 0));
        lblName.setText("Medicine Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, 30));

        lblName1.setBackground(new java.awt.Color(0, 0, 0));
        lblName1.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        lblName1.setForeground(new java.awt.Color(102, 102, 0));
        lblName1.setText("Medicine Usage");
        add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, -1, 30));

        txtQuantity.setBackground(new java.awt.Color(255, 255, 153));
        txtQuantity.setForeground(new java.awt.Color(153, 153, 0));
        txtQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 0))); // NOI18N
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantityKeyReleased(evt);
            }
        });
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 144, 30));

        lblName3.setBackground(new java.awt.Color(0, 0, 0));
        lblName3.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        lblName3.setForeground(new java.awt.Color(102, 102, 0));
        lblName3.setText("Quantity");
        add(lblName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, 30));

        deleteBtn.setBackground(new java.awt.Color(51, 51, 51));
        deleteBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 204));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/delete.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.gray));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 660, 210, 43));

        saveUpdateBtn.setBackground(new java.awt.Color(51, 51, 51));
        saveUpdateBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        saveUpdateBtn.setForeground(new java.awt.Color(255, 255, 204));
        saveUpdateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/save.png"))); // NOI18N
        saveUpdateBtn.setText("Save Update");
        saveUpdateBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.gray));
        saveUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveUpdateBtnActionPerformed(evt);
            }
        });
        add(saveUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 660, 190, 43));

        updateBtn.setBackground(new java.awt.Color(51, 51, 51));
        updateBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 204));
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/update.png"))); // NOI18N
        updateBtn.setText("Update");
        updateBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.gray));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 188, 40));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 213, 32));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 213, 32));

        jButton2.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/back.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.gray));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, 130, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/drugstore.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedBtnActionPerformed

        if (txtName.getText().equals("") || txtUsage.getText().equals("")|| txtPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the details");
        } else {
            Medicine m = new Medicine();
            m.setMedName(txtName.getText());
            m.setMedQuant(Integer.parseInt(txtQuantity.getText()));
            m.setMedUsage(txtUsage.getText());
            m.setMedPrice(Integer.parseInt(txtPrice.getText()));
            ecosystem.getPharma().createMedicine(m);

            populatetableMedicine();

        }

        txtName.setText("");
        txtUsage.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
    }//GEN-LAST:event_addMedBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableTests.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Delete Medicine: "+tableTests.getValueAt(selectedRow, 0)+" ??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){

                Medicine p = (Medicine) tableTests.getValueAt(selectedRow, 0);
                ecosystem.getPharma().deleteMed(p);
                populatetableMedicine();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Select a Customer to delete!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void saveUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUpdateBtnActionPerformed
        // TODO add your handling code here:

        String name = txtName.getText();
        String uname=txtUsage.getText();
        String password=txtPrice.getText();
        String quantity= txtQuantity.getText();
        if(name.equalsIgnoreCase("")||uname.equalsIgnoreCase("")||password.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Pls, Fill data Correctly!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            ecosystem.getPharma().updateMeds(m,name,uname,Integer.parseInt(password),Integer.parseInt(quantity));
            populatetableMedicine();
        }
        txtName.setText("");
        txtUsage.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
    }//GEN-LAST:event_saveUpdateBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableTests.getSelectedRow();
        //Tests p = (Tests) tableTests.getValueAt(selectedRow, 0);
        if(selectedRow>=0){
            m = (Medicine) tableTests.getValueAt(selectedRow, 0);
            txtName.setText(m.getMedName());
            txtUsage.setText(m.getMedUsage());
            txtPrice.setText(Integer.toString(m.getMedPrice()));
            txtQuantity.setText(Integer.toString(m.getMedQuant()));
            // system.getUserAccountDirectory().deleteUserAccount(user);

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void txtQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,10}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtQuantity.getText());
        if (!match.matches() )
        {
            jLabel2.setText("Please input correct data. HINT: number");
        } else 
        {
            jLabel2.setText(null);
        }
    }//GEN-LAST:event_txtQuantityKeyReleased

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        // TODO add your handling code here:
         String PATTERN = "^[0-9]{0,10}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtPrice.getText());
        if (!match.matches() )
        {
            jLabel3.setText("Please input correct data. HINT: number");
        } 
        else 
        {
            jLabel3.setText(null);
        }
    }//GEN-LAST:event_txtPriceKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //patient.setInsuranceStatus("Approved");
        PharmacyWorkArea bill = new PharmacyWorkArea(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("Insurance main", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JButton saveUpdateBtn;
    private javax.swing.JTable tableTests;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtUsage;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
