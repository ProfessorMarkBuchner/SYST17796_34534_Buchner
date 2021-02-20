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
public class AllergicChild extends ChildPatient{
    
    protected ArrayList<String> allergies;
    
    public AllergicChild(
             int id,
             String parent,
             String name,
             LocalDate dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<String> medications,
             ArrayList<WristBand> bandList,
             WristBand basicBand,
             LocalDate admitDate,
             ArrayList<String> allergies
            ){
        super(
                id,
                parent,
                name, 
                dob, 
                family_doctor, 
                medicalProblem,
                medications, 
                bandList, 
                basicBand, 
                admitDate
        );
        this.allergies = allergies; 
    }
    
}//End Class:*
