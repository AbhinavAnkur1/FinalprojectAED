/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Employee;

import java.util.ArrayList;

/**
 *
 * @author mayurchaudhari
 */
public class EmployeeDirect {

    private final ArrayList<Employee> employeeList;

    public EmployeeDirect() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee(String employeeName) {
        Employee newEmployee = new Employee();
        newEmployee.setEmpName(employeeName);
        employeeList.add(newEmployee);
        return newEmployee;
    }
}
