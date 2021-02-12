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

    public String getName() {
        return name;
    }//End G:*

    public void setName(String name) {
        this.name = name;
    }//End S:*

    //Methods
    public boolean checkAge() {
        boolean result = false;
        return result;
    }//End M:*

}//End Class:_____________________________
