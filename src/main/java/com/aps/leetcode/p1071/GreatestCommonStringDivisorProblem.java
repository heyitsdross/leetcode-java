package com.aps.leetcode.p1071;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class GreatestCommonStringDivisorProblem {

    static class Solution {
        public String gcdOfStrings(String str1, String str2) {

            var validDivisiors = new HashMap<String, Integer>();

            for (String s : List.of(str1, str2)) {

                for (int j = 0; j < s.length(); j++) {
                    if (s.length() % (j + 1) != 0) {

                        // Not a divisor; pattern doesn't fit exactly n times into s.
                        continue;
                    }

                    String divisor = s.substring(0, j + 1);

                    if (Stream.of(s.split(divisor)).allMatch(divisor::equals)) {
                        Optional.ofNullable(validDivisiors.get(divisor))
                                .ifPresentOrElse((value) -> validDivisiors.put(divisor, value + 1),
                                        () -> validDivisiors.put(divisor, 1));
                    }
                }
            }

            return validDivisiors.entrySet().stream()
                                 .filter(e -> e.getValue() == 2)
                                 .max(Comparator.comparingInt(e -> e.getKey().length()))
                                 .map(Map.Entry::getKey)
                                 .orElse("");
        }
    }
}
