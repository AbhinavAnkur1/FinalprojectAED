/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel;

import BusinessModel.Ambulance.AmbulanceDirect;
import BusinessModel.BBank.BBank;
import BusinessModel.Doctor.DoctorDirect;
import BusinessModel.Insurance.InsuranceDirect;
import BusinessModel.Labs.Labs;
import BusinessModel.Patient.PatientDirect;
import BusinessModel.Pharma.Pharma;
import BusinessModel.PoliceDept.PoliceDept;
import BusinessModel.Roles.Role;
import BusinessModel.Roles.Admin;
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author indian
 */
public class Ecosystem extends Organisation{
    
    private static Ecosystem business;
    private PatientDirect patientDirect;
    private DoctorDirect doctorDirect;
    private AmbulanceDirect ambulanceDirect;
    private BBank bBank;
    private Labs labs;
    private Pharma pharma;
    private InsuranceDirect insuranceDirect;
    private PoliceDept policeRecords;
    
    public static Ecosystem getInstance()
    {
        if(business==null)
        {
            business=new Ecosystem();
        }
        
        return business;
    }

    public static Ecosystem getBusiness() {
        return business;
    }

    public static void setBusiness(Ecosystem business) {
        Ecosystem.business = business;
    }

    public PatientDirect getPatientDirect() {
        return patientDirect = (patientDirect == null) ? new PatientDirect() : patientDirect;
    }

    public void setPatientDirect(PatientDirect patientDirect) {
        this.patientDirect = patientDirect;
    }

    public DoctorDirect getDoctorDirect() {
        return doctorDirect = (doctorDirect == null) ? new DoctorDirect() : doctorDirect;
    }

    public void setDoctorDirect(DoctorDirect doctorDirect) {
        this.doctorDirect = doctorDirect;
    }

    public AmbulanceDirect getAmbulanceDirect() {
        return ambulanceDirect = (ambulanceDirect == null) ? new AmbulanceDirect() : ambulanceDirect;
    }

    public void setAmbulanceDirect(AmbulanceDirect ambulanceDirect) {
        this.ambulanceDirect = ambulanceDirect;
    }

    public BBank getBBank() {
        return bBank = (bBank == null) ? new BBank() : bBank;
    }

    public void setBBank(BBank bBank) {
        this.bBank = bBank;
    }

    public Labs getLabs() {
        return labs = (labs == null)? new Labs() : labs;
    }

    public void setLabs(Labs labs) {
        this.labs = labs;
    }

    public Pharma getPharma() {
        return pharma = (pharma == null)? new Pharma() : pharma;
    }

    public void setPharma(Pharma pharma) {
        this.pharma = pharma;
    }

    public InsuranceDirect getInsuranceDirect() {
        return insuranceDirect = (insuranceDirect == null)? new InsuranceDirect() : insuranceDirect;
    }

    public void setInsuranceDirect(InsuranceDirect insuranceDirect) {
        this.insuranceDirect = insuranceDirect;
    }

    public PoliceDept getPoliceRecords() {
        return policeRecords = (policeRecords == null)? new PoliceDept() : policeRecords;
    }

    public void setPoliceRecords(PoliceDept policeRecords) {
        this.policeRecords = policeRecords;
    }


    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new Admin());
        return roleList;
    }
    private Ecosystem()
    {
        super(null);
    }

    
    public boolean checkIfUserIsUnique(String userName)
    {
       return false;
    }
    
    
}
