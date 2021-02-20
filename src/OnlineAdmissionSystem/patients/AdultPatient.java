/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.patients;

import OnlineAdmissionSystem.wristbands.WristBand;
import OnlineAdmissionSystem.patients.Patient;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author AllyCat @ Sheridan College 2021
 */
public class AdultPatient extends Patient{
    
    public AdultPatient(){
        
    }//End C:*
    
    
    public AdultPatient(
             int id,
             String name,
             LocalDate dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<String> medications,
             ArrayList<WristBand> bandList,
             WristBand basicBand,
             LocalDate admitDate
    ){
        super(
                id,
                name, 
                dob, 
                family_doctor, 
                medicalProblem,
                medications, 
                bandList, 
                basicBand, 
                admitDate
        );
    }
   
}//End Class:*
