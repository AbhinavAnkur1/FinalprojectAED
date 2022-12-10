/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel;

import BusinessModel.Employee.Employee;
import BusinessModel.Roles.Admin;
import BusinessModel.UserAccount.User;

/**
 *
 * @author daddy
 */
public class SystemConfiguration {
    
        public static Ecosystem configure() {

            Ecosystem system = Ecosystem.getInstance();

            //Create a network
            //create an enterprise
            //initialize some organizations
            //have some employees 
            //create user account
            System.out.println("existing employees --"+system.getEmployeeDirectory());
            Employee employee = system.getEmployeeDirectory().createEmployee("RRH");

            User ua = system.getUserAccountDirectory().createUser("sysadmin", "sysadmin", employee, new Admin());

            return system;
        }
}
