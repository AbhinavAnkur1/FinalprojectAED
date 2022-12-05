/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.BBank;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author mayurchaudhari
 */
public class BBank {
    
    private String bbName;
    private String bbAddress;
    private String bbPhone;
    private String bbEmail;
    private ArrayList<Patient> bRequestedPatients;
    ArrayList<BloodTypeRecord> bDetailsList;

    public BBank() {
        bRequestedPatients = new ArrayList<>();
        bRequestedPatients = bRequestedPatients == null ? new ArrayList<>() : bRequestedPatients;
    }

    public ArrayList<BloodTypeRecord> getbDetailsList() {
        return bDetailsList;
    }

    public void setbDetailsList(ArrayList<BloodTypeRecord> bloodTypeRecord) {
        this.bDetailsList = bloodTypeRecord;
    }

    public String getbbName() {
        return bbName;
    }

    public void setbbName(String bbName) {
        this.bbName = bbName;
    }

    public String getbbAddress() {
        return bbAddress;
    }

    public void setbbAddress(String bbAddress) {
        this.bbAddress = bbAddress;
    }

    public String getbbPhone() {
        return bbPhone;
    }

    public void setbbPhone(String bloddBankPhone) {
        this.bbPhone = bloddBankPhone;
    }

    public String getbbEmail() {
        return bbEmail;
    }

    public void setbbEmail(String bloddBankEmailAddress) {
        this.bbEmail = bloddBankEmailAddress;
    }

    public ArrayList<Patient> getbRequestedPatients() {
        return bRequestedPatients;
    }

    public void setbRequestedPatients(ArrayList<Patient> bloodrequestedPatients) {
        this.bRequestedPatients = bloodrequestedPatients;
    }
    
    public void AddTreatedPatientList(Patient patient)
    {
        bRequestedPatients.add(patient);
    }
    
}
