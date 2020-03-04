package structural.patterns.decorator.ex1;

public class Ram extends Director {

    Ram(Component c) {
        super(c);
    }

    @Override
    public double price() {
        return super.price()+6;
    }

    @Override
    public String description() {
        return super.description()+", with Ram " ;
    }
}
