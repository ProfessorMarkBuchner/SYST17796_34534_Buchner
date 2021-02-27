/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.wristbands;

//Imports:________________________________

import OnlineAdmissionSystem.patients.AdultPatient;
import OnlineAdmissionSystem.patients.Patient;

/**
 *
 * @author AllyCat13 Sheridan High 2021 
 */
public class AdultBand extends WristBand{

    public AdultBand() {
        
    }//End C:*
    
    public AdultBand(
                     Long barcode,
                     AdultPatient patient
                    ) {
        super(barcode, patient);   
    }//End C:*
    
    
    @Override
    public void print(){
        super.print();
    }//End M:*
    
}//End Class:____________________________
