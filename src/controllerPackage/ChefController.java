package controllerPackage;
import viewPackage.*;

import java.util.ArrayList;

import modelPackage.*;

public class ChefController {
	private ChefView chefView;
	private ChefModel chefModel;
	
	public ChefController() {
		
	}
	
	public ChefController(ChefModel model, ChefView view) {
		this.chefView = view;
		this.chefModel = model;
	}
	
	public void addMeal(Meal m1) {
		this.chefModel.addMeal(m1);
	}
	
	public ArrayList<Meal> getMenu(){
		return chefModel.getMenuList();
	}
	
	public void setView(ChefView v) {
		this.chefView = v;
	}
	
	public void setModel(ChefModel m) {
		this.chefModel = m;
	}
}
