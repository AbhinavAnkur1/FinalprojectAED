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
public class Insurance {
    private String nameOftheInsuranceCompany;
    private String insuranceAddress;
    private String insuranceNumber;
    private String insuranceEmailId;
    private ArrayList<Patient> labRecordsList;

    public ArrayList<Patient> getLabRecordsList() {
        return labRecordsList;
    }

    public void setLabRecordsList(ArrayList<Patient> labRecordsList) {
        this.labRecordsList = labRecordsList;
    }
    
    public String getNameOftheInsuranceCompany() {
        return nameOftheInsuranceCompany;
    }

    public void setNameOftheInsuranceCompany(String nameOftheInsuranceCompany) {
        this.nameOftheInsuranceCompany = nameOftheInsuranceCompany;
    }

    public String getInsuranceAddress() {
        return insuranceAddress;
    }

    public void setInsuranceAddress(String insuranceAddress) {
        this.insuranceAddress = insuranceAddress;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getInsuranceEmailId() {
        return insuranceEmailId;
    }

    public void setInsuranceEmailId(String insuranceEmailId) {
        this.insuranceEmailId = insuranceEmailId;
    }

    
}
