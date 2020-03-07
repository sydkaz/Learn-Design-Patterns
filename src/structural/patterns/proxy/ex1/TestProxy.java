package structural.patterns.proxy.ex1;

/* This example is an extension of State pattern example, where now our client and automat are separately located, and we use the proxy pattern
 * to fix this by creating a proxy object that stands in for the automat object and looks to client just like as its interacting with automat directly.
 * THe proxy object behind the scene can communicate with the remote automat code through an automat server.
 * 
 * According to GOF proxy provides a surrogate or placeholder for another object to control access to it.
 */
public class TestProxy {
	public static void main(String args[]) {

		AutomatProxy automatProxy = new AutomatProxy();

		automatProxy.gotApplication();
		automatProxy.checkApplication();
		automatProxy.rentApartment();
	}
}