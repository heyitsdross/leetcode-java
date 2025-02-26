package com.aps.leetcode.p1768;

public class AlternateStringMergeProblem {

    static class Solution {

        public String mergeAlternately(String word1, String word2) {
            // Requirements:
            // 1. word1 and word2 to be merged in alternating order
            //    First char in word1 goes first, then same in word2, then 2nd in word1, and and and...
            // 2. If one is longer than the other, the remaining letters get appended as-is.
            // 3. Return the merged string.

            // Input constraints:
            // All inputs non-null, non-empty.
            // Only lowercase english letters
            // Each input between 1 and 100 chars long

            // Naive solution: Create char array to store result? O(n) space usage

            int maxLength = Math.max(word1.length(), word2.length());

            var builder = new StringBuilder();

            for (int i = 0; i < maxLength; i++) {
                if (i < word1.length()) {
                    builder.append(word1.charAt(i));
                }
                if (i < word2.length()) {
                    builder.append(word2.charAt(i));
                }
            }
            return builder.toString();
        }
    }
}
