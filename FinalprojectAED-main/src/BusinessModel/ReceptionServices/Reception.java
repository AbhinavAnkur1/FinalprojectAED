/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.ReceptionServices;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author mayurchaudhari
 */
public class Reception {
    
    private ArrayList<Patient> patientRecord;

    public ArrayList<Patient> getPatientRecord() {
        return patientRecord;
    }

    public void setPatientRecord(ArrayList<Patient> patientRecord) {
        this.patientRecord = patientRecord;
    }
    
}
