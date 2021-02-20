/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author AllyCat @ Sheridan College 2021
 * Can't do UML until the programs complete.
 */
public class ER_Admission {
    
    //This var is just for usage and doesn't change 
    private final UserInput input;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    //Fields:__________________________________________

    public UserInput getInput() {
        return input;
    }
    
    
    //Constructors:_____________________________________
    
    public ER_Admission(){
        input = new UserInput();
    }//End C:*
    
    //Getters:________________________________________
    
    
    //Setters:__________________________________________
    
    
    //Methods:________________________________________________
    
    public static void main (String[] args){
        
        ER_Admission er = new ER_Admission();
        
        
        //Patient enters Er and provides dob 
        //Format is year-month-day 
        //A: Get DOB because patient type depends on it. 
        System.out.println("Can I have your date of birth please like year-month-day");
        String sDob = er.getInput().promptStringUser(new Scanner(System.in));
        //B:
        LocalDate lDob = LocalDate.parse(sDob);
        boolean checkAge = er.isAdult(lDob);
        if(checkAge == true){
            er.setPatient(new AdultPatient());
        }//End I:*
        else {
        er.setPatient(new ChildPatient());
        }//End E:*
        
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
