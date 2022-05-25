package modelPackage;

import java.util.ArrayList;

public class ChefModel {
	private Menu chefMenu; 
	
	//TODO file persistance
	public ChefModel() {
		chefMenu = new Menu();
	}
	
	public void addMeal(Meal newMeal) {
		this.chefMenu.addMeal(newMeal);
	}
	
	public ArrayList<Meal> getMenuList(){
		//TODO scope 
		return chefMenu.listMeal;
	}
}
