/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.patients;

//Imports:______________________________


import OnlineAdmissionSystem.wristbands.WristBand;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author AllyCat @ Sheridan College 2021
 */
public class AllergicAdult extends AdultPatient{
    
   protected ArrayList<String> allergies;

   //Constructors:____________________________
   
   
    public AllergicAdult() {
        
    }//End C:*
    
   public AllergicAdult(
             int id,
             String name,
             LocalDate dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<WristBand> bandList,
             WristBand basicBand,
             ArrayList<String> allergies
           ){
       super(
                id,
                name, 
                dob, 
                family_doctor, 
                medicalProblem,
                bandList, 
                basicBand
        );
       this.allergies = allergies;
   }//End C:*
   
   //Getters & Setters:_____________________

    public ArrayList<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(ArrayList<String> allergies) {
        this.allergies = allergies;
    }
   
   //Methods:_________________________--
   
  
    
}//End Class:*
