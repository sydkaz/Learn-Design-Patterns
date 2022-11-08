package structural.adapter.ex2;

public class Main {
    public static void main(String[] args){
        Speed speed = new CarSpeed();
        System.out.println(speed.getSpeed());

        CarSpeedAdapter  carSpeedAdapter = new CarSpeedAdapterImpl(speed);
        System.out.println(carSpeedAdapter.getSpeed());

    }
}
