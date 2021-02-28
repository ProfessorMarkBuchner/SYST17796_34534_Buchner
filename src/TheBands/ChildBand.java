/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBands;

import ThePatients.ChildPatient;

/**
 *
 * @author aleks
 */
public class ChildBand extends WristBand{
   
    public ChildBand(){
    
    }//End C:*
    
    public ChildBand(
                              Long barcode,
                              ChildPatient patient
                              ){
        super(
              barcode, 
              patient
              );
    
    }//End C:*
    
    @Override 
    public void print(){
    super.print();
    if(this.patient instanceof ChildPatient){
        ChildPatient converted = (ChildPatient)this.patient;
        System.out.println(converted.getParent());
    }//End I:*
        
    }//End M:*
    
}//End Class:*
