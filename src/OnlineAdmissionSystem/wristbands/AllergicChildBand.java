/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.wristbands;

import OnlineAdmissionSystem.patients.Patient;

/**
 *
 * @author Aleks Lim @Sheridan College 2021
 */
public class AllergicChildBand extends WristBand{
    
   
            
    //Constrcutors:_________________________________
    
    public AllergicChildBand(){
    
    }
    
    public AllergicChildBand(
                             Long barcode,
                             Patient patient
                            ){
        super(
                barcode,
                patient
              );
    }//End C:*
    
    @Override
    public void print(){
    super.print();
        //System.out.println(patient.getAllergies());
    }
    
}//End Class:*
