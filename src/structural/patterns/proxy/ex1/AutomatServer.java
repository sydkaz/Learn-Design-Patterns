package structural.patterns.proxy.ex1;

import behavioral.patterns.state.ex1.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/* A stand alone server for automat, which is running separately on the net */
public class AutomatServer implements Runnable, AutomatInterface {
	State waitingState;
	State gotApplicationState;
	State apartmentRentedState;
	State fullyRentedState;
	State state;
	int count;
	private Thread thread;
	ServerSocket socket;
	PrintWriter out;
	Socket communicationSocket;

	public static void main(String args[]) {
		 new AutomatServer();
	}

	public AutomatServer() {
		count = 9;
		waitingState = new WaitingState(this);
		gotApplicationState = new GotApplicationState(this);
		apartmentRentedState = new ApartmentRentedState(this);
		waitingState = new WaitingState(this);
		state = waitingState;

		try {
			socket = new ServerSocket(8765);

			communicationSocket = socket.accept();

			out = new PrintWriter(communicationSocket.getOutputStream(), true);

			thread = new Thread(this);
			thread.start();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void gotApplication() {
		out.println(state.gotApplication());
	}

	public void checkApplication() {
		out.println(state.checkApplication());
	}

	public void rentApartment() {
		out.println(state.rentApartment());
		out.println(state.dispenseKeys());
	}

	public State getWaitingState() {
		return waitingState;
	}

	public State getGotApplicationState() {
		return gotApplicationState;
	}

	public State getApartmentRentedState() {
		return apartmentRentedState;
	}

	public State getFullyRentedState() {
		return fullyRentedState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int n) {
		count = n;
	}

	public void setState(State s) {
		state = s;
	}

	public void run() {
		String incomingString;
		try {

			BufferedReader in = new BufferedReader(new InputStreamReader(communicationSocket.getInputStream()));
			while ((incomingString = in.readLine()) != null) {
				if (incomingString.equals("gotApplication")) {
					gotApplication();
				} else if (incomingString.equals("checkApplication")) {
					checkApplication();
				} else if (incomingString.equals("rentApartment")) {
					rentApartment();
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
