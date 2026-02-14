package ba_ArmstrongNumbers;

public class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numberStr = Integer.toString(numberToCheck);
        int sum = 0;

        for (int i=0; i<numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            sum += Math.pow(digit, numberStr.length());
        }
        if (sum == numberToCheck)
            return true;
        return false;
    }

}