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
    private String deptName;
    private String userName;
    private String deptAddress;
    private ArrayList<Patient> policeRecordsList;

    public PoliceDept() {
        policeRecordsList = new ArrayList<>();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDeptAddress() {
        return deptAddress;
    }

    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }

    public ArrayList<Patient> getPoliceRecordsList() {
        return policeRecordsList;
    }

    public void setPoliceRecordsList(ArrayList<Patient> policeRecordsList) {
        this.policeRecordsList = policeRecordsList;
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
        policeRecordsList.add(patient);
    }
    
}
