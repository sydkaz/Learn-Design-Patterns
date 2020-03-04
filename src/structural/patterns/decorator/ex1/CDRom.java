package structural.patterns.decorator.ex1;

public class CDRom extends Director {

    CDRom(Component c) {
        super(c);
    }

    @Override
    public double price() {
        return super.price()+5;
    }

    @Override
    public String description() {
        return super.description()+", with CDRom " ;
    }
}
