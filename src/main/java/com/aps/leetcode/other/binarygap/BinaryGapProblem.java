package com.aps.leetcode.other.binarygap;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BinaryGapProblem {

    static class Solution {

        static final byte ZERO = 48;
        static final byte ONE = 49;

        public int solution(int n) {

            // Small values and 2^n and (2^n)-1 have no gaps.
            if ((n <= 4) || is2ToTheN(n) || is2ToTheN(n + 1)) {
                return 0;
            }

            int maxGapSize = 0;
            byte[] binaryInput = Integer.toBinaryString(n).getBytes();

            int currentGapSize = 0;

            for (byte current : binaryInput) {
                if (current == ONE) {

                    maxGapSize = Math.max(maxGapSize, currentGapSize);
                    currentGapSize = 0;
                }
                if (current == ZERO) {
                    currentGapSize++;
                }
            }

            return maxGapSize;
        }

        public static boolean is2ToTheN(int n) {
            return (Math.log(n) / Math.log(2.0)) % 1 == 0;
        }
    }
}
