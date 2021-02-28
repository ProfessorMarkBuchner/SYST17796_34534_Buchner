/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThePatients;

import java.util.ArrayList;

/**
 * 
 * Everything is by way of analogy.
 * @author AllyCat13
 */
public class MedicationList {
    
    //use it like Medications.STIMULANT or Medications.ANTIVIRAL;
    //Make a variable of Medications[] data type.
    private enum Medications{STIMULANT, DEPRESSANT, ANTIDEPRESSANT, ANTIPSYCHOTIC, ANTIVIRAL, INHIBTOR, BLOCKER}

    //Use while loop with sentinal value for getting multiple values.
    private ArrayList<String> stimulantList;
    private ArrayList<String> depressantList;
    private ArrayList<String> antiDepressantList;
    private ArrayList<String> antipsychoticList;
    private ArrayList<String> antiviralList;
    private ArrayList<String> inhibitorList;
    private ArrayList<String> blockerList;
    
    private boolean onStimulant;
    private boolean onDepressant;
    private boolean onAntiDepressant;
    private boolean onAntipsychotic;
    private boolean onAntiviral;
    private boolean onInhibitor;
    private boolean onBlocker;
    
    
    public MedicationList() {
        this.stimulantList = new ArrayList<>();
        this.depressantList = new ArrayList<>();
        this.antiDepressantList = new ArrayList<>();
        this.antipsychoticList = new ArrayList<>();
        this.antiviralList = new ArrayList<>();
        this.inhibitorList = new ArrayList<>();
        this.blockerList = new ArrayList<>();
           
    }//End C:*

    public MedicationList(ArrayList<String> stimulantList, 
                          ArrayList<String> depressantList, 
                          ArrayList<String> antiDepressantList, 
                          ArrayList<String> antipsychoticList, 
                          ArrayList<String> antiviralList, 
                          ArrayList<String> inhibitorList, 
                          ArrayList<String> blockerList) {
        this.stimulantList = stimulantList;
        this.depressantList = depressantList;
        this.antiDepressantList = antiDepressantList;
        this.antipsychoticList = antipsychoticList;
        this.antiviralList = antiviralList;
        this.inhibitorList = inhibitorList;
        this.blockerList = blockerList;
    }
    
    public ArrayList<String> getStimulantList() {
        return stimulantList;
    }

    public void setStimulantList(ArrayList<String> stimulantList) {
        this.stimulantList = stimulantList;
    }

    public ArrayList<String> getDepressantList() {
        return depressantList;
    }

    public void setDepressantList(ArrayList<String> depressantList) {
        this.depressantList = depressantList;
    }

    public ArrayList<String> getAntiDepressantList() {
        return antiDepressantList;
    }

    public void setAntiDepressantList(ArrayList<String> antiDepressantList) {
        this.antiDepressantList = antiDepressantList;
    }

    public ArrayList<String> getAntipsychoticList() {
        return antipsychoticList;
    }

    public void setAntipsychoticList(ArrayList<String> antipsychoticList) {
        this.antipsychoticList = antipsychoticList;
    }

    public ArrayList<String> getAntiviralList() {
        return antiviralList;
    }

    public void setAntiviralList(ArrayList<String> antiviralList) {
        this.antiviralList = antiviralList;
    }

    public ArrayList<String> getInhibitorList() {
        return inhibitorList;
    }

    public void setInhibitorList(ArrayList<String> inhibitorList) {
        this.inhibitorList = inhibitorList;
    }

    public ArrayList<String> getBlockerList() {
        return blockerList;
    }

    public void setBlockerList(ArrayList<String> blockerList) {
        this.blockerList = blockerList;
    }
    
    
}//End Class:*
