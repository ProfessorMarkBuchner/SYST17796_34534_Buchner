/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.ER_Admission;

import OnlineAdmissionSystem.input.UserInput;
import java.util.Scanner;

/**
 *
 * @author AllyCat @ Sheridan College 2021
 */
public class IntakeForm {
    
    //A: Questions
    private boolean medications;
    private boolean allergies; 
    private boolean researchSubject;
    //B: Utility 
    private final UserInput input;

    //Constructors:________________

    public IntakeForm() {
        this.input = new UserInput();
    }//End C:*
    
    
    public IntakeForm(
                      boolean medications, 
                      boolean allergies, 
                      boolean researchSubject
    ) {
        this.medications = medications;
        this.allergies = allergies;
        this.researchSubject = researchSubject;
        this.input = new UserInput();
        
    }//End C:*
    
    //Getters & Setters:_______________________

    public boolean isMedications() {
        return medications;
    }

    public void setMedications(boolean medications) {
        this.medications = medications;
    }

    public boolean isAllergies() {
        return allergies;
    }

    public void setAllergies(boolean allergies) {
        this.allergies = allergies;
    }
    public boolean isResearchSubject() {
        return researchSubject;
    }

    public void setResearchSubject(boolean researchSubject) {
        this.researchSubject = researchSubject;
    }
    
    //Methods:________________________________________
    
    
    private void askForItAll(){
        System.out.println("Do you take any prescription medications?");
        String q1 =  input.promptStringUser(new Scanner(System.in));
        if(q1.equals("yes")){
            this.setMedications(true);
        }//End I:*
        System.out.println("Are you allergic to any medications or any allergies in general?");
        String q2 =  input.promptStringUser(new Scanner(System.in));
        if(q2.equals("yes")){
            this.setAllergies(true);
        }//End I:*
        System.out.println("Are you willing to participate in any research groups?");
        String q3 =  input.promptStringUser(new Scanner(System.in));
        if(q3.equals("yes")){
            this.setResearchSubject(true);
        }//End I:*
    }//End M:*
    
  
}//End C:*