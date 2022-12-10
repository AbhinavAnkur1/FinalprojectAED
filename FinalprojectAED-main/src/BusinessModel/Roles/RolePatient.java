/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;

import BusinessModel.Ecosystem;
import BusinessModel.UserAccount.User;
import MainUserInterface.Patient.PatientWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mayurchaudhari
 */
public class RolePatient extends Role{
    

    @Override
     public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem business) {
        return new PatientWorkAreaJPanel(userProcessContainer, user, business);
    }      
}
