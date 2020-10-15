package parrot;

public class NorwegianBlueParrot extends Parrot {

    public static final double MAX_SPEED = 24.0;
    public static final double NAILED_SPEED = 0;
    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return isNailed ? NAILED_SPEED : getSpeed(voltage);
    }

    private double getSpeed(double voltage) {
        double overdrive = voltage * getBaseSpeed();
        return Math.min(MAX_SPEED, overdrive);
    }

}
