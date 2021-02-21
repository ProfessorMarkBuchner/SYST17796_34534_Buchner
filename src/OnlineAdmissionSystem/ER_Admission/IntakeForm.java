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
 * OOP couples data with methods into objects.
 */
public class IntakeForm {
    
    //A: Questions
    private boolean medications;
    private boolean allergies; 
    private boolean above18;
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
                      boolean above18,
                      boolean researchSubject
    ) {
        this.medications = medications;
        this.allergies = allergies;
        this.researchSubject = researchSubject;
        this.above18 = above18;
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

    public boolean isAbove18() {
        return above18;
    }

    public void setAbove18(boolean above18) {
        this.above18 = above18;
    }
    
    
    //Methods:________________________________________
    
    
    public void askForItAll(){
        
        //A: Q1
        System.out.println("Are you above 18?");
        String q1 =  input.promptStringUser(new Scanner(System.in));
        if(q1.equals("yes")){
            this.setAbove18(true);
        }//End I:*
    
        //B: Q2
        System.out.println("Do you take any prescription medications?");
        String q2 =  input.promptStringUser(new Scanner(System.in));
        if(q2.equals("yes")){
            this.setMedications(true);
        }//End I:*
        
        //C: Q3
        System.out.println("Are you allergic to any medications or any allergies in general?");
        String q3 =  input.promptStringUser(new Scanner(System.in));
        if(q3.equals("yes")){
            this.setAllergies(true);
        }//End I:*
        
        //D: Q4
        System.out.println("Are you willing to participate in any research groups?");
        String q4 =  input.promptStringUser(new Scanner(System.in));
        if(q4.equals("yes")){
            this.setResearchSubject(true);
        }//End I:*
    }//End M:*
    
  
}//End Class:______________________________