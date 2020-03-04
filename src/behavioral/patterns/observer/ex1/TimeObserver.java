package ex1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeObserver implements Observer {
    Subject subject;
    DateTimeFormatter format =
            DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");

    TimeObserver(Subject subject){
        this.subject = subject;
        subject.register(this);
    }


    @Override
    public void update(int australia, int usa, int uk, LocalDateTime localDateTime) {
        System.out.print(" The UTC time is  "+localDateTime.format(format));
        System.out.print(" Time in australia "+australia+" "+localDateTime.plusHours(australia).format(format));
        System.out.print(" Time in america "+usa+" "+localDateTime.plusHours(usa).format(format));
        System.out.print(" Time in uk "+uk+" "+localDateTime.plusHours(uk).format(format)+"\n");
    }
}
