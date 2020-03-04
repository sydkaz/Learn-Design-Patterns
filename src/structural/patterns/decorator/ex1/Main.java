package structural.patterns.decorator.ex1;

public class Main {
    public static void main(String[] args){
        Component c =new CDRom(new Ram(new Harddrive(new Barebone())));
        System.out.println(c.description());
        System.out.println(c.price());

    }
}
