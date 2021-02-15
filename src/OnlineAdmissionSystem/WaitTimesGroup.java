/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

import java.util.ArrayList;

/**
 *
 * @author aleks
 */
public class WaitTimesGroup extends ResearchGroups{
    
    
    //Fields:
    private double waitTime;
    private ArrayList<Patient> groupList;
    
    //Constructors 
    
    //No Arg 
    public WaitTimesGroup(){
    
    }
    
    
    public boolean minCapacity(){
    boolean result = false;
        if(this.groupList.size() >= 10){
            result = true; 
        }//End I:*
    return result; 
    }//End M:*
    
    
    
    
}//End Class
