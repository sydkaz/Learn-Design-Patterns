package ex2;

public class AUTime extends Observer {
    AUTime(Subject s){
        super(s);
        timeOffsetFormUTC = 11;
    }


    @Override
    void printTime(int timeOffsetFormUTC) {
        System.out.println("The AU time is  "+s.getLocalDateTime().plusHours(timeOffsetFormUTC).format(format));
    }
}
