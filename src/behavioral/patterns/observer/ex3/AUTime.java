package ex3;

public class AUTime extends Observer {
    AUTime(){
        timeOffsetFormUTC = 11;
    }


    @Override
    void printTime(int timeOffsetFormUTC) {
        System.out.println("The AU time is  "+s.getLocalDateTime().plusHours(timeOffsetFormUTC).format(format));
    }
}
