/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Aleks Lim was here @ Sheridan College 2021
 */

//Class to model children as different type of patient 
public class ChildPatient extends Patient{
    
    //Fields:____________________________
    
    private String parent;
    
    //Constructors:_______________________________
    
    public ChildPatient(
             String parent,
             String name,
             LocalDate dob,
             String family_doctor,
             ArrayList<String> medications,
             ArrayList<String> allergies,
             ArrayList<WristBand> bandList,
             WristBand basicBand,
             LocalDate admitDate
    ){
        super(
                name, 
                dob, 
                family_doctor, 
                medications, 
                allergies, 
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
