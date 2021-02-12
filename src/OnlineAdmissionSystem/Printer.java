/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

/**
 *
 * @author Aleks Lim was here @ Sheridan College 2021
 */

//For any print related tasks like looping through array lists
public class Printer {
    
    //Fields:_________________
    
    //Constructors:__________________
    public Printer(){
    
    }//End C:*
    
    //Getters:________________________
    
    //Setters:__________________________
    
    //Methods:__________________________
    
    public void printBasicBand(Patient patient){
        System.out.println(patient.getName());
        System.out.println(patient.getDob());
        System.out.println(patient.getAdmitDate());
        System.out.println(patient.get_Family_Doctor());
    }//End M:*
    
    public void printAllergyBand(Patient patient){
        System.out.println(patient.getName());
        System.out.println(patient.getDob());
        System.out.println(patient.getAdmitDate());
        System.out.println(patient.get_Family_Doctor());
        System.out.println(patient.getAllergies());
    }//End M:*
    
    public void printChildrensBand(ChildPatient patient){
        System.out.println(patient.getName());
        System.out.println(patient.getDob());
        System.out.println(patient.getAdmitDate());
        System.out.println(patient.get_Family_Doctor());
        System.out.println(patient.getParent());
    }//End M:*
    
}//End Class:_____________________
