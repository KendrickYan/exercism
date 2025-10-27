public class CarsAssemble {

    private final int BASE_PRODUCTION_RATE = 221; // cars per hour

    public double productionRatePerHour(int speed) {
        int rate = speed * BASE_PRODUCTION_RATE;

        if (1 <= speed && speed <= 4) {
            return rate;
        } else if (5 <= speed && speed <= 8) {
            return rate * 0.9;
        } else if (speed == 9) {
            return rate * 0.8;
        } else if (speed == 10) {
            return rate * 0.77;
        }

        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
