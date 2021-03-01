/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER_Dep;

//Imports:_____________________________________
import TheBands.AdultBand;
import TheBands.AllergicAdultBand;
import TheBands.AllergicChildBand;
import TheBands.AllergicMedicatedAdultBand;
import TheBands.AllergicMedicatedChildBand;
import TheBands.ChildBand;
import TheBands.MedicatedAdultBand;
import TheBands.MedicationChildBand;
import UserInput.UserInput;
import TheBands.WristBand;
import ThePatients.AdultPatient;
import ThePatients.AllergicAdult;
import ThePatients.ChildPatient;
import ThePatients.AllergicChild;
import ThePatients.AllergicMedicatedAdult;
import ThePatients.AllergicMedicatedChild;
import ThePatients.MedicatedAdult;
import ThePatients.MedicatedChild;
import ThePatients.Patient;
import java.time.LocalDate;

/**
 *
 * @author AllyCat @ Sheridan College 2021 Can't do UML until the programs
 * complete. it's a subsequent task.
 */

/*
Models a ER department providing service to 
1 patient at a time. 
 */
public class ER_Room {

    //Fields:__________________________________________
    //This var is just for usage and doesn't change 
    private final UserInput input;

    //Getters & Setters:____________________________
   

    //Constructors:_____________________________________
    public ER_Room() {
        this.input = new UserInput();
    }//End C:*

    //Getters & Setters:________________________________________
    public UserInput getInput() {
        return input;
    }


    //Methods:________________________________________________
    //Program Starter 
    public static void main(String[] args) {

        
        //Step 1:Administer the intake form:_______________________________________
        
        //A: Create 
        ER_Room er = new ER_Room();
        IntakeForm form = new IntakeForm();

        //B: Gather 
        form.askForItAll();

  
        //Step 2: Start Adult Patient Control Checks:______________________________
        
        
        if(form.isAbove18() && !form.isAllergies() & !form.isMedications()){
            System.out.println("AdultPatient: Enter name, dob, family doctor, and medical problem");
            /* name | dob | family doctor | medical problem   */
             AdultPatient ap = new AdultPatient(
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser());
            //Assign wrist band
            
            ap.setBasicBand(new AdultBand(ap));
            ap.getBasicBand().print();
            
        }//End I:*
        
        if(form.isAbove18() && form.isAllergies() & !form.isMedications()){
            /* name | dob | family doctor | medical problem  | allergies */
                System.out.println("AllergicAdult: Enter name, dob, family doctor, medical problem, and allergies");
                    AllergicAdult aa = new AllergicAdult(
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel());
                //Assign Band

            aa.setBasicBand(new AllergicAdultBand(aa));
            aa.getBasicBand().print();
           
           
        }//End I:*
        
        if(form.isAbove18() && !form.isAllergies() & form.isMedications()){
            /* name | dob | family doctor | medical problem  | medications */
                System.out.println("MedicatedAdult: Enter name, dob, family doctor, medical problem, and medications");
                MedicatedAdult ma = new MedicatedAdult(er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel());
            ma.setBasicBand(new MedicatedAdultBand(ma));
            ma.getBasicBand().print();
          
        }//End I:*
        
        if(form.isAbove18() && form.isAllergies() & form.isMedications()){
             /* name | dob | family doctor | medical problem  | allergies | medications  */
                    System.out.println("AllergicMedicatedAdult: Enter name, dob, family doctor, medical problem, allergies, and medications");
                    AllergicMedicatedAdult ama = new AllergicMedicatedAdult(er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel(),
                        er.getInput().promptStringSentinel()
                        );
            ama.setBasicBand(new AllergicMedicatedAdultBand(ama));
            ama.getBasicBand().print();
          
        }//End I:*
        
    
        //Start Child Patient Types:__________________________________
        
        if(!form.isAbove18() && !form.isAllergies() & !form.isMedications()){
            /* name | dob | family doctor | medical problem | parent   */
            System.out.println("ChilPatient: Enter name, dob, family doctor, medical problem, and parent name");
             ChildPatient cp = new ChildPatient(
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser());
            cp.setBasicBand(new ChildBand(cp));
            cp.getBasicBand().print();
                 
        }//End I:*
        
 
      if(!form.isAbove18() && form.isAllergies() & !form.isMedications()){
          System.out.println("AllergicChild: Enter name, dob, family doctor, medical problem, parent name, and allergies");
                /* name | dob | family doctor | medical problem | parent  | allergies */
                AllergicChild ac = new AllergicChild(
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel());
            ac.setBasicBand(new AllergicChildBand(ac));
            ac.getBasicBand().print();
      }//End I:*
      
      if(!form.isAbove18() && !form.isAllergies() & form.isMedications()){
          System.out.println("MedicatedChild: Enter name, dob, family doctor, medical problem, parent name, and medications");
                MedicatedChild mc = new MedicatedChild(
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel());
            mc.setBasicBand(new MedicationChildBand(mc));
            mc.getBasicBand().print();
      }//End I:*
      
      if(!form.isAbove18() && form.isAllergies() & form.isMedications()){
            System.out.println("AllergicMedicatedChild: Enter name, dob, family doctor, medical problem, parent name, allergies, and medications");
                    AllergicMedicatedChild amc = new AllergicMedicatedChild(er.getInput().promptStringUser(),
                            er.getInput().promptStringUser(),
                            er.getInput().promptStringUser(),
                            er.getInput().promptStringUser(),
                            er.getInput().promptStringUser(),
                            er.getInput().promptStringSentinel(),
                            er.getInput().promptStringSentinel());
            amc.setBasicBand(new AllergicMedicatedChildBand(amc));
            amc.getBasicBand().print();
        }//End I:*
     
    }//End Main:*

}//End Class:_____________________________
