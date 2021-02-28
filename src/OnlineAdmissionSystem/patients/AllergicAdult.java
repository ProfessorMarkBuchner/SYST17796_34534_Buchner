/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.patients;

//Imports:______________________________


import OnlineAdmissionSystem.wristbands.WristBand;
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
             String name,
             String dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<WristBand> bandList,
             WristBand basicBand,
             ArrayList<String> allergies
           ){
       super(
                name, 
                dob, 
                family_doctor, 
                medicalProblem,
                bandList, 
                basicBand
        );
       this.allergies = allergies;
   }//End C:*
   
   //
   public AllergicAdult(
             String name,
             String dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<String> allergies
           ){
       super(
                name, 
                dob, 
                family_doctor, 
                medicalProblem
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
