package structural.patterns.bridge.ex1;

public class RedCircle implements DrawAPI{

    @Override
    public void draw(int x, int y) {
        System.out.printf("Drawing red circle wit x:%d y:%d \n",x,y);
    }
}
