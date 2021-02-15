/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem;

/**
 *
 * @author aleks
 */
public class WristBand {
    
    //Fields:_______________________________________
    
    private Long barcode; 
    
    //Constructors:__________________________________
    
    
    public WristBand(){
    
    }//End C:*
    
    public WristBand(Long barcode){
     this.barcode = barcode; 
    }//End C:*
    
    //Getters:_________________________________________
    
    public Long getBarcode(){
        return barcode;
    }//End G:*
    
    //Setters:_______________________________
    
    public void setBarcode(Long newB){
        this.barcode = newB; 
    }//End S:*
    
}//End Class:*
