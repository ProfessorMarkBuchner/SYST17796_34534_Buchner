/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

/**
 *
 * @author Aleks Lim @ Sheridan College 2021
 */
public class WristBand {
    
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
    }//End C:*
    
    //Getters:_________________________________________
    
    public Long getBarcode(){
        return barcode;
    }//End G:*
    
    //Setters:_______________________________
    
    public void setBarcode(Long newB){
        this.barcode = newB; 
    }//End S:*
    
    
    //Methods:________________________________
    
    public void printBand(){
        System.out.println(
                           patient.getName() + 
                           " " + patient.getDob() +
                           " " + patient.get_Family_Doctor()
                           );
    }//End M:*
    
}//End Class:*
