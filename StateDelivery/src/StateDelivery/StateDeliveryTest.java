
package StateDelivery;

public class StateDeliveryTest {
	
	public static void main(String[] args) {
	StateDelivery stateDelivery = new StateDelivery(5);
	stateDelivery.foodOrdered();
	stateDelivery.deliverFood();	
	
	stateDelivery = new StateDelivery(0);
	stateDelivery.foodOrdered();
	stateDelivery.deliverFood();
	} 	
}
