/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

/**
 *
 * @author aleks
 */
public class ChildrensWristBand extends WristBand{
    
   
    
    public ChildrensWristBand(){
    
    }//End C:*
    
    public ChildrensWristBand(
                              Long barcode,
                              ChildPatient patient
                              ){
        super(
              barcode, 
              patient
              );
    
    }//End C:*
    
    @Override 
    public void printBand(){
    super.printBand();
    if(patient instanceof ChildPatient){
        ChildPatient converted = (ChildPatient) patient;
        System.out.println(converted.getParent());
    }//End I:*
        
    }//End M:*
    
}//End Class:*
