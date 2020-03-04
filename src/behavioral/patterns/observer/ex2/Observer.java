package ex2;

import java.time.format.DateTimeFormatter;

abstract class Observer {
    Subject s;
    int timeOffsetFormUTC ;
    DateTimeFormatter format =
            DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
    abstract void printTime(int timeOffsetFormUTC);
    void update(){
        printTime(timeOffsetFormUTC);
    }
    protected Observer(Subject s){
        s.attach(this);
        this.s = s;
    }
}
