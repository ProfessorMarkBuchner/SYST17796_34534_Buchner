/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBands;


import TheBands.AllergicAdultBand;
import ThePatients.AllergicMedicatedAdult;
import ThePatients.Patient;

/**
 *
 * @author AllyCat13 Sheridan High 2021 
 */
public class AllergicMedicatedAdultBand extends AllergicAdultBand{

    public AllergicMedicatedAdultBand() {
        
    }//End C:*
    
    public AllergicMedicatedAdultBand(Long barcode, Patient patient) {
        super(barcode, new AllergicMedicatedAdult());
    }//End C:*
    
    
    @Override
    public void print(){
        super.print();
        if(this.patient instanceof AllergicMedicatedAdult){
            AllergicMedicatedAdult converted = (AllergicMedicatedAdult)this.patient;
            //A: 
            for(int i = 0; i < converted.getMedications().size(); i++){
                System.out.println(converted.getMedications().get(i));
            }//End F*
        }//End I:*
    }//End M:*
    
    
}//End Class:__________________________
