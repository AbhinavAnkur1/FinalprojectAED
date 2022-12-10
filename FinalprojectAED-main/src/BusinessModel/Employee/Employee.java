/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Employee;

/**
 *
 * @author mayurchaudhari
 */
public class Employee {
    
    private String empName;
    private final int empId;
    private static int empCount = 1;

    public Employee() {
        this.empId = empCount;
        empCount++;
    }

    public Employee(String employeeName, int employeeId) {
        this.empName = employeeName;
        this.empId = employeeId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public static int getEmpCount() {
        return empCount;
    }

    public static void setEmpCount(int empCount) {
        Employee.empCount = empCount;
    }
    
    @Override
    public String toString(){
        return this.empName;
    }
    
    
}
