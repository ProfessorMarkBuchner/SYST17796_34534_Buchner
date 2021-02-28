/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThePatients;

import ThePatients.AdultPatient;
import TheBands.WristBand;
import java.util.ArrayList;

/**
 *
 * @author AllyCat @ Sheridan College 2021
 */
public class MedicatedAdult extends AdultPatient{
    
    protected ArrayList<String> medications;
    
    
    //Constructors:___________________________
    

    public MedicatedAdult() {
        
    }//End C:*

    
    public MedicatedAdult(
             String name,
             String dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<WristBand> bandList,
             WristBand basicBand,
             ArrayList<String> medications
             ){
        super(
                name, 
                dob, 
                family_doctor, 
                medicalProblem,
                bandList, 
                basicBand
        );
        this.medications = medications; 
        
    }//End C:*
    
    public MedicatedAdult(
             String name,
             String dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<String> medications
             ){
        super(
                name, 
                dob, 
                family_doctor, 
                medicalProblem
        );
        this.medications = medications; 
        
    }//End C:*
    
    //Getters & Setters:__________________________
    
     public ArrayList<String> getMedications() {
        return medications;
    }

    public void setMedications(ArrayList<String> medications) {
        this.medications = medications;
    }
    
    //Methods:____________________________
    
 
    
}//End Class:*
