package strategy.ex2;
/**
 * Concrete strategy class representing a particular algorithm.
 */
public class ConsoleLogging implements Logging {

	@Override
	public void write(String message) {
		System.out.println(message); 
	}

}
