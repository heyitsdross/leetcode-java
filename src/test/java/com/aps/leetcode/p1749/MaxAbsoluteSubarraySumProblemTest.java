package com.aps.leetcode.p1749;

import java.util.stream.Stream;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxAbsoluteSubarraySumProblemTest {

    @Disabled("Problem not yet solved.")
    @ParameterizedTest
    @MethodSource("provideProblemTests")
    void testSubsequenceSolution(int[] nums, int expected) {
        assertEquals(expected, new MaxAbsoluteSubarraySumProblem.Solution().maxAbsoluteSum(nums));
    }

    static Stream<Arguments> provideProblemTests() {
        return Stream.of(
                Arguments.of(new int[] {1, -3, 2, 3, -4}, 5),
                Arguments.of(new int[] {2, -5, 1 - 4, 3, 2}, 8),
                Arguments.of(new int[] {1, -99, 0}, 99)
        );
    }
}