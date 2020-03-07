package behavioral.patterns.state.ex1;

import java.util.Random;

/* Each state object supports all methods from State interface, but each state object will handle those methods in a different way */
public class GotApplicationState implements State {
	AutomatInterface automat;
	Random random;

	public GotApplicationState(AutomatInterface a) {
		automat = a;
		random = new Random(System.currentTimeMillis());
	}

	public String gotApplication() {
		return "We already got your application.";
	}

	public String checkApplication() {
		int yesno = random.nextInt() % 10;

		if (yesno > 4 && automat.getCount() > 0) {
			automat.setState(automat.getApartmentRentedState());
			return "Congratulations, you were approved.";
		} else {
			automat.setState(automat.getWaitingState());
			return "Sorry, you were not approved.";
		}
	}

	public String rentApartment() {
		return "You must have your application checked.";
	}

	public String dispenseKeys() {
		return "You must have your application checked.";
	}
}