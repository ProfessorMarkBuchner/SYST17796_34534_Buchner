/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.patients;

import OnlineAdmissionSystem.wristbands.WristBand;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * This class represents students in our application
 *
 * @author AllyCat was here @ Sheridan College 2021
 */
//Class to model patients in an ER Admission System
public abstract class Patient {

    //Fields:___________________________
    
    protected int id;
    protected String name;
    protected LocalDate dob;
    protected String family_doctor;
    private String medicalProblem;
    protected ArrayList<String> medications;
    protected ArrayList<WristBand> bandList;
    protected WristBand basicBand;
    protected LocalDate admitDate;
    private static int numberOfPatients;

    

    //Constructors:_________________________
    
    public Patient() {
        numberOfPatients += 1;
        
    }//End C:*

    public Patient(
            int id,
            String name,
            LocalDate dob,
            String family_doctor,
            String medicalProblem,
            ArrayList<String> medications,
            ArrayList<WristBand> bandList,
            WristBand basicBand,
            LocalDate admitDate
                    ) {
        
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.family_doctor = family_doctor;
        this.medicalProblem = medicalProblem;
        this.medications = medications;
        this.bandList = bandList;
        this.admitDate = admitDate;
        numberOfPatients += 1;
        
    }//End M:*

    //Getters & Setters:______________________________
    
    public static int getNumberOfPatients() {
        return numberOfPatients;
    }//End G:*
    
    public int getId(){
    return id;
    }//End G:*
    public String getName() {
        return name;
    }//End G:*

    public LocalDate getDob() {
        return dob;
    }//End G:*

    public String get_Family_Doctor() {
        return family_doctor;
    }//End G:*

    public ArrayList<String> getMedications() {
        return medications;
    }//End G:*

  

    public ArrayList<WristBand> getBandList() {
        return bandList;
    }//End G:*

    public WristBand getBasicBand() {
        return basicBand;
    }//End G:*

    public LocalDate getAdmitDate() {
        return admitDate;
    }//End G:*
    
    public String getFamily_doctor() {
        return family_doctor;
    }

    public void setFamily_doctor(String family_doctor) {
        this.family_doctor = family_doctor;
    }

    public String getMedicalProblem() {
        return medicalProblem;
    }

    public void setMedicalProblem(String medicalProblem) {
        this.medicalProblem = medicalProblem;
    }

    public void setId(int newId){
        this.id = newId;
    }//End S:*
    
    public void setName(String name) {
        this.name = name;
    }//End S:*

    public void setDob(LocalDate newDob) {
        this.dob = newDob;
    }//End S:*

    public void set_Family_Doctor(String newFD) {
        this.family_doctor = newFD;
    }//End S:*

    public void setMedications(ArrayList<String> newMs) {
        this.medications = newMs;
    }//End S:*

   

    public void setBandList(ArrayList<WristBand> newBLs) {
        this.bandList = newBLs;
    }//End S:*

    public void setBasicBand(WristBand newBB) {
        this.basicBand = newBB;
    }//End S:*

    public void setAdmitDate(LocalDate newAD) {
        this.admitDate = newAD;
    }//End S:*

    //Methods:_______________________________
    
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
    private static int numberOfPatients;
    */
    public void print(){
        System.out.println(
                           id + " " + "|" + " " +
                           name + " " + "|" + " " +
                           dob + " " + "|" + " " + 
                           family_doctor + " " + "|" +
                           medicalProblem + " " + "|" +
                           admitDate
                           );
    }//End M:*

}//End Class:_____________________________
