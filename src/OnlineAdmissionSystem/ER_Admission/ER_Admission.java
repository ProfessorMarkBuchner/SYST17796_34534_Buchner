/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.ER_Admission;

import OnlineAdmissionSystem.input.UserInput;
import OnlineAdmissionSystem.wristbands.WristBand;
import OnlineAdmissionSystem.patients.AdultPatient;
import OnlineAdmissionSystem.patients.ChildPatient;
import OnlineAdmissionSystem.patients.Patient;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;



/**
 *
 * @author AllyCat @ Sheridan College 2021
 * Can't do UML until the programs complete.
 */

/*
Models a ER department providing service to 
1 patient at a time. 
*/

public class ER_Admission {
    
    //Fields:__________________________________________
    
    
    //This var is just for usage and doesn't change 
    private final UserInput input;
    private Patient patient;
    private WristBand wristBand;
    private LocalDate dob;
    
   
    //Getters & Setters:____________________________
    
    
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public WristBand getWristBand() {
        return wristBand;
    }

    public void setWristBand(WristBand wristBand) {
        this.wristBand = wristBand;
    }

    
    //Constructors:_____________________________________
    
    public ER_Admission(){
        input = new UserInput();
    }//End C:*
    
    //Getters & Setters:________________________________________
    
    public UserInput getInput() {
        return input;
    }
      public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
    //Methods:________________________________________________
    
    public static void main (String[] args){
        
        ER_Admission er = new ER_Admission();
        IntakeForm form = new IntakeForm();
        
       
       
        
    }//End M:*
    
    public boolean isAdult(LocalDate dob) {
       boolean result = false;
       LocalDate present = LocalDate.now();
       Period p = Period.between(dob, present);
       if(p.getYears() >= 18){
           result = true; 
       }//End I:*
        return result;
    }//End M:*
    

    
}//End Class:*
