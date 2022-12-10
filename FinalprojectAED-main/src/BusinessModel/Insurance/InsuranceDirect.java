/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Insurance;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author mayurchaudhari
 */
public class InsuranceDirect {
    
    public InsuranceDirect() {
        insuranceRecord = new ArrayList<>();
    }
    
    private ArrayList<Patient> insuranceRecord; 

    public ArrayList<Patient> getInsuranceRecord() {
        return insuranceRecord;
    }

    public void setInsuranceRecord(ArrayList<Patient> insuranceRecord) {
        this.insuranceRecord = insuranceRecord;
    }
        public void addServedCustomers(Patient patient)
    {
      /*  for(Patient p:labRecordsList){
        if(!labRecordsList.contains(patient)){
        labRecordsList.add(patient);
        }
        else if(p==patient && p.getPharmaStatus().equals("Delivered")){
        labRecordsList.add(p);
        }
        }*/
        insuranceRecord.add(patient);
    }

    
}
