package com.aps.leetcode.p167;

import java.util.stream.IntStream;

/**
 *
 */
public class TwoSumIIProblem {

    // Time Complexity O(n²), Space complexity O(1)
    public static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int i1 = 0;
            int i2 = numbers.length - 1;

            while (true) {
                int sum = numbers[i1] + numbers[i2];

                if (sum < target) {
                    i1++;
                }
                if (sum > target) {
                    i2--;
                }
                if (sum == target) {
                    return new int[] {i1 + 1, i2 + 1};
                }
            }
        }
    }
}
