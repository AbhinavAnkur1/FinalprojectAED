/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;

import BusinessModel.Ecosystem;
import BusinessModel.UserAccount.User;
import javax.swing.JPanel;
import MainUserInterface.Lab.LabWorkAreaJPanel;


/**
 *
 * @author mayurchaudhari
 */
public class Lab extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem business) {
        System.out.println("inside createWork Area for Lab");
        return new LabWorkAreaJPanel(userProcessContainer, user, business);
    }
    
}
