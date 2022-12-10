/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;

import BusinessModel.Ecosystem;
import BusinessModel.UserAccount.User;
import BusinessModel.UserAccount.User;
import MainUserInterface.SystemAdmin.ShowAmbulanceDriversJPanel;
//import MainUserInterface.SystemAdmin.AdministratorJPanel;
import MainUserInterface.SystemAdmin.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mayurchaudhari
 */
public class Admin extends Role{

    public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem system) {
        return new ShowAmbulanceDriversJPanel(userProcessContainer, user, system);
    }

}
