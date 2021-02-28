/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBands;

import TheBands.AdultBand;
import ThePatients.MedicatedAdult;
import ThePatients.Patient;

/**
 *
 * @author AllyCat13 Sheridan High 2021 
 */
public class MedicatedAdultBand extends AdultBand{

    public MedicatedAdultBand() {
        
    }//End C:*
    
    public MedicatedAdultBand(Long barcode, Patient patient) {
        super(barcode, new MedicatedAdult());
    }//End C:*
    
    //Methods:________________________
    
    @Override 
    public void print(){
        super.print();
        if(this.patient instanceof MedicatedAdult){
            MedicatedAdult converted = (MedicatedAdult)this.patient;
            for(int i = 0; i < converted.getMedications().size(); i++){
                System.out.println(converted.getMedications().get(i));
            }//End F:*
        }//End I:*
        
    }//End C:*
    
}//End Class:____________________________
