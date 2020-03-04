package ex2;

public class USATime extends Observer {
    USATime(Subject s){
        super(s);
        timeOffsetFormUTC = -5;
    }

    @Override
    void printTime(int timeOffsetFormUTC) {
        System.out.println("The USA time is  "+s.getLocalDateTime().plusHours(timeOffsetFormUTC).format(format));
    }
}
