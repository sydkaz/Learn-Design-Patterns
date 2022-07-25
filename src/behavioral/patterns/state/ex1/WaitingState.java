package behavioral.patterns.state.ex1;

/* Each state object supports all methods from State interface, but each state object will handle those methods in a different way */
public class WaitingState implements State {
	AutomatInterface automat;

	public WaitingState(AutomatInterface a) {
		automat = a;
	}

	public String gotApplication() {
		automat.setState(automat.getGotApplicationState());
		return "Thanks for the application.";
	}

	public String checkApplication() {
		return "You have to submit an application.";
	}

	public String rentApartment() {
		return "You have to submit an application.";
	}

	public String dispenseKeys() {
		return "You have to submit an application.";
	}
}