/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Ambulance;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author indian
 */
public class Ambulance {
    
    private String driverFName;
    private String driverLName;
    private String vehicleNo;
    private String driverMNo;
    private String Status;
    private int Age_Driver;
    private String acciLocation;
    private ArrayList<Patient> ambuPatientsList;
    
    public Ambulance()
    {
         this.ambuPatientsList = new ArrayList<Patient>();
    }

    public String getDriverFName() {
        return driverFName;
    }

    public void setDriverFName(String driverFName) {
        this.driverFName = driverFName;
    }

    public String getDriverLName() {
        return driverLName;
    }

    public void setDriverLName(String driverLName) {
        this.driverLName = driverLName;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getDriverMNo() {
        return driverMNo;
    }

    public void setDriverMNo(String driverMNo) {
        this.driverMNo = driverMNo;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getAge_Driver() {
        return Age_Driver;
    }

    public void setAge_Driver(int Age_Driver) {
        this.Age_Driver = Age_Driver;
    }

    public String getAcciLocation() {
        return acciLocation;
    }

    public void setAcciLocation(String acciLocation) {
        this.acciLocation = acciLocation;
    }

    public ArrayList<Patient> getAmbuPatientsList() {
        return ambuPatientsList;
    }

    public void setAmbuPatientsList(ArrayList<Patient> ambuPatientsList) {
        this.ambuPatientsList = ambuPatientsList;
    }
    
    
    
    @Override
    public String toString() {
        return driverFName;
    }
}
