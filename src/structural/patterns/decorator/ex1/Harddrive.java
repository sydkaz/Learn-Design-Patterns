package structural.patterns.decorator.ex1;

public class Harddrive extends Director {

    Harddrive(Component c) {
        super(c);
    }

    @Override
    public double price() {
        return super.price()+2;
    }

    @Override
    public String description() {
        return super.description()+", with Harddrive " ;
    }
}
