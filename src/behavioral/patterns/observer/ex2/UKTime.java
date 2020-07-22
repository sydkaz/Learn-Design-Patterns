package behavioral.patterns.observer.ex2;

public class UKTime extends Observer {
    UKTime(Subject s){
        super(s);
        timeOffsetFormUTC = 0;
    }

    @Override
    void printTime(int timeOffsetFormUTC) {
        System.out.println("The UK time is  "+s.getLocalDateTime().plusHours(timeOffsetFormUTC).format(format));
    }
}
