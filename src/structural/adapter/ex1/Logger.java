package structural.adapter.ex1;

public class Logger {
    private Printer printer;

    public Logger(Printer printer) {
        this.printer = printer;
    }
    public void printData(String data){
        this.printer.printData(data);
    }
}
