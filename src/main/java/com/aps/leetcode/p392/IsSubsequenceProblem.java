package com.aps.leetcode.p392;

public class IsSubsequenceProblem {

    public static class Solution {
        /**
         * @param s substring to check for
         * @param t input string, which needs to be checked for the substring
         * @return if s is a subsequence of t
         */
        public boolean isSubsequence(String s, String t) {

            if (t.isEmpty() && !s.isEmpty()) {
                return false;
            }

            if (s.isEmpty()) {
                return true;
            }

            int sIndex = 0;
            int tIndex = 0;

            while (tIndex < t.length()) {

                if (t.charAt(tIndex) == s.charAt(sIndex)) {
                    if (sIndex == s.length() - 1) {
                        return true;
                    }
                    sIndex++;
                }
                tIndex++;
            }

            return false;

            // Thoughtcode
            // iterate over t until first char in s is found,
            // then increment s and continue incrementing
            // check s[0] and t[0]

            // end case: if we reach end of t before end of s, return false

        }
    }
}
