package structural.patterns.decorator.ex1;

public class Barebone implements Component {
    
    @Override
    public double price() {
        return 10;
    }

    @Override
    public String description() {
        return "Barebone PC";
    }
}
