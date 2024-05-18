public class ArmstrongNumbersJava {
    public static boolean isArmstrongNumber(int numberToCheck) {
        String numberStr = Integer.toString(numberToCheck);
        int numberOfDigits = numberStr.length();
        int sum = 0;
        int temp = numberToCheck;

        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        return sum == numberToCheck;
    }
}
