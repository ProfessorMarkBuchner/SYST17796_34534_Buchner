/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.ER_Admission;

//Imports:_____________________________________


import OnlineAdmissionSystem.input.UserInput;
import OnlineAdmissionSystem.wristbands.WristBand;
import OnlineAdmissionSystem.patients.AdultPatient;
import OnlineAdmissionSystem.patients.AllergicAdult;
import OnlineAdmissionSystem.patients.ChildPatient;
import OnlineAdmissionSystem.patients.AllergicChild;
import OnlineAdmissionSystem.patients.AllergicMedicatedAdult;
import OnlineAdmissionSystem.patients.AllergicMedicatedChild;
import OnlineAdmissionSystem.patients.MedicatedAdult;
import OnlineAdmissionSystem.patients.MedicatedChild;
import OnlineAdmissionSystem.patients.Patient;
import java.time.LocalDate;
import java.time.Period;



/**
 *
 * @author AllyCat @ Sheridan College 2021
 * Can't do UML until the programs complete. it's a subsequent task.
 */

/*
Models a ER department providing service to 
1 patient at a time. 
*/

public class ER_Admission {
    
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
    
    public ER_Admission(){
        input = new UserInput();
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
    public static void main (String[] args){
        
        //A: Create 
        ER_Admission er = new ER_Admission();
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
       if(form.isAbove18()){
           er.setPatient(new ChildPatient());
           if(form.isAllergies()){
               er.setPatient(new AllergicChild());
               if(form.isMedications()){
                er.setPatient(new AllergicMedicatedChild());
               }//End I3:*
           }//End I2:*
           if(form.isMedications()){
               er.setPatient(new MedicatedChild());
           }//End I2:*
       }//End I1:*
       else {
          er.setPatient(new AdultPatient());
          if(form.isAllergies()){
               er.setPatient(new AllergicAdult());
               if(form.isMedications()){
                er.setPatient(new AllergicMedicatedAdult());
               }//End I3:*
           }//End I2:*
          if(form.isMedications()){
              er.setPatient(new MedicatedAdult());
          }//End I2:*
       }//End I1:*
    
    }//End M:*
    
    public boolean isAdult(LocalDate dob) {
       boolean result = false;
       LocalDate present = LocalDate.now();
       Period p = Period.between(dob, present);
       if(p.getYears() >= 18){
           result = true; 
       }//End I:*
        return result;
    }//End M:*
    

    
}//End Class:_____________________________
