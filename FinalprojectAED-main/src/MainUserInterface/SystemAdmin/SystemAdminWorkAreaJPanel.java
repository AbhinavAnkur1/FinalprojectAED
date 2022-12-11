package MainUserInterface.SystemAdmin;

import BusinessModel.Ecosystem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import MainUserInterface.DoctorAdministration.CreateDoc;

public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProCont;
    Ecosystem ecoSystem;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, Ecosystem ecosystem) {
        initComponents();
        this.userProCont = userProcessContainer;
        this.ecoSystem = ecosystem;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        manageDocBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        manageDocBtn.setBackground(new java.awt.Color(51, 51, 51));
        manageDocBtn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        manageDocBtn.setForeground(new java.awt.Color(204, 204, 204));
        manageDocBtn.setText("Manage Doctors");
        manageDocBtn.setToolTipText("");
        manageDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDocBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(manageDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(manageDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDocBtnActionPerformed
        CreateDoc doctorAdministratorWorkAreaJPanel = new CreateDoc(userProCont, null, ecoSystem);
        userProCont.add("Manage Doctors", doctorAdministratorWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProCont.getLayout();
        layout.next(userProCont);
    }//GEN-LAST:event_manageDocBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JButton manageDocBtn;
    // End of variables declaration//GEN-END:variables
}
