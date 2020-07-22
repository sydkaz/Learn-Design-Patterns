package behavioral.patterns.observer.ex2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> countries;
    LocalDateTime localDateTime;

    Subject(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    Subject(){
        countries = new ArrayList<Observer>();
        localDateTime =  LocalDateTime.now(ZoneId.of("UTC"));
    }
    void attach(Observer o){
        countries.add(o);
    }
    void remove(Observer o){
        countries.remove(o);
    }
    void notifyAllObservers(){
        for (Observer o:countries) {
            o.update();
        }
    }
    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
        notifyAllObservers();
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
