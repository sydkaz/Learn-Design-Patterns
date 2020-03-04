package structural.patterns.bridge.ex1;

public class Main {
    public static void main(String[] args){
        Shape[] shapes = new Shape[] {
                new DrawCircle(2,3, new RedCircle()),new DrawCircle(2,3, new GreenCircle()),
        };

        for (Shape shape: shapes) {
            shape.drawShape();
        }
    }
}
