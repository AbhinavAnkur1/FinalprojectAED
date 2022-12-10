/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;

import BusinessModel.Ecosystem;
import javax.swing.JPanel;
import BusinessModel.UserAccount.User;
import MainUserInterface.BloodBank.BloodBankWorkAreaJPanel;

/**
 *
 * @author mayurchaudhari
 */
public class BloodBank extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem business) {
        return new BloodBankWorkAreaJPanel(userProcessContainer, user, business);
    }
    
    
    
}

