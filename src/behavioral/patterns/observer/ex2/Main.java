package behavioral.patterns.observer.ex2;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args){
    Subject s= new Subject();
    Observer auTime = new AUTime(s);
    Observer ukTime = new UKTime(s);
    Observer usTime = new USATime(s);


    /*s.attach(auTime);
    s.attach(ukTime);
    s.attach(usTime);*/


    LocalDateTime currentTime = LocalDateTime.now(ZoneId.of("UTC"));
    s.setLocalDateTime(currentTime);

    LocalDateTime futureTIme = currentTime.plusHours(24);
    System.out.println("After 24 Hours");
    s.setLocalDateTime(futureTIme);

    }
}
