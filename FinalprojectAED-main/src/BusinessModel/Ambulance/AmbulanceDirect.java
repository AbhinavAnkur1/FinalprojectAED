/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Ambulance;

import java.util.ArrayList;

/**
 *
 * @author indian
 */
public class AmbulanceDirect {
    
     private ArrayList<Ambulance> Ambu;

    public ArrayList<Ambulance> getAmbu() {
        return Ambu;
    }

    public void setAmbu(ArrayList<Ambulance> Ambu) {
        this.Ambu = Ambu;
    }

    public AmbulanceDirect()
    {
         Ambu = new ArrayList<>();
    }
     
    public Ambulance createAmbulance(Ambulance ambulance) 
    {
        Ambu.add(ambulance);
        return ambulance;
    }
}
