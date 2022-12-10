/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Pharma;

import java.util.Date;

/**
 *
 * @author mayurchaudhari
 */
public class Medicine {
    
    private String medName;
    private int medPrice;
    private Date medExpiry;
    private int medQuant;
    private String medUsage;

    public int getMedQuant() {
        return medQuant;
    }

    public void setMedQuant(int medQuant) {
        this.medQuant = medQuant;
    }

    public String getMedUsage() {
        return medUsage;
    }

    public void setMedUsage(String medUsage) {
        this.medUsage = medUsage;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public int getMedPrice() {
        return medPrice;
    }

    public void setMedPrice(int medPrice) {
        this.medPrice = medPrice;
    }

    public Date getMedExpiry() {
        return medExpiry;
    }

    public void setMedExpiry(Date medExpiry) {
        this.medExpiry = medExpiry;
    }
        @Override
    public String toString() {
        return medName;
    }
    
}
