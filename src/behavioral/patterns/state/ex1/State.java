package behavioral.patterns.state.ex1;


/* Instead of giving each state its own constant, we give each its own class. That way, we can call methods on a state object anywhere in the code */
public interface State {
	public String gotApplication();

	public String checkApplication();

	public String rentApartment();

	public String dispenseKeys();
}