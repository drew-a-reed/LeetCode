/*You are given a large integer represented as an integer array digits,
        where each digits[i] is the ith digit of the integer. The digits
        are ordered from most significant to least significant in left-to-right
        order. The large integer does not contain any leading 0's.

        Increment the large integer by one and return the resulting array of digits.*/

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        String[] no9ReturnArray = null;
        int numberConverted = 0;

        String[] digitsStringArray = new String[digits.length];

        for (int i = 0; i < digits.length; i++) {
            digitsStringArray[i] = String.valueOf(digits[i]);
        }
        String digitString = String.join("", digitsStringArray);

        numberConverted = Integer.parseInt(digitString);
        numberConverted += 1;
        String numberString = String.valueOf(numberConverted);
        no9ReturnArray = numberString.split("");
        return Arrays.stream(no9ReturnArray).mapToInt((Integer::parseInt)).toArray();
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9,8,7,6,5,4,3,2,1,0};

        System.out.println(Arrays.toString(plusOne(digits)));
    }

}
