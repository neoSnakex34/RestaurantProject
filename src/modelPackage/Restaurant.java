package modelPackage;

import java.util.ArrayList;

public class Restaurant {
	
	private ArrayList<Table> tables;
	//private HashMap<, V>
	
	/**
	 * list of lists 
	 * each list is a finished tableOrder
	 * to get the history of orders of each 
	 * working day 
	 * 
	 */
	private ArrayList< ArrayList<Meal> > oldOrders;
	
	public void addOldOrder(ArrayList<Meal> orderToAdd) {
		this.oldOrders.add(orderToAdd);
	}
	
	public void closeTable(Table t) {
		//TODO manage return type
		t.closeTableOrder();
	}
	
}
