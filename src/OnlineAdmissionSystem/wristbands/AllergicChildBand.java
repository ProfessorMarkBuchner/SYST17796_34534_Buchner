/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.wristbands;

import OnlineAdmissionSystem.patients.AllergicChild;

/**
 *
 * @author AllyCat13 @Sheridan High 2021
 */
public class AllergicChildBand extends ChildBand{
    

    //Constrcutors:_________________________________
    
    public AllergicChildBand(){
    
    }
    
    public AllergicChildBand(Long barcode, AllergicChild patient){
        super(barcode, patient);
    }//End C:*
    
    //Everything professor communicates is by way of analogy.
    @Override
    public void print(){
    super.print();
        if(this.patient instanceof AllergicChild){
            AllergicChild converted = (AllergicChild)this.patient;
            for(int i = 0; i < converted.getAllergies().size(); i++){
                System.out.println(converted.getAllergies().get(i));
            }//End F:*
        }//End I:*
    }//End M:*
    
}//End Class:*
