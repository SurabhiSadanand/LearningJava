package classMethodAmusementPark;

public class AmusementPark {

	String parkName = "Wonderland";

	boolean isEligibleToRide(int height, int weight) {
		if ((height < 90 || height > 200) || (weight < 15 || weight > 95)) {
			return false;
		} else {
			return true;
		}

	}
}
