package behavioral.patterns.state.ex1;

/* Each state object supports all methods from State interface, but each state object will handle those methods in a different way */
public class ApartmentRentedState implements State {
	AutomatInterface automat;

	public ApartmentRentedState(AutomatInterface a) {
		automat = a;
	}

	public String gotApplication() {
		return "Hang on, we're renting you an apartment.";
	}

	public String checkApplication() {
		return "Hang on, we're renting you an apartment.";
	}

	public String rentApartment() {
		automat.setCount(automat.getCount() - 1);
		return "Renting you an apartment....";
	}

	public String dispenseKeys() {
		if (automat.getCount() <= 0) {
			automat.setState(automat.getFullyRentedState());
		} else {
			automat.setState(automat.getWaitingState());
		}
		return "Here are your keys!";
	}
}