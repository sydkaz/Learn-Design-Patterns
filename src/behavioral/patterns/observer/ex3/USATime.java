package ex3;

public class USATime extends Observer {
    USATime(){
        timeOffsetFormUTC = -5;
    }

    @Override
    void printTime(int timeOffsetFormUTC) {
        System.out.println("The USA time is  "+s.getLocalDateTime().plusHours(timeOffsetFormUTC).format(format));
    }
}
