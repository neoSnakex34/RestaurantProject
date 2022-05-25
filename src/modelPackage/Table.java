package modelPackage;

import java.util.ArrayList;

public class Table {
	private Restaurant restaurant;
	
	
	//COMANDA 
	private ArrayList<Meal> tableOrders;  
	
	
	public Table(Restaurant r) {
		this.restaurant = r;
	}
	
	public double closeTableOrder() {
		this.restaurant.addOldOrder(tableOrders);
		
		double total = 0;
		for (Meal m:tableOrders) {
			total += m.getPrice();
		}
		
		this.tableOrders = new ArrayList<Meal>();
		
		return total;
	}
	
	public void addMealFromTable(Meal mealToAdd) {
		tableOrders.add(mealToAdd);
	}
	
	
	//TODO check this
	public void removeMealFromTable(int indexToRemove) {
		tableOrders.remove(indexToRemove);
	}
	
}
