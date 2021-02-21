/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.patients;

//Imports:______________________

import OnlineAdmissionSystem.wristbands.WristBand;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author AllyCat13 @ Sheridan College 2021
 */
public class AllergicMedicatedAdult extends AllergicAdult{
    
    protected ArrayList<String> medications; 

    //Constructors:________________________________________
    
    
    public AllergicMedicatedAdult() {
        
    }//End C:*
    
    public AllergicMedicatedAdult(
             int id,
             String name,
             LocalDate dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<WristBand> bandList,
             WristBand basicBand,
             LocalDate admitDate,
             ArrayList<String> allergies,
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
                admitDate,
                allergies
        );//End SU:*
        this.medications = medications; 
    }//End C:*
    
    //Getters & Setters:__________________________________________

    public ArrayList<String> getMedications() {
        return medications;
    }

    public void setMedications(ArrayList<String> medications) {
        this.medications = medications;
    }
    
    //Methods:______________________________________________________
    
    @Override
    public void print(){
        super.print();
        for(int i = 0; i < medications.size(); i++){
            System.out.println(medications.get(i));
        }//End F:*
    }//End M:*
    
    
}//End Class:_________________________________________________________
