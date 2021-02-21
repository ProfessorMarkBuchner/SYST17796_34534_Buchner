/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.groups;

import OnlineAdmissionSystem.patients.Patient;
import java.util.ArrayList;

/**
 *
 * @author AllyCat13 @ Sheridan College 2021 
 */
public abstract class ResearchGroups {
    
    
    //Fields
    
    private ArrayList<Patient> patientList; 
    private ArrayList<ResearchGroups> groupList; 
    private int duplicates; 
    
    //No Arg Constructor 
    public ResearchGroups(){
    }
    
    //All Arg Constructor 
    public ResearchGroups(
                          ArrayList<Patient> patientList,
                           ArrayList<ResearchGroups> groupList,
                           int duplicates
                          ){
        this.patientList = patientList; 
        this.groupList = groupList;
        this.duplicates = duplicates;
    }//End C:*
    
    //Getters:
    public ArrayList<Patient> getPatientList(){
        return patientList;
    }
    
    public ArrayList<ResearchGroups> getGroupList(){
        return groupList;
    }
    
    
    //Setters:
    public void setPatientList(ArrayList<Patient> newPL){
        this.patientList = newPL;
    }
    
    public void setGroupList(ArrayList<ResearchGroups> newGL){
        this.groupList = newGL;
    }
    
    //Methods
    public boolean maxGroupEnrollment(Patient tPatient){
        boolean result = false;
        for(int i = 0; i < groupList.size(); i++){
            for(int j = 0; j < groupList.get(i).getPatientList().size(); j++){
                if(groupList.get(i).getPatientList().get(j).getId() == tPatient.getId()){
                    duplicates += 1;
                }//End I:*
            }//End F1:*
        }//End F2:*
        if(duplicates > 1){
            result = true;
        }//End I:*
        return result;
    }//End M:*
    
    
    
    
}//End Class:*
