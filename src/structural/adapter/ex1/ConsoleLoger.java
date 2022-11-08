package structural.adapter.ex1;

public class ConsoleLoger implements Printer{
    @Override
    public void printData(String data) {
        System.out.println("ConsoleLoger :"+data );
    }
}
