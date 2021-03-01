/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBands;

import ThePatients.AllergicAdult;

/**
 *
 * @author AllyCat13 Sheridan High 2021 
 * Generic programming facilitates polymorphism.
 */
public class AllergicAdultBand extends AdultBand{
        
    public AllergicAdultBand() {
        
    }//End C:*
    
    public AllergicAdultBand(AllergicAdult patient) {
        super(patient);
    }//End C:*
    
    @Override
    public void print(){
        super.print();
        if(this.patient instanceof AllergicAdult){
            AllergicAdult converted = (AllergicAdult)this.patient;
            for(int i = 0; i < converted.getAllergies().size(); i++){
                System.out.println(converted.getAllergies().get(i));
            }//End F:*
        }//End I:*
        
    }//End C:*
    
}//End Class:_________________________
