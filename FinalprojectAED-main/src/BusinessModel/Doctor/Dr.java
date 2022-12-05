/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Doctor;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mayurchaudhari
 */
public class Dr {
    
    private String docUserName;
    private String docPassword;
    private String docFirstName;
    private String docLastName;
    private String docGender;
    private int docAge;
    private Date docDOB;
    private String docMNo;
    private String docEmail;
    private String docAddress;
    private String docWorkID;
    private String docSpecialization;
    private String docExp;
    private String docImageUrl;
    private ArrayList<Patient> treatedPatientList;
    
    public Dr() {
    
    }
     
    public Dr(String docUserName) {
        this.docUserName = docUserName;
        this.treatedPatientList = new ArrayList<Patient>();
    }
    public ArrayList<Patient> getTreatedPatientList() {
        return treatedPatientList;
    }

    public void setTreatedPatientList(ArrayList<Patient> treatedPatientList) {
        this.treatedPatientList = treatedPatientList;
    }

    public String getdocUserName() {
        return docUserName;
    }

    public void setdocUserName(String docUserName) {
        this.docUserName = docUserName;
    }

    public String getdocPassword() {
        return docPassword;
    }

    public void setdocPassword(String docPassword) {
        this.docPassword = docPassword;
    }

    public String getdocFirstName() {
        return docFirstName;
    }

    public void setdocFirstName(String docFirstName) {
        this.docFirstName = docFirstName;
    }

    public String getdocLastName() {
        return docLastName;
    }

    public void setdocLastName(String docLastName) {
        this.docLastName = docLastName;
    }

    public String getdocGender() {
        return docGender;
    }

    public void setdocGender(String docGender) {
        this.docGender = docGender;
    }

    public int getdocAge() {
        return docAge;
    }

    public void setdocAge(int docAge) {
        this.docAge = docAge;
    }

    public Date getdocDOB() {
        return docDOB;
    }

    public void setdocDOB(Date docDOB) {
        this.docDOB = docDOB;
    }

    public String getdocMNo() {
        return docMNo;
    }

    public void setdocMNo(String docMNo) {
        this.docMNo = docMNo;
    }

    public String getdocEmail() {
        return docEmail;
    }

    public void setdocEmail(String docEmail) {
        this.docEmail = docEmail;
    }

    public String getdocAddress() {
        return docAddress;
    }

    public void setdocAddress(String docAddress) {
        this.docAddress = docAddress;
    }

    public String getdocWorkID() {
        return docWorkID;
    }

    public void setdocWorkID(String docWorkID) {
        this.docWorkID = docWorkID;
    }

    public String getdocSpecialization() {
        return docSpecialization;
    }

    public void setdocSpecialization(String docSpecialization) {
        this.docSpecialization = docSpecialization;
    }

    public String getdocExp() {
        return docExp;
    }

    public void setdocExp(String docExp) {
        this.docExp = docExp;
    }

    public String getdocImageUrl() {
        return docImageUrl;
    }

    public void setdocImageUrl(String docImageUrl) {
        this.docImageUrl = docImageUrl;
    }
    
    @Override
    public String toString() {
        return docFirstName;
    }
}
