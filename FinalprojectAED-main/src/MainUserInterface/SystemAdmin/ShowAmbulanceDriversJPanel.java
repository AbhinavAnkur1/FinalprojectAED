/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.SystemAdmin;

import BusinessModel.Ambulance.Ambulance;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import com.kingaspx.util.BrowserUtil;
import com.kingaspx.version.Version;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.dom.By;
import com.teamdev.jxbrowser.chromium.dom.DOMDocument;
import com.teamdev.jxbrowser.chromium.dom.DOMElement;
import com.teamdev.jxbrowser.chromium.dom.DOMInputElement;
import com.teamdev.jxbrowser.chromium.events.ConsoleEvent;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.LoadAdapter;
import com.teamdev.jxbrowser.chromium.events.TitleEvent;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author daddy
 */
public class ShowAmbulanceDriversJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShowAmbulanceDriversJPanel
     */
    private final JPanel userProCont;
    private final Ecosystem ecoSystem;
    User userAcc;
    public ShowAmbulanceDriversJPanel(JPanel userProcessContainer, User account,Ecosystem system) {
        initComponents();
        this.userProCont = userProcessContainer;
        this.userAcc = account;
        this.ecoSystem = system;
        open_site();
    }
    
    Browser search;
    BrowserView viewBrowse;
    
        private void open_site() {
        
        BrowserUtil.setVersion(Version.V6_22);
        search = new Browser();
        viewBrowse = new BrowserView(search);

        Map_JPanel.add(viewBrowse, BorderLayout.CENTER);

        

        search.addConsoleListener((ConsoleEvent evt) -> {
            System.out.println("LOG: " + evt.getMessage());
        });

        search.addLoadListener(new LoadAdapter() {
            @Override
            public void onFinishLoadingFrame(FinishLoadingEvent evt) {
                evt.getBrowser().setZoomLevel(-2);
            }
        });
        search.loadURL("C:\\Users\\Indian\\Desktop\\AEDpro\\FinalprojectAED-main.2 \\FinalprojectAED-main\\simple_map2.html");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        getAmbuBtn = new javax.swing.JButton();
        Map_JPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Futura", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ambulance drivers at the moment");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 420, 60));

        getAmbuBtn.setBackground(new java.awt.Color(102, 102, 102));
        getAmbuBtn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        getAmbuBtn.setForeground(new java.awt.Color(204, 204, 204));
        getAmbuBtn.setText("Get Ambulances");
        getAmbuBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getAmbuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAmbuBtnActionPerformed(evt);
            }
        });
        jPanel3.add(getAmbuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 150, 30));

        add(jPanel3, java.awt.BorderLayout.PAGE_START);

        Map_JPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout Map_JPanelLayout = new javax.swing.GroupLayout(Map_JPanel);
        Map_JPanel.setLayout(Map_JPanelLayout);
        Map_JPanelLayout.setHorizontalGroup(
            Map_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        Map_JPanelLayout.setVerticalGroup(
            Map_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        add(Map_JPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void getAmbuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAmbuBtnActionPerformed
        // TODO add your handling code here:
        DOMDocument doc = search.getDocument();
        DOMElement start_element = doc.findElement(By.id("start"));
        DOMElement btn_element = doc.findElement(By.id("submit"));
        DOMElement button = (DOMElement) btn_element;

        DOMInputElement startLocation = (DOMInputElement) start_element;
        startLocation.setValue("Northeastern University, Boston; Boylston Street, Boston ; Heath Street, Boston");
        
        button.click();
    }//GEN-LAST:event_getAmbuBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Map_JPanel;
    private javax.swing.JButton getAmbuBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}