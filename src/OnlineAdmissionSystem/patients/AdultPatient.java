/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.patients;

//Imports:_________________________

import OnlineAdmissionSystem.wristbands.WristBand;
import java.util.ArrayList;

/**
 *
 * @author AllyCat @ Sheridan College 2021
 */
public class AdultPatient extends Patient{
    
    public AdultPatient(){
        
    }//End C:*
    
    
    public AdultPatient(
             String name,
             String dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<WristBand> bandList,
             WristBand basicBand
    ){
        super(
                name, 
                dob, 
                family_doctor, 
                medicalProblem,
                bandList, 
                basicBand
        );
            
    }//End C:*
    
    public AdultPatient(
             String name,
             String dob,
             String family_doctor,
             String medicalProblem
    ){
        super(
                name, 
                dob, 
                family_doctor, 
                medicalProblem
        );
    }//End C:*
   
}//End Class:*
