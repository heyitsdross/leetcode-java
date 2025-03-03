package com.aps.leetcode.p1071;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatestCommonStringDivisorProblemTest {

    @ParameterizedTest
    @MethodSource("provideProblemTests")
    void testSubsequenceSolution(String str1, String str2, String expected) {
        assertEquals(expected, new GreatestCommonStringDivisorProblem.Solution().gcdOfStrings(str1, str2));
    }

    static Stream<Arguments> provideProblemTests() {
        return Stream.of(
                Arguments.of("ABCABC", "ABC", "ABC"),
                Arguments.of("ABABAB", "ABAB", "AB"),
                Arguments.of("LEET", "CODE", "")
        );
    }
}