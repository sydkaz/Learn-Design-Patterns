package structural.adapter.ex2;

public class CarSpeedAdapterImpl implements CarSpeedAdapter {
    Speed carSpeed;

    public CarSpeedAdapterImpl(Speed carSpeed) {
        this.carSpeed = carSpeed;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(this.carSpeed.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
