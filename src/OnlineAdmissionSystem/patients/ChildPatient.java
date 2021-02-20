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
 * @author AllyCat13 was here @ Sheridan College 2021
 */

//Class to model children as different type of patient 
public class ChildPatient extends Patient{
    
    //Fields:____________________________
    
    private String parent;
    
    //Constructors:_______________________________
    
    public ChildPatient(
            int id,
             String parent,
             String name,
             LocalDate dob,
             String family_doctor,
             String medicalProblem,
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
                bandList, 
                basicBand, 
                admitDate
        );
        this.parent = parent; 
    }//End C:*
    
    //No Arg Constructor 
    public ChildPatient(){
    
    }//End C:*
    
    
    //Getters:___________________________
    
    public String getParent(){return parent;}
    
    //Setters:______________________________
    
    public void setParent(String newParent){ this.parent = newParent;}
    
    
    
    
}//End Class:________________________
