/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

/**
 *
 * @author Aleks Lim was here @ Sheridan College 2021
 */

//Class to model children as different type of patient 
public class ChildPatient {
    
    //Fields:____________________________
    
    private String parent;
    
    //Constructors:_______________________________
    
    public ChildPatient(String parent){
        this.parent = parent; 
    }//End C:*
    
    //No Arg Constructor 
    public ChildPatient(){
    
    }//End C:*
    
    
    //Getters:___________________________
    
    public String getParent(){return parent;}
    
    //Setters:______________________________
    
    public void setParent(String newParent){ this.parent = newParent;}
    
    
    
    
}//End Class:________________________
