package com.aps.leetcode.p1749;

import java.util.Arrays;

public class MaxAbsoluteSubarraySumProblem {

    static int subArrayMinimum = 0;
    static int subArrayMaximum = 0;

    public static class Solution {
        public int maxAbsoluteSum(int[] nums) {

            if (nums.length == 1) {
                return Math.abs(nums[0]);
            }

            // TODO potentially abs here?
            var singleElementSum =
                    Math.abs(nums[nums.length - 1]);

            int sum =
                    nums[nums.length - 1]
                            + maxAbsoluteSum(
                            Arrays.copyOfRange(nums, 0, nums.length - 1));

            if (sum > subArrayMaximum) {
                subArrayMaximum = sum;
            }

            if (sum < subArrayMinimum) {
                subArrayMinimum = sum;
            }

            // [-3, 2, -5]
            // TODO local_maximum[i] = max(nums[i], local_maximum[i-1]
            return Math.max(
                    singleElementSum,
                    subArrayMaximum
            );
        }
    }
}
