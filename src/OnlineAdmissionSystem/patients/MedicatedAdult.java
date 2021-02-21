/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.patients;

import OnlineAdmissionSystem.wristbands.WristBand;
import java.time.LocalDate;
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
             int id,
             String name,
             LocalDate dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<WristBand> bandList,
             WristBand basicBand,
             LocalDate admitDate,
             ArrayList<String> medications
             ){
        super(
                id,
                name, 
                dob, 
                family_doctor, 
                medicalProblem,
                bandList, 
                basicBand, 
                admitDate
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
