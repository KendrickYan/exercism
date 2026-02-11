class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int numberToCheckCopy = numberToCheck;
        int numOfDigits = Integer.toString(numberToCheck).length();
        int sum = 0;
        for (int i = 0; i < numOfDigits; i++) {
            int digit = numberToCheckCopy % 10;
            numberToCheckCopy /= 10; // removes last digit
            sum += (int) Math.pow(digit, numOfDigits);
        }
        return numberToCheck == sum;
    }

}
