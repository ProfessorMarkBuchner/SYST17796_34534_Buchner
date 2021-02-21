/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

import OnlineAdmissionSystem.input.UserInput;

/**
 *
 * @author AllyCat @ Sheridan College 2021
 */
public class IntakeForm {
    
    private boolean medications;
    private boolean allergies; 
    private boolean adult;
    private boolean child; 
    private boolean researchSubject;
    
    private final UserInput input;

    //Constructors:________________

    public IntakeForm() {
        this.input = new UserInput();
    }//End C:*
    
    
    public IntakeForm(
                      boolean medications, 
                      boolean allergies, 
                      boolean adult, 
                      boolean child, 
                      boolean researchSubject
    ) {
        this.medications = medications;
        this.allergies = allergies;
        this.adult = adult;
        this.child = child;
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

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public boolean isChild() {
        return child;
    }

    public void setChild(boolean child) {
        this.child = child;
    }

    public boolean isResearchSubject() {
        return researchSubject;
    }

    public void setResearchSubject(boolean researchSubject) {
        this.researchSubject = researchSubject;
    }
    
    //Methods:________________________________________
    
    
    
    
}//End C:*
