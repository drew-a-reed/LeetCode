/*You are given an integer array nums where the largest integer is unique.

        Determine whether the largest element in the array is at least twice
        as much as every other number in the array. If it is, return the index
        of the largest element, or return -1 otherwise.*/

import java.util.Arrays;

public class LargestNumberAtLeastTwiceOfOthers {

    public static int dominantIndex(int[] nums) {

        int answer = 0;

        if (nums.length < 2) {
            answer = 0;
        } else {
            var indexOfBiggest = 0;
            var biggestNumber = 0;
            var secondBiggest = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > biggestNumber) {
                    biggestNumber = nums[i];
                    indexOfBiggest = i;
                }
            }

            for (int num : nums) {
                if (num != biggestNumber) {
                    if (num > secondBiggest) {
                        secondBiggest = num;
                    }
                }
            }
            if (((double) biggestNumber / 2) >= (double) secondBiggest) {
                answer = indexOfBiggest;
            } else {
                answer = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] testarray = new int[] {1,0};
        System.out.println(dominantIndex(testarray));
    }
}
