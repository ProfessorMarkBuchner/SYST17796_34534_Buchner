/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

import java.util.ArrayList;

/**
 *
 * @author Aleks Lim @ Sheridan College 2021 
 */
public class ResearchGroups {
    
    
    //Fields
    
    private ArrayList<Patient> groupList; 
    
    //No Arg Constructor 
    public ResearchGroups(){
    }
    
    
    //Methods
    
    public boolean maxGroups(){
    boolean result = false;
        if(this.groupList.size() > 10){
            result = true; 
        }//End I:*
    return result; 
    }//End M:*
    
}//End Class:*
