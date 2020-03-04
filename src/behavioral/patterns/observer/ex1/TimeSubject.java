package ex1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class TimeSubject implements Subject {
    List<Observer> observers;
    int australia;
    int america;
    int uk;
    LocalDateTime localDateTime;
    TimeSubject(){
        observers = new ArrayList<Observer>();
        localDateTime =  LocalDateTime.now(ZoneId.of("UTC"));
    }

    public TimeSubject(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void deregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o: observers) {
            o.update(australia,america,uk,localDateTime);
        }
    }

    public void setAustralia(int australia) {
        this.australia = australia;
        notifyAllObservers();
    }

    public void setAmerica(int america) {
        this.america = america;
        notifyAllObservers();
    }

    public void setUk(int uk) {
        this.uk = uk;
        notifyAllObservers();
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
        notifyAllObservers();
    }
}
