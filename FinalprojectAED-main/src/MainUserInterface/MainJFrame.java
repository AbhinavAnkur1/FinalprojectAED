package MainUserInterface;

import BusinessModel.Ecosystem;
import BusinessModel.DB4OUtil.DB4OUtil;
import BusinessModel.Pharma.Pharma;
import BusinessModel.Roles.AmbuDriver;
import BusinessModel.Roles.BloodBank;
import BusinessModel.Roles.DocAdmin;
import BusinessModel.Roles.InsuranceManager;
import BusinessModel.Roles.Lab;
import BusinessModel.Roles.RolePatient;
import BusinessModel.Roles.Pharmacist;
import BusinessModel.Roles.Police;
import BusinessModel.Roles.Reception;
import BusinessModel.UserAccount.User;
import BusinessUtil.Mail.SendMail;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author indian
 */

public class MainJFrame extends javax.swing.JFrame {
    private final Ecosystem system;
    private final DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
        system.getUserAccountDirectory().createUser("bloodbank", "bloodbank", null, new BloodBank());
        system.getUserAccountDirectory().createUser("pharmacy", "pharmacy", null, new Pharmacist());
        system.getUserAccountDirectory().createUser("insurance", "insurance", null, new InsuranceManager());
        system.getUserAccountDirectory().createUser("ambulance", "ambulance", null, new AmbuDriver());
        system.getUserAccountDirectory().createUser("lab", "lab", null, new Lab());
        system.getUserAccountDirectory().createUser("hos", "hos", null, new Reception());
        system.getUserAccountDirectory().createUser("cop", "cop", null, new Police());
        system.getUserAccountDirectory().createUser("doctor", "doctor", null, new DocAdmin());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftContainer = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        signInField = new javax.swing.JTextField();
        passwordInputField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        appLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mainContainer = new javax.swing.JPanel();
        homeDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftContainer.setBackground(new java.awt.Color(255, 255, 255));
        leftContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginBtn.setBackground(new java.awt.Color(0, 0, 204));
        loginBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setToolTipText("");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        leftContainer.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 120, 30));

        signInField.setFont(new java.awt.Font("Noto Sans Kannada", 0, 12)); // NOI18N
        signInField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInFieldActionPerformed(evt);
            }
        });
        leftContainer.add(signInField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 118, 30));

        passwordInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputFieldActionPerformed(evt);
            }
        });
        leftContainer.add(passwordInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 118, 30));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel1.setText("USERNAME");
        leftContainer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setText("PASSWORD");
        leftContainer.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 108, -1));
        leftContainer.add(loginJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 231, -1, -1));

        logoutBtn.setBackground(new java.awt.Color(0, 0, 204));
        logoutBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.setEnabled(false);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        leftContainer.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 120, 30));

        appLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/hospital-logo.jpg"))); // NOI18N
        leftContainer.add(appLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/icons8-user-40.png"))); // NOI18N
        leftContainer.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 50, 40));

        jSplitPane1.setLeftComponent(leftContainer);

        mainContainer.setBackground(new java.awt.Color(255, 255, 255));
        mainContainer.setLayout(new java.awt.CardLayout());

        homeDisplay.setBackground(new java.awt.Color(255, 255, 255));
        homeDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/Hospital.gif"))); // NOI18N
        mainContainer.add(homeDisplay, "card2");

        jSplitPane1.setRightComponent(mainContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        try{ 
            User ua = system.getUserAccountDirectory().authenticateUser(signInField.getText(), passwordInputField.getText());
            CardLayout layout = (CardLayout) mainContainer.getLayout();
            System.out.println("role of user ---"+ua.getRole());
            mainContainer.add(ua.getRole().createWorkArea(mainContainer, ua, system));
            layout.next(mainContainer);
            logoutBtn.setEnabled(true);
        }
        catch(Exception e){
            System.out.println("exception ---");
            e.printStackTrace();
            System.out.println("exception due to ---"+e.getMessage());
            JOptionPane.showMessageDialog(null,"Username/Password is wrong!","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        logoutBtn.setEnabled(false);
        signInField.setEnabled(true);
        passwordInputField.setEnabled(true);
        loginBtn.setEnabled(true);
        signInField.setText("");
        passwordInputField.setText("");
        
        Logout ua = new Logout(mainContainer);
        mainContainer.add("logout", ua);
        CardLayout layout = (CardLayout) mainContainer.getLayout();
        layout.next(mainContainer);
        dB4OUtil.storeSystem(system);
        
        
        
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void signInFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInFieldActionPerformed

    private void passwordInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputFieldActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appLogo;
    private javax.swing.JLabel homeDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftContainer;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JPasswordField passwordInputField;
    private javax.swing.JTextField signInField;
    // End of variables declaration//GEN-END:variables
}
