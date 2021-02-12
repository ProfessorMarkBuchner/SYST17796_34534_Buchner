/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * This class represents students in our application
 *
 * @author Aleks Lim was here @ Sheridan College 2021
 */
//Class to model patients in an ER Admission System
public class Patient {

    //Fields:___________________________
    private String name;
    private LocalDate dob;
    private String family_doctor;
    private ArrayList<String> medications;
    private ArrayList<String> allergies;
    private ArrayList<WristBand> bandList;
    private WristBand basicBand;
    private LocalDate admitDate;

    //Constructors:_________________________
    
    public Patient() {
        
    }

    public Patient(
            String name,
            LocalDate dob,
            String family_doctor,
            ArrayList<String> medications,
            ArrayList<String> allergies,
            ArrayList<WristBand> bandList,
            WristBand basicBand,
            LocalDate admitDate
    ) {
        this.name = name;
        this.dob = dob;
        this.family_doctor = family_doctor;
        this.medications = medications;
        this.allergies = allergies;
        this.bandList = bandList;
        this.admitDate = admitDate;

    }//End M:*

    //Getters:______________________________
    
    public String getName() {
        return name;
    }//End G:*

    public LocalDate getDob() {
        return dob;
    }//End G:*

    public String get_Family_Doctor() {
        return family_doctor;
    }//End G:*

    public ArrayList<String> getMedications() {
        return medications;
    }//End G:*

    public ArrayList<String> getAllergies() {
        return allergies;
    }//End G:*

    public ArrayList<WristBand> getBandList() {
        return bandList;
    }//End G:*

    public WristBand getBasicBand() {
        return basicBand;
    }//End G:*

    public LocalDate getAdmitDate() {
        return admitDate;
    }//End G:*

    //Setters:__________________________
    
    
    public void setName(String name) {
        this.name = name;
    }//End S:*

    public void setDob() {
        this.dob = dob;
    }//End S:*

    public void set_Family_Doctor() {
        this.family_doctor = family_doctor;
    }//End S:*

    public void setMedications() {
        this.medications = medications;
    }//End S:*

    public void setAllergies() {
        this.allergies = allergies;
    }//End S:*

    public void setBandList() {
        this.bandList = bandList;
    }//End S:*

    public void setBasicBand() {
        this.basicBand = basicBand;
    }//End S:*

    public void setAdmitDate() {
        this.admitDate = admitDate;
    }//End S:*

    //Methods
    public boolean checkAge() {
        boolean result = false;
        return result;
    }//End M:*

}//End Class:_____________________________
