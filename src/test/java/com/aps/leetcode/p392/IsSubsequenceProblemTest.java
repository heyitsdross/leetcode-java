package com.aps.leetcode.p392;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceProblemTest {

    @ParameterizedTest
    @MethodSource("provideProblemTests")
    void testSubsequenceSolution(String s, String t, boolean expected) {
        assertEquals(expected, new IsSubsequenceProblem.Solution().isSubsequence(s, t));
    }

    static Stream<Arguments> provideProblemTests() {
        return Stream.of(
                Arguments.of("abc", "ahbdgc", true),
                Arguments.of("axc", "ahbdgc", false)
        );
    }
}