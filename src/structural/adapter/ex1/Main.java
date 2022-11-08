package structural.adapter.ex1;

public class Main {
    public static void main(String[] args){
        Logger logger = new Logger(new FileLogger());
        logger.printData("Some test data");

        logger = new Logger(new ConsoleLoger());
        logger.printData("Some test data");
    }
}
