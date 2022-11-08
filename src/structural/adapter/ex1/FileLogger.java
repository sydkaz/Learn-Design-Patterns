package structural.adapter.ex1;

public class FileLogger implements Printer {
    @Override
    public void printData(String data) {
        System.out.println("FileLogger:  "+data);
    }
}
