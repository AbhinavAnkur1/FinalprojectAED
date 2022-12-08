/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.PoliceDept;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author mayurchaudhari
 */
public class PoliceDept {
    private String policeDeptName;
    private String policeDeptUserName;
    private String policeDeptAddress;
    private ArrayList<Patient> policeRecords;

    public PoliceDept() {
        policeRecords = new ArrayList<>();
    }

    public String getPoliceDeptName() {
        return policeDeptName;
    }

    public void setPoliceDeptName(String policeDeptName) {
        this.policeDeptName = policeDeptName;
    }

    public String getPoliceDeptUserName() {
        return policeDeptUserName;
    }

    public void setPoliceDeptUserName(String policeDeptUserName) {
        this.policeDeptUserName = policeDeptUserName;
    }

    public String getPoliceDeptAddress() {
        return policeDeptAddress;
    }

    public void setPoliceDeptAddress(String policeDeptAddress) {
        this.policeDeptAddress = policeDeptAddress;
    }

    public ArrayList<Patient> getPoliceRecords() {
        return policeRecords;
    }

    public void setPoliceRecords(ArrayList<Patient> policeRecords) {
        this.policeRecords = policeRecords;
    }
    public void addtoRecord(Patient patient)
    {
      /*  for(Patient p:labRecordsList){
        if(!labRecordsList.contains(patient)){
        labRecordsList.add(patient);
        }
        else if(p==patient && p.getPharmaStatus().equals("Delivered")){
        labRecordsList.add(p);
        }
        }*/
        policeRecords.add(patient);
    }
    
}
