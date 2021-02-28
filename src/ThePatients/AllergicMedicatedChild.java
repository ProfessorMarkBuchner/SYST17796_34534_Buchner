/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThePatients;

import ThePatients.AllergicChild;
import TheBands.WristBand;
import java.util.ArrayList;

/**
 *
 * @author AllyCat13 @ Sheridan College 2021
 */
public class AllergicMedicatedChild extends AllergicChild{
    
    protected ArrayList<String> medications; 

    //Constructors:____________________________
    
    public AllergicMedicatedChild() {
        
    }//End C:*
    
    
    public AllergicMedicatedChild(
             String parent,
             String name,
             String dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<WristBand> bandList,
             WristBand basicBand,
             ArrayList<String> allergies,
             ArrayList<String> medications){
        super(
                parent,
                name, 
                dob, 
                family_doctor, 
                medicalProblem,
                bandList, 
                basicBand, 
                allergies
        );//End SU:*
    this.medications = medications;
    }//End C:*
    
    public AllergicMedicatedChild(
             String parent,
             String name,
             String dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<String> allergies,
             ArrayList<String> medications
    ){
        super(
                parent,
                name, 
                dob, 
                family_doctor, 
                medicalProblem,
                allergies
        );//End SU:*
    this.medications = medications;
    }//End C:*
    
    //Getters & Setters:_________________________
    
    
    public ArrayList<String> getMedications() {
        return medications;
    }

    public void setMedications(ArrayList<String> medications) {
        this.medications = medications;
    }
    
    //Methods:__________________________________

  
    
}//End Class:*
