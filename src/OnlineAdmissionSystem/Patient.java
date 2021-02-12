/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *This class represents students in our application
 * @author markb Jan 27
 */
public class Patient {
    
    private String name;
    private LocalDate dob;
    private String family_doctor; 
    private ArrayList<String> medications;
    private ArrayList<String> allergies; 
    private ArrayList<WristBand> bandList;
    private WristBand basicBand;
    private LocalDate admitDate; 
    
    public boolean checkAge(){
    boolean result = false;
    return result; 
    } 

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    
}
