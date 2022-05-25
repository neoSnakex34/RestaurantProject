package modelPackage;

import java.util.ArrayList;

public class Meal extends ReadableMeal {
	
	//superclass - 
	public Meal(String name, double price) {
		super(name, price, null);
	}
	
	public Meal(String name, double price, ArrayList<String> ings) {
		super(name, price, ings);
		// TODO Auto-generated constructor 
	}
	
	//TODO change scope 
	public void setName(String name) {
		this.name = name; 
		//TODO ^^
		// NOTE -> this or super?
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setIngs(ArrayList<String> ings) {
		this.ingredients = ings;
	}
	
	
	
}
