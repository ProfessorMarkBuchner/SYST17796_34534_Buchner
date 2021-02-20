/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

/**
 *
 * @author Aleks Lim @Sheridan College 2021
 */
public class AllergyWristBand extends WristBand{
    
    //Constrcutors:_________________________________
    
    public AllergyWristBand(){
    
    }
    
    public AllergyWristBand(
                             Long barcode,
                             Patient patient
                            ){
        super(
                barcode,
                patient
              );
    }//End C:*
    
    @Override
    public void printBand(){
    super.printBand();
        //System.out.println(patient.getAllergies());
    }
    
}//End Class:*
