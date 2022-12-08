/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Patient;

/**
 *
 * @author mayurchaudhari
 */
public class PatientBills{
    
    private String orgType;
    private float amount;
    private String name;
    private String result;
    private String status;
    
     public PatientBills(String itemName,String organization1,float itemAmount) {
        this.orgType = organization1;
        this.amount = itemAmount;
        this.name = itemName;
    }
    public PatientBills(String itemName,String organization1,float itemAmount, String result, String itemStatus) {
        this.orgType = organization1;
        this.amount = itemAmount;
        this.name = itemName;
        this.result = result;
        this.status = itemStatus;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
