package  behavioral.patterns.observer.ex3;

public class UKTime extends Observer {
    UKTime(){
        timeOffsetFormUTC = 0;
    }

    @Override
    void printTime(int timeOffsetFormUTC) {
        System.out.println("The UK time is  "+s.getLocalDateTime().plusHours(timeOffsetFormUTC).format(format));
    }
}
