
package StateDelivery;

public class StateDelivery {
	
	final static int zipCode0 = 0;
	final static int zipCode5 = 5;
	final static int zipNo = 6;
	int state = zipCode0;
	int distance = 0;
	
	public StateDelivery(int distance) {
		this.distance = distance;
		if (distance == zipCode0) {
			state = zipCode0;
		} else if (distance > zipCode0 && distance < zipNo) {
			state = zipCode5;
		} else if (distance > zipCode5) {
			state = zipNo;
		}
	}
	
	public void determineIfRestaurantWillDeliver() {
		if (state == zipCode0) {
			System.out.println("Will deliver, the recipients are " + distance + " miles away from restaurant");
		} else if (state == zipCode5) {
			System.out.println("Will deliver, the recipients are " + distance + " miles away from restaurant");
		} else if (state == zipNo) {
			System.out.println("Will not deliver, the recipients are " + distance + " miles away from restaurant");
		}
	}

}
