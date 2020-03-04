package structural.patterns.bridge.ex1;

abstract class Shape {
    DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    abstract void drawShape();
}
