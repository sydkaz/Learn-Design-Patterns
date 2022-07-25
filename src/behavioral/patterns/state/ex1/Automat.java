package behavioral.patterns.state.ex1;

public class Automat implements AutomatInterface {
	/* State objects for use of the internal state field */
	private State waitingState;
	private State gotApplicationState;
	private State apartmentRentedState;
	private State fullyRentedState;
	private State state; // The current state of the Automat
	private int count;

	public Automat(int n) {
		count = n;
		waitingState = new WaitingState(this);
		gotApplicationState = new GotApplicationState(this);
		apartmentRentedState = new ApartmentRentedState(this);
		waitingState = new WaitingState(this);
		state = waitingState;
	}

	/*
	 * Method will be delegated to the particular runtime type of state object
	 */
	@Override
	public void gotApplication() {
		System.out.println(state.gotApplication());
	}

	/*
	 * Method will be delegated to the particular runtime type of state object
	 */
	@Override
	public void checkApplication() {
		System.out.println(state.checkApplication());
	}

	/*
	 * Method will be delegated to the particular runtime type of state object
	 */
	@Override
	public void rentApartment() {
		System.out.println(state.rentApartment());
		System.out.println(state.dispenseKeys());
	}

	/* Method used to get the desired state object */
	@Override
	public State getWaitingState() {
		return waitingState;
	}

	/* Method used to get the desired state object */
	@Override
	public State getGotApplicationState() {
		return gotApplicationState;
	}

	/* Method used to get the desired state object */
	@Override
	public State getApartmentRentedState() {
		return apartmentRentedState;
	}

	/* Method used to get the desired state object */
	@Override
	public State getFullyRentedState() {
		return fullyRentedState;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void setCount(int n) {
		count = n;
	}

	/*
	 * Method used to change the current state object of the Automat to the new
	 * desired state
	 */
	@Override
	public void setState(State s) {
		state = s;
	}
}
