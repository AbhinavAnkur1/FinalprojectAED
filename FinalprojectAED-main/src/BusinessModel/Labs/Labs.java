/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Labs;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author mayurchaudhari
 */
public class Labs {
    
     private String lab;
    private String labEmail;
    private ArrayList<Tests> testList;
    private ArrayList<Patient> labRecordsList;

    public Labs() {
        testList = new ArrayList<>();
        labRecordsList = new ArrayList<>();
    }
    public void AddTreatedPatientList(Patient patient)
    {
      /*  for(Patient p:labRecordsList){
        if(!labRecordsList.contains(patient)){
        labRecordsList.add(patient);
        }
        else if(p==patient && p.getPharmaStatus().equals("Delivered")){
        labRecordsList.add(p);
        }
        }*/
        labRecordsList.add(patient);
    }
    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getLabEmail() {
        return labEmail;
    }

    public void setLabEmail(String labEmail) {
        this.labEmail = labEmail;
    }

    public ArrayList<Tests> getTestList() {
        return testList;
    }

    public void setTestList(ArrayList<Tests> testList) {
        this.testList = testList;
    }

    public ArrayList<Patient> getLabRecordsList() {
        return labRecordsList;
    }

    public void setLabRecordsList(ArrayList<Patient> labRecordsList) {
        this.labRecordsList = labRecordsList;
    }
        public Tests createTest(Tests t) {
        //Tests bloodRecord = new Tests();
        testList.add(t);
        return t;
    }
    public void deleteTests(Tests p){
        testList.remove(p);
    }
    public void updateTests(Tests t,String name,String username, int password){
       
        t.setTestName(name);
        t.setTestUsage(username);
        t.setTestPrice(password);
    }
    
}
