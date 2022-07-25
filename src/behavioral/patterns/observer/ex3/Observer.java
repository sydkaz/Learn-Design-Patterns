package  behavioral.patterns.observer.ex3;

import java.time.format.DateTimeFormatter;

abstract class Observer {
    Subject s;
    int timeOffsetFormUTC ;
    DateTimeFormatter format =
            DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
    abstract void printTime(int timeOffsetFormUTC);
    void update(Subject s){
        this.s = s;
        printTime(timeOffsetFormUTC);
    }
    /*protected Observer(Subject s){
        s.attach(this);

    }*/
}
