/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.wristbands;

import OnlineAdmissionSystem.patients.Patient;

/**
 *
 * @author AllyCat @ Sheridan High 2021
 */
public abstract class WristBand {
    
    //Fields:_______________________________________
    
    protected Long barcode; 
    protected Patient patient;
    
    //Constructors:__________________________________
    
    
    public WristBand(){
    
    }//End C:*
    
    public WristBand(
                     Long barcode,
                     Patient patient
                    ){
     this.barcode = barcode; 
     this.patient = patient;
    }//End C:*
    
    //Getters:_________________________________________

    public Patient getPatient() {
        return patient;
    }//End M:*

    public void setPatient(Patient patient) {
        this.patient = patient;
    }//End M:*
    
    
    
    
    public Long getBarcode(){
        return barcode;
    }//End G:*
    
    //Setters:_______________________________
    
    public void setBarcode(Long newB){
        this.barcode = newB; 
    }//End S:*
    
    
    //Methods:________________________________
    
    public void print(){
        System.out.println(
                           patient.getName() + 
                           " " + patient.getDob() +
                           " " + patient.get_Family_Doctor()
                           );
    }//End M:*
    
}//End Class:*
