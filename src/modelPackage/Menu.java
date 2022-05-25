package modelPackage;

import java.util.ArrayList;

public class Menu extends ReadableMenu{ // NOMI CLASSI MAIUSCOLI  
	
	//TODO private 
    public ArrayList<Meal> listMeal = new ArrayList();

    public void addMeal(Meal newMeal) { 
    	
    	this.listMeal.add(newMeal);
       
    }
    
    public void removeMeal(int index) { 
    	//TODO handle exception
    	listMeal.remove(index);
    	
    }
    
  
}