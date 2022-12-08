/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Patient;

import java.util.ArrayList;

/**
 *
 * @author mayurchaudhari
 */
public class PatientDirect {
    
    private PatientBills bill;
    private ArrayList<Patient> patients;
    
     public PatientBills AddBill(Patient patient,String ItemName,String Org,String amount){
        
        bill = new PatientBills(ItemName, Org, (float) 800);
        patient.addbill(bill);
        return bill;
    }
    public ArrayList<Patient> getPatientList() {
        return patients;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patients = patientList;
    }
    public void deletePatient(Patient p){
        patients.remove(p);
    }
     public PatientDirect()
     {
         patients = new ArrayList<>();
     }
     
      public Patient createPatient(Patient patient) {
        patients.add(patient);
        return patient;
    }
    public float billTotal(Patient patient){
         float billTotal = patient.totalBill();
         return billTotal;
    }
    
}
