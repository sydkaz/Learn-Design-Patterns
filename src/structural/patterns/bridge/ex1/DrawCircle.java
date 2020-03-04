package structural.patterns.bridge.ex1;

public class DrawCircle extends Shape {
    int x;
    int y;
    public DrawCircle(int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    @Override
    void drawShape() {
     super.drawAPI.draw(x,y);
    }
}
