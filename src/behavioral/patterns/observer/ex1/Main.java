package ex1;

import java.time.*;

public class Main {

    public static void main(String[] args) {
    TimeSubject timeSubject = new TimeSubject();
	Observer observer = new TimeObserver(timeSubject);
	timeSubject.setAustralia(11);
    timeSubject.setAmerica(-5);
    timeSubject.setUk(0);



    LocalDateTime  currentTime = LocalDateTime.now(ZoneId.of("UTC"));
    LocalDateTime futureTIme = currentTime.plusHours(24);
    System.out.println("After 24 Hours");
    timeSubject.setLocalDateTime(futureTIme);

    }
}
