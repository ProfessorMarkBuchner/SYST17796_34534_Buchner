/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER_Dep;

//Imports:_____________________________________
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
import java.time.Period;

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

        //A: Create 
        ER_Room er = new ER_Room();
        IntakeForm form = new IntakeForm();

        //B: Gather 
        form.askForItAll();

        //C: Check 
        /*
       Goes: above 18 | meds | allergies | research
         */
 /*
       int id,
             String parent,
             String name,
             LocalDate dob,
             String family_doctor,
             String medicalProblem,
             ArrayList<WristBand> bandList,
             WristBand basicBand,
             LocalDate admitDate
         */
        //Breaking for the night. Tomorrow parse dob and ask for rest of stuff
        //At right level.
        if (form.isAbove18()) {
            System.out.println("ChildPatient: Enter name, dob, family doctor, medical problem, and parent name");
            er.setPatient(new ChildPatient(/* name | dob | family doctor | medical problem | parent   */
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser())
            );
            if (form.isAllergies()) {
                System.out.println("AllergicChild: Enter name, dob, family doctor, medical problem, parent name, and allergies");
                /* name | dob | family doctor | medical problem | parent  | allergies */
                er.setPatient(new AllergicChild(
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel()));
                if (form.isMedications()) {
                    System.out.println("AllergicMedicatedChild: Enter name, dob, family doctor, medical problem, parent name, allergies, and medications");
                    er.setPatient(new AllergicMedicatedChild(er.getInput().promptStringUser(),
                            er.getInput().promptStringUser(),
                            er.getInput().promptStringUser(),
                            er.getInput().promptStringUser(),
                            er.getInput().promptStringUser(),
                            er.getInput().promptStringSentinel(),
                            er.getInput().promptStringSentinel()));
                }//End I3:*
            }//End I2:*
            if (form.isMedications()) {
                System.out.println("MedicatedChild: Enter name, dob, family doctor, medical problem, parent name, and medications");
                er.setPatient(new MedicatedChild(
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel()));
            }//End I2:*
        }//End I1:*
        else {
            System.out.println("AdultPatient: Enter name, dob, family doctor, and medical problem");
            er.setPatient(new AdultPatient(/* name | dob | family doctor | medical problem   */
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser(),
                    er.getInput().promptStringUser())
            );
            if (form.isAllergies()) {
                /* name | dob | family doctor | medical problem  | allergies */
                System.out.println("AllergicAdult: Enter name, dob, family doctor, medical problem, and allergies");
                er.setPatient(new AllergicAdult(
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel()));
                if (form.isMedications()) {
                    /* name | dob | family doctor | medical problem  | allergies | medications  */
                    System.out.println("AllergicMedicatedAdult: Enter name, dob, family doctor, medical problem, allergies, and medications");
                    er.setPatient(new AllergicMedicatedAdult(er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel(),
                        er.getInput().promptStringSentinel()
                        ));
                }//End I3:*
            }//End I2:*
            if (form.isMedications()) {
                /* name | dob | family doctor | medical problem  | medications */
                System.out.println("MedicatedAdult: Enter name, dob, family doctor, medical problem, and medications");
                er.setPatient(new MedicatedAdult(er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringUser(),
                        er.getInput().promptStringSentinel()));
            }//End I2:*
        }//End I1:*

    }//End M:*

    public boolean isAdult(LocalDate dob) {
        boolean result = false;
        LocalDate present = LocalDate.now();
        Period p = Period.between(dob, present);
        if (p.getYears() >= 18) {
            result = true;
        }//End I:*
        return result;
    }//End M:*

}//End Class:_____________________________
