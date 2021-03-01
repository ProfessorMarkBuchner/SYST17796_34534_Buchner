/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBands;

import ThePatients.AllergicMedicatedChild;

/**
 *
 * @author AllyCat13 Sheridan High 2021
 */

public class AllergicMedicatedChildBand extends AllergicChildBand{

    public AllergicMedicatedChildBand(AllergicMedicatedChild patient) {
        super(patient);
    }//End C:*
    
    @Override 
    public void print(){
        super.print();
        if(patient instanceof AllergicMedicatedChild){
            AllergicMedicatedChild converted = (AllergicMedicatedChild)this.patient; 
            for(int i = 0; i < converted.getMedications().size(); i++){
                System.out.println(converted.getMedications().get(i));
            }//End F:*
        }//End I:*
    }//End M:*
    
}//End Class:_________________________
