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
    
    //This var is just for usage and doesn't change 
    private final UserInput input;
    
    //Fields:__________________________________________
    
    
    //Constructors:_____________________________________
    
    public ER_Admission(){
        input = new UserInput();
    }//End C:*
    
    //Getters:________________________________________
    
    
    //Setters:__________________________________________
    
    
    //Methods:________________________________________________
    
    public static void main (String[] args){
        
        //Patient enters Er and provides dob 
        //System.out.println("Can I have your name and date of birth please");
        //System.out.println(LocalDate.now());
        
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
