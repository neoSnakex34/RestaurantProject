import modelPackage.*;
import viewPackage.*;
import controllerPackage.*;

public class App {
	public static void main(String[] args) {
		//try to retrieve info from disk 
		
		
		ChefModel chefModel = new ChefModel();
		
		ChefController chefController = new ChefController();
		ChefView chefView = new ChefView(chefController);
		chefController.setModel(chefModel);
		chefController.setView(chefView);
		
		FirstFrameToTest frame = new FirstFrameToTest(chefView);
		frame.setVisible(true);
	}
}
