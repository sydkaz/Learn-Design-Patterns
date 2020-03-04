package structural.patterns.decorator.ex1;

abstract class Director  implements  Component{
    Component c;
    Director(Component c){
       this.c = c;
    }

    @Override
    public double price() {
        return c.price();
    }

    @Override
    public String description() {
        return c.description();
    }
}
