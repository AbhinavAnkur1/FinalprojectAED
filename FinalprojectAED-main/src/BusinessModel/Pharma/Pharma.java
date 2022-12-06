/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Pharma;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author indian
 */
public class Pharma {
    
    private String pharmaName;
    private String email;
    private String address;
    private ArrayList<Medicine> medList;
    private ArrayList<Patient> pharmaRecordList;
    public void AddpharmaRecordList(Patient patient)
    {
        pharmaRecordList.add(patient);
    }
    public Pharma() {
        medList = new ArrayList<>();
        pharmaRecordList = new ArrayList<>();        
    }
    
    public ArrayList<Medicine> getmedList() {
        return medList;
    }

    public void setmedList(ArrayList<Medicine> medList) {
        this.medList = medList;
    }

    public String getPharmaName() {
        return pharmaName;
    }

    public void setPharmaName(String pharmaName) {
        this.pharmaName = pharmaName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Patient> getPharmaRecordList() {
        return pharmaRecordList;
    }
    public Medicine createMedicine(Medicine m) {
        //Tests bloodRecord = new Tests();
        medList.add(m);
        return m;
    }
    public void setPharmaRecordList(ArrayList<Patient> pharmaRecordList) {
        this.pharmaRecordList = pharmaRecordList;
    }
    public void deleteMed(Medicine p){
        medList.remove(p);
    }
        public void updateMeds(Medicine t,String name,String username, int password,int q){
       
        t.setMedName(name);
        t.setUsage(username);
        t.setPrice(password);
        t.setQuantity(q);
    }
    
    
}
