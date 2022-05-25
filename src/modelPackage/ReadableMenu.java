package modelPackage;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class ReadableMenu {
    
    private ArrayList<ReadableMeal> listMeal; // ho messo arraylist direttamente
					      //
	    	// per il momento non lo istanziamo, devo capire come
		// e in che contesto istanziarlo visto che 
		// è praticamente lo stesso menu che crea lo chef 
		// ma non scrivibile
		//
		// orientativamente voglio costruirlo sulla base di quello dello 
		// chef, leggendo quello e scrivendolo
		//
	  	// = new ArrayList<ReadableMeal>();
     
    public ReadableMeal getMealByName(String name) {
        //return this.Meal;
		for (ReadableMeal m: listMeal){
			if (m.getName().equals(name)){
				return m;
			}
	
			//TODO manage exceptions
			else {
				throw new InvalidParameterException();
			}
	
	  }
		return null;
	}

    public ArrayList<ReadableMeal> getMenu() {
        return this.listMeal;
    }
    
 }
 