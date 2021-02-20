/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aleks Lim @ Sheridan College 2021
 */
public class ER_Admission {
    
    private UserInput input;
    
    //Fields:__________________________________________
    
    
    //Constructors:_____________________________________
    
    public ER_Admission(){
    
    }//End C:*
    
    //Getters:________________________________________
    
    
    //Setters:__________________________________________
    
    
    //Methods:________________________________________________
    
    public static void main (String[] args){
        
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
