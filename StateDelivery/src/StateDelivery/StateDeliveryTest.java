
package StateDelivery;

public class StateDeliveryTest {
	
	public static void main(String[] args) {
		StateDelivery stateDelivery = new StateDelivery(3);
		stateDelivery.determineIfRestaurantWillDeliver();
		
		stateDelivery = new StateDelivery(8);
		stateDelivery.determineIfRestaurantWillDeliver();
		
		stateDelivery = new StateDelivery(0);
		stateDelivery.determineIfRestaurantWillDeliver();
		
		stateDelivery = new StateDelivery(5);
		stateDelivery.determineIfRestaurantWillDeliver();
	}
	
}

