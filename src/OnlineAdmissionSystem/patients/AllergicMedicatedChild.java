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
 * @author AllyCat13 @ Sheridan College 2021
 */
public class AllergicMedicatedChild extends AllergicChild{
    
    protected ArrayList<String> medications; 
    
    public AllergicMedicatedChild(int id,
             String parent,
             String name,
             LocalDate dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<WristBand> bandList,
             WristBand basicBand,
             LocalDate admitDate,
             ArrayList<String> allergies,
             ArrayList<String> medications){
        super(
                id,
                parent,
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
    
}//End Class:*
