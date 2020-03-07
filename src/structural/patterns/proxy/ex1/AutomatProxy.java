package structural.patterns.proxy.ex1;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

/* Proxy object which client uses to interact with the server*/
public class AutomatProxy implements Runnable {
	private Thread thread;
	Socket socket;
	InputStream in;
	PrintWriter out;
	int character;

	public AutomatProxy() {
		try {
			socket = new Socket("127.0.0.1", 8765);
			System.out.println("Connecting....");

			in = socket.getInputStream();
			out = new PrintWriter(socket.getOutputStream(), true);

			thread = new Thread(this);
			thread.start();
		} catch (IOException ioe) {
			System.err.println("The server must be running.");
			System.err.println("Not connected");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		if (socket != null && socket.isConnected()) {
			System.out.println("Connected");
		}
	}

	public void gotApplication() {
		out.println("gotApplication");
	}

	public void checkApplication() {
		out.println("checkApplication");
	}

	public void rentApartment() {
		out.println("rentApartment");
	}

	public void run() {
		try {
			while ((character = in.read()) != -1) {
				System.out.print((char) character);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
