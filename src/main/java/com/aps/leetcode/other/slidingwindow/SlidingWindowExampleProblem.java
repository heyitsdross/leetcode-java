package com.aps.leetcode.other.slidingwindow;

public class SlidingWindowExampleProblem {

    static class Solution {
        public double findMaxAverage(int[] nums, int k) {

            if (nums.length == 1) {
                return nums[0];
            }

            double maxValue;
            double currentValue = 0.0;

            // initial loop to add first k array elements together
            for (int i = 0; i < k; i++) {
                currentValue += nums[i];
            }
            maxValue = currentValue;

            // second loop to handle sliding and deltas

            int index1 = 1;
            int index2 = k + 1;

            while (index2 <= nums.length) {
                currentValue -= nums[index1 - 1];
                currentValue += nums[index2 - 1];

                if (currentValue > maxValue) {
                    maxValue = currentValue;
                }

                index1++;
                index2++;
            }
            return maxValue / k;
        }
    }
}
