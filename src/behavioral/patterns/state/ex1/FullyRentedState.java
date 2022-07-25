package behavioral.patterns.state.ex1;

/* Each state object supports all methods from State interface, but each state object will handle those methods in a different way */
public class FullyRentedState implements State {
	AutomatInterface automat;

	public FullyRentedState(AutomatInterface a) {
		automat = a;
	}

	public String gotApplication() {
		return "Sorry, we're fully rented.";
	}

	public String checkApplication() {
		return "Sorry, we're fully rented.";
	}

	public String rentApartment() {
		return "Sorry, we're fully rented.";
	}

	public String dispenseKeys() {
		return "Sorry, we're fully rented.";
	}
}