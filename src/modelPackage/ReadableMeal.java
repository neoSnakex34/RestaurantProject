package modelPackage;

import java.util.ArrayList;

public class ReadableMeal{
	protected String name;
	protected double price;
	protected ArrayList<String> ingredients;

	public ReadableMeal(String name, double price, ArrayList<String> ings) {
		this.name = name;
		this.price = price;
		this.ingredients = ings;
	}
	
	
	public String getName(){
		return this.name;
	}
	
	public double getPrice(){
		return this.price;
	}

	public ArrayList<String> getIngs(){
		return this.ingredients;
	}

}


