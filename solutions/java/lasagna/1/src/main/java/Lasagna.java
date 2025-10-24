public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40; //min
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int time_inside) {
        return 40 - time_inside; //min
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers * 2; // 2min per layer
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int time_inside) {
        return layers * 2 + time_inside; //min
    }
}
