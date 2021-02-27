/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.wristbands;

import OnlineAdmissionSystem.patients.MedicatedChild;

/**
 *
 * @author AllyCat13 Sheridan High 2021
 */
public class MedicationChildBand extends WristBand {

    public MedicationChildBand() {

    }//End C:*

    public MedicationChildBand(Long barcode, MedicatedChild patient) {
        super(barcode, patient);
    }//End C:*

    @Override
    public void print() {
        super.print();

        if (super.getPatient() instanceof MedicatedChild) {
            MedicatedChild converted = (MedicatedChild) super.getPatient();
            for (int i = 0; i < converted.getMedications().size(); i++) {
                System.out.println(converted.getMedications().get(i));
            }//End F:*  
        }//End I:*

    }//End M:*

}//End Class:______________________
