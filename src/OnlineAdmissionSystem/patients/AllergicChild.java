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
public class AllergicChild extends ChildPatient{

    
    
    protected ArrayList<String> allergies;

    //Constructors:________________________________
    
    public AllergicChild() {
        
    }//End C:*
    
    
    public AllergicChild(
             String parent,
             String name,
             LocalDate dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<WristBand> bandList,
             WristBand basicBand,
             ArrayList<String> allergies
            ){
        super(
                parent,
                name, 
                dob, 
                family_doctor, 
                medicalProblem,
                bandList, 
                basicBand
        );
        this.allergies = allergies; 
    }//End C:*
    
    //Getters & Setters:____________________
    
    public ArrayList<String> getAllergies() {
        return allergies;
    }//End G:*

    public void setAllergies(ArrayList<String> allergies) {
        this.allergies = allergies;
    }//End S:*
    
    //Methods:________________________________
    
  
    
}//End Class:*
