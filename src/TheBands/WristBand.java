/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBands;

import ThePatients.Patient;

/**
 *
 * @author AllyCat @ Sheridan High 2021
 */
public class WristBand {
    
    //Fields:_______________________________________
    
    protected int barcode; 
    protected Patient patient;
    
    //Constructors:__________________________________
    
    
    public WristBand(){
    
    }//End C:*
    
    public WristBand(Patient patient){
     this.barcode = patient.getId(); 
     this.patient = patient;
    }//End C:*
    
    //Getters:_________________________________________

    public Patient getPatient() {
        return patient;
    }//End M:*

    public void setPatient(Patient patient) {
        this.patient = patient;
    }//End M:*
   
    public int getBarcode(){
        return barcode;
    }//End G:*
    
    //Setters:_______________________________
    
  
    //Methods:________________________________
    
    public void print(){
        System.out.println(
                           patient.getName() + 
                           " " + patient.getDob() +
                           " " + patient.get_Family_Doctor()
                           );
    }//End M:*
    
}//End Class:*
