/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.ER_Admission;

import OnlineAdmissionSystem.input.UserInput;
import OnlineAdmissionSystem.wristbands.WristBand;
import OnlineAdmissionSystem.patients.AdultPatient;
import OnlineAdmissionSystem.patients.ChildPatient;
import OnlineAdmissionSystem.patients.Patient;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;



/**
 *
 * @author AllyCat @ Sheridan College 2021
 * Can't do UML until the programs complete.
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
    
    public static void main (String[] args){
        
        ER_Admission er = new ER_Admission();
        
        
        //Patient enters Er and provides dob 
        //Format is year-month-day 
        
        //A: Get DOB because patient type depends on it. 
        System.out.println("Can I have your date of birth please like year-month-day");
        String sDob = er.getInput().promptStringUser(new Scanner(System.in));
        LocalDate lDob = LocalDate.parse(sDob);
        
        //B: Evaluate 
        boolean checkAge = er.isAdult(lDob);
        if(checkAge == true){
            er.setPatient(new AdultPatient());
            AdultPatient converted = (AdultPatient)er.getPatient();
            converted.setDob(lDob);
            converted.setAdmitDate(LocalDate.now());
            er.setPatient(converted);
        }//End I:*
        else {
        er.setPatient(new ChildPatient());
            ChildPatient converted = (ChildPatient)er.getPatient();
            System.out.println("Can I have your parents name plase?");
            converted.setParent(er.getInput().promptStringUser(new Scanner(System.in)));
            converted.setDob(lDob);
            converted.setAdmitDate(LocalDate.now());
            er.setPatient(converted);       
        }//End E:*
        
        //C:
        er.askForItAll();
        
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
    
    /*
    Need to know if patient has allergies because wrist band type
    is dependent on this.*/
    
    public boolean checkAllergies(){
        boolean result = false;
        String answer = this.getInput().promptStringUser(new Scanner(System.in));
        if(answer.equals("yes")){
               result = true;
        }//End I:*
        return result;
    }//End M:*
    
    
    public void askForItAll(){
        /*
    protected int id;
    protected String name;
    protected LocalDate dob;
    protected String family_doctor;
    private String medicalProblem;
    protected ArrayList<String> medications;
    protected ArrayList<String> allergies;
    protected ArrayList<WristBand> bandList;
    protected WristBand basicBand;
    protected LocalDate admitDate;
        */
        
        this.patient.setName(input.promptStringUser(new Scanner(System.in)));
        this.patient.setFamily_doctor(input.promptStringUser(new Scanner(System.in)));
        this.patient.setId(this.patient.getNumberOfPatients() + 1);
        this.patient.setMedicalProblem(input.promptStringUser(new Scanner(System.in)));
    }
    
    
    
}//End Class:*
