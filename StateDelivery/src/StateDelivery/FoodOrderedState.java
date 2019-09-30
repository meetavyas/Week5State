package StateDelivery;

public class FoodOrderedState implements State {
	
	StateDelivery stateDelivery;
	
	public FoodOrderedState(StateDelivery stateDelivery) {
		this.stateDelivery = stateDelivery;
	}


	public void foodOrdered() {
		System.out.println("Food Ordered");
		stateDelivery.setState(stateDelivery.getFoodOrderedState());
	}

	public void deliverFood() {		
	  System.out.println("Food will be delivered soon...");
	}

}
