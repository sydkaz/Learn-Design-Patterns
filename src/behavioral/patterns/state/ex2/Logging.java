package strategy.ex2;

/**
 * This Strategy interface is implemented by all concrete objects representing an
 * algorithm(strategy), which lets us define a family of algorithms.
 */
public interface Logging {
	void write(String message);
}