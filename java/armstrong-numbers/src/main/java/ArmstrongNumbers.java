class ArmstrongNumbers {

    private int countDigitsIn(int a) {
        int count = 0;
        while (a > 0) {
            a /= 10; // removes last digit
            count += 1;
        }
        return count;
    }

    boolean isArmstrongNumber(int numberToCheck) {
        int numberToCheckCopy = numberToCheck;
        int numOfDigits = countDigitsIn(numberToCheck);
        double sum = 0;
        for (int i = 0; i < numOfDigits; i++) {
            int digit = numberToCheckCopy % 10;
            numberToCheckCopy /= 10; // removes last digit
            sum += Math.pow(digit, numOfDigits);

        }
        return numberToCheck == sum;
    }

}
