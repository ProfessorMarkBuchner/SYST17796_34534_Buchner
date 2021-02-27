/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.patients;

//Imports:____________________________

import OnlineAdmissionSystem.wristbands.WristBand;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author AllyCat @ Sheridan College 2021
 */
public class MedicatedChild extends ChildPatient{
    
    protected ArrayList<String> medications;
    
    public MedicatedChild(){
        
    }//End C:*
    
    public MedicatedChild(
             int id,
             String parent,
             String name,
             LocalDate dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<WristBand> bandList,
             WristBand basicBand,
             ArrayList<String> medications
            ){
        super(
                id,
                name, 
                parent,
                dob, 
                family_doctor, 
                medicalProblem,
                bandList, 
                basicBand
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
    
    //Methods:_______________________________
    
  
    
    
}//End Class:*
