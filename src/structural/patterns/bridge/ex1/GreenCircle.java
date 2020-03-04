package structural.patterns.bridge.ex1;

public class GreenCircle implements DrawAPI{

    @Override
    public void draw(int x, int y) {
        System.out.printf("Drawing Green circle wit x:%d y:%d \n",x,y);
    }
}
