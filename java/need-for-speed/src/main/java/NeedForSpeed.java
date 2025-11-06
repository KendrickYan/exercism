class NeedForSpeed {

    private int distance;
    private int battery;
    private final int speed;
    private final int batteryDrain;

    NeedForSpeed(int speed, int batteryDrain) {
        this.distance = 0;
        this.battery = 100;
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (batteryDrained()) return;

        battery -= batteryDrain;
        distance += speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed() { return speed; }
    public int getBatteryDrain() { return batteryDrain; }
}

class RaceTrack {

    private final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return (100 / car.getBatteryDrain()) * car.getSpeed() >= distance;
    }
}
