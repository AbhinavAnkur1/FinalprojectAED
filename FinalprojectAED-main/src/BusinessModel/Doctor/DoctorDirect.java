/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Doctor;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author mayurchaudhari
 */
public class DoctorDirect {
    
    private ArrayList<Dr> doctors;
    
    public DoctorDirect() {
        doctors = new ArrayList<Dr>();
    }
    
    public Dr createDoctor(Dr doc) {
        Dr doctor = new Dr(doc.getdocUserName());
        doctors.add(doc);
        return doctor;
    }

    public void deleteDoc(Dr p) {
        doctors.remove(p);
    }

    public Dr AddPatient(Dr doctor, Patient patient) {
        System.out.println("doc existing patients--"+doctor.getTreatedPatientList());
        doctor.getTreatedPatientList().add(patient);
        return doctor;
    }

    public ArrayList<Dr> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Dr> doctors) {
        this.doctors = doctors;
    }
    
    
}
