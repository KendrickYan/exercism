import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(this.birdsPerDay) // convert array into a stream of int
                .anyMatch(day -> day == 0); // consumes array and returns bool for given predicate
    }

    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(this.birdsPerDay, 0, Math.min(numberOfDays, this.birdsPerDay.length)) // converts just a slice of the array
                .sum();
    }

    public int getBusyDays() {
        return (int) Arrays.stream(this.birdsPerDay)
                .filter(day -> day >=5)
                .count();
    }
}
