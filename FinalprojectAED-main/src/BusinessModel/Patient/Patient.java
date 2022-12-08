/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Patient;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mayurchaudhari
 */
public class Patient {
    
    private String pUserName;
    private String pFirstName;
    private String pLastName;
    private String pGender;
    private String pImageUrl;
    private int pAge;
    private Date pdob;
    private String pAddress;
    private String pEmailAddress;
    private String pPhoneNo;
    private String pHealthInsuranceID;
    private String pBloodType;
    private String pInjuryType;
    private Date pDateOfAdmit;
    private String pAccidentLocation;
    private String pStatus;
    private String pBloodBagQuantity;
    private String pInsuranceStatus;
    private String pLabStatus;
    private String pPharmaStatus;
    private String pBloodBankStatus;
    private String pPoliceStatus;
    private boolean pIsConcentFormSigned;
    private ArrayList<PatientBills> pBills;

    public Patient() {
    }

    public Patient(String pUserName) {
        this.pUserName = pUserName;
        pBills = new ArrayList<>();
    }
    
    
    public String getpUserName() {
        return pUserName;
    }

    public void setpUserName(String pUserName) {
        this.pUserName = pUserName;
    }

    public String getpFirstName() {
        return pFirstName;
    }

    public void setpFirstName(String pFirstName) {
        this.pFirstName = pFirstName;
    }

    public String getpLastName() {
        return pLastName;
    }

    public void setpLastName(String pLastName) {
        this.pLastName = pLastName;
    }

    public String getpGender() {
        return pGender;
    }

    public void setpGender(String pGender) {
        this.pGender = pGender;
    }

    public String getpImageUrl() {
        return pImageUrl;
    }

    public void setpImageUrl(String pImageUrl) {
        this.pImageUrl = pImageUrl;
    }

    public int getpAge() {
        return pAge;
    }

    public void setpAge(int pAge) {
        this.pAge = pAge;
    }

    public Date getPdob() {
        return pdob;
    }

    public void setPdob(Date pdob) {
        this.pdob = pdob;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public String getpEmailAddress() {
        return pEmailAddress;
    }

    public void setpEmailAddress(String pEmailAddress) {
        this.pEmailAddress = pEmailAddress;
    }

    public String getpPhoneNo() {
        return pPhoneNo;
    }

    public void setpPhoneNo(String pPhoneNo) {
        this.pPhoneNo = pPhoneNo;
    }

    public String getpHealthInsuranceID() {
        return pHealthInsuranceID;
    }

    public void setpHealthInsuranceID(String pHealthInsuranceID) {
        this.pHealthInsuranceID = pHealthInsuranceID;
    }

    public String getpBloodType() {
        return pBloodType;
    }

    public void setpBloodType(String pBloodType) {
        this.pBloodType = pBloodType;
    }

    public String getpInjuryType() {
        return pInjuryType;
    }

    public void setpInjuryType(String pInjuryType) {
        this.pInjuryType = pInjuryType;
    }

    public Date getpDateOfAdmit() {
        return pDateOfAdmit;
    }

    public void setpDateOfAdmit(Date pDateOfAdmit) {
        this.pDateOfAdmit = pDateOfAdmit;
    }

    public String getpAccidentLocation() {
        return pAccidentLocation;
    }

    public void setpAccidentLocation(String pAccidentLocation) {
        this.pAccidentLocation = pAccidentLocation;
    }

    public String getpStatus() {
        return pStatus;
    }

    public void setpStatus(String pStatus) {
        this.pStatus = pStatus;
    }

    public String getpBloodBagQuantity() {
        return pBloodBagQuantity;
    }

    public void setpBloodBagQuantity(String pBloodBagQuantity) {
        this.pBloodBagQuantity = pBloodBagQuantity;
    }

    public String getpInsuranceStatus() {
        return pInsuranceStatus;
    }

    public void setpInsuranceStatus(String pInsuranceStatus) {
        this.pInsuranceStatus = pInsuranceStatus;
    }

    public String getpLabStatus() {
        return pLabStatus;
    }

    public void setpLabStatus(String pLabStatus) {
        this.pLabStatus = pLabStatus;
    }

    public String getpPharmaStatus() {
        return pPharmaStatus;
    }

    public void setpPharmaStatus(String pPharmaStatus) {
        this.pPharmaStatus = pPharmaStatus;
    }

    public String getpBloodBankStatus() {
        return pBloodBankStatus;
    }

    public void setpBloodBankStatus(String pBloodBankStatus) {
        this.pBloodBankStatus = pBloodBankStatus;
    }

    public String getpPoliceStatus() {
        return pPoliceStatus;
    }

    public void setpPoliceStatus(String pPoliceStatus) {
        this.pPoliceStatus = pPoliceStatus;
    }

    public boolean ispIsConcentFormSigned() {
        return pIsConcentFormSigned;
    }

    public void setpIsConcentFormSigned(boolean pIsConcentFormSigned) {
        this.pIsConcentFormSigned = pIsConcentFormSigned;
    }

    public ArrayList<PatientBills> getpBills() {
        return pBills;
    }

    public void setpBills(ArrayList<PatientBills> pBills) {
        this.pBills = pBills;
    }
    
    public void addbill(PatientBills bill){
        pBills.add(bill);
    } 
     public float totalBill() {
        float total =0;
           for(PatientBills b:pBills){
               total =  total + b.getAmount();
        }
        return total;
    }
    
    
}
