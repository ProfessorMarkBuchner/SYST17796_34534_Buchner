/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineAdmissionSystem.patients;

import java.util.ArrayList;

/**
 *
 * @author aleks
 */
public class AllergyList {

    private enum allergies{DUST, FOOD, MEDICATIONS, PLANTS, ANIMALS}
    
    private ArrayList<String> dustAllergies;
    private ArrayList<String> foodAllergies;
    private ArrayList<String> medicationAllergies;
    private ArrayList<String> plantAllergies;
    private ArrayList<String> animalAllergies;
    
    private boolean allergicDust;
    private boolean allergicFood;
    private boolean allergicMedication;
    private boolean allergicPlants;
    private boolean allergicAnimals;
    
    public AllergyList() {
        this.dustAllergies = new ArrayList<>();
        this.medicationAllergies = new ArrayList<>();
        this.plantAllergies = new ArrayList<>();
        this.animalAllergies = new ArrayList<>();
        
    }//End C:*

    public AllergyList(ArrayList<String> dustAllergies, 
                       ArrayList<String> medicationAllergies, 
                       ArrayList<String> plantAllergies, 
                       ArrayList<String> animalAllergies) {
        this.dustAllergies = dustAllergies;
        this.medicationAllergies = medicationAllergies;
        this.plantAllergies = plantAllergies;
        this.animalAllergies = animalAllergies;
    }//End C:*
    
    

    public ArrayList<String> getDustAllergies() {
        return dustAllergies;
    }

    public void setDustAllergies(ArrayList<String> dustAllergies) {
        this.dustAllergies = dustAllergies;
    }

    public ArrayList<String> getMedicationAllergies() {
        return medicationAllergies;
    }

    public void setMedicationAllergies(ArrayList<String> medicationAllergies) {
        this.medicationAllergies = medicationAllergies;
    }

    public ArrayList<String> getPlantAllergies() {
        return plantAllergies;
    }

    public void setPlantAllergies(ArrayList<String> plantAllergies) {
        this.plantAllergies = plantAllergies;
    }

    public ArrayList<String> getAnimalAllergies() {
        return animalAllergies;
    }

    public void setAnimalAllergies(ArrayList<String> animalAllergies) {
        this.animalAllergies = animalAllergies;
    }
    
    
      
   
}//End Class:*
