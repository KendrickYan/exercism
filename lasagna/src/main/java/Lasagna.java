public class Lasagna {

    // !Use constants instead of magic numbers
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_MIN_PER_LAYER = 2;

    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN; //min
    }

    public int remainingMinutesInOven(int time_inside) {
        return expectedMinutesInOven() - time_inside; //min
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * PREPARATION_MIN_PER_LAYER; // 2min per layer
    }

    public int totalTimeInMinutes(int layers, int time_inside) {
        return preparationTimeInMinutes(layers) + time_inside; //min
    }
}
