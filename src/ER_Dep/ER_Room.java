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
    private Patient patient;
    private WristBand wristBand;
    private LocalDate dob;

    //Getters & Setters:____________________________
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public WristBand getWristBand() {
        return wristBand;
    }

    public void setWristBand(WristBand wristBand) {
        this.wristBand = wristBand;
    }

    //Constructors:_____________________________________
    public ER_Room() {
        this.input = new UserInput();
    }//End C:*

    //Getters & Setters:________________________________________
    public UserInput getInput() {
        return input;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
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
            er.setPatient(new AdultPatient(
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser()));
            //Assign wrist band
            AdultPatient converted = (AdultPatient)er.getPatient();
            converted.setBasicBand(new AdultBand(converted));
            er.setPatient(converted);
        }//End I:*
        
        if(form.isAbove18() && form.isAllergies() & !form.isMedications()){
            /* name | dob | family doctor | medical problem  | allergies */
                System.out.println("AllergicAdult: Enter name, dob, family doctor, medical problem, and allergies");
                er.setPatient(new AllergicAdult(
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel()));
                //Assign Band
            AllergicAdult converted = (AllergicAdult)er.getPatient();
            converted.setBasicBand(new AllergicAdultBand(converted));
            er.setPatient(converted);
        }//End I:*
        
        if(form.isAbove18() && !form.isAllergies() & form.isMedications()){
            /* name | dob | family doctor | medical problem  | medications */
                System.out.println("MedicatedAdult: Enter name, dob, family doctor, medical problem, and medications");
                er.setPatient(new MedicatedAdult(er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel()));
            MedicatedAdult converted = (MedicatedAdult)er.getPatient();
            converted.setBasicBand(new MedicatedAdultBand(converted));
            er.setPatient(converted);
        }//End I:*
        
        if(form.isAbove18() && form.isAllergies() & form.isMedications()){
             /* name | dob | family doctor | medical problem  | allergies | medications  */
                    System.out.println("AllergicMedicatedAdult: Enter name, dob, family doctor, medical problem, allergies, and medications");
                    er.setPatient(new AllergicMedicatedAdult(er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel(),
                        er.getInput().promptStringSentinel()
                        ));
            AllergicMedicatedAdult converted = (AllergicMedicatedAdult)er.getPatient();
            converted.setBasicBand(new AllergicMedicatedAdultBand(converted));
            er.setPatient(converted);
        }//End I:*
        
    
        //Start Child Patient Types:__________________________________
        
        if(!form.isAbove18() && !form.isAllergies() & !form.isMedications()){
            /* name | dob | family doctor | medical problem | parent   */
            System.out.println("ChilPatient: Enter name, dob, family doctor, medical problem, and parent name");
            er.setPatient(new ChildPatient(
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser()));
            ChildPatient converted = (ChildPatient)er.getPatient();
            converted.setBasicBand(new ChildBand(converted));
            er.setPatient(converted);
        }//End I:*
        
 
      if(!form.isAbove18() && form.isAllergies() & !form.isMedications()){
          System.out.println("AllergicChild: Enter name, dob, family doctor, medical problem, parent name, and allergies");
                /* name | dob | family doctor | medical problem | parent  | allergies */
                er.setPatient(new AllergicChild(
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel()));
            AllergicChild converted = (AllergicChild)er.getPatient();
            converted.setBasicBand(new AllergicChildBand(converted));
            er.setPatient(converted);
      }//End I:*
      
      if(!form.isAbove18() && !form.isAllergies() & form.isMedications()){
          System.out.println("MedicatedChild: Enter name, dob, family doctor, medical problem, parent name, and medications");
                er.setPatient(new MedicatedChild(
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel()));
            MedicatedChild converted = (MedicatedChild)er.getPatient();
            converted.setBasicBand(new MedicationChildBand(converted));
            er.setPatient(converted);
      }//End I:*
      
      if(!form.isAbove18() && form.isAllergies() & form.isMedications()){
            System.out.println("AllergicMedicatedChild: Enter name, dob, family doctor, medical problem, parent name, allergies, and medications");
                    er.setPatient(new AllergicMedicatedChild(er.getInput().promptStringUser(),
                            er.getInput().promptStringUser(),
                            er.getInput().promptStringUser(),
                            er.getInput().promptStringUser(),
                            er.getInput().promptStringUser(),
                            er.getInput().promptStringSentinel(),
                            er.getInput().promptStringSentinel()));
            AllergicMedicatedChild converted = (AllergicMedicatedChild)er.getPatient();
            converted.setBasicBand(new AllergicMedicatedChildBand(converted));
            er.setPatient(converted);
        }//End I:*
      
    }//End Main:*

}//End Class:_____________________________
