package com.aps.leetcode.other.slidingwindow;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SlidingWindowExampleProblemTest {

    @ParameterizedTest
    @MethodSource("provideTestParams")
    void testIt(int[] nums, int subarraySize, double expected) {
        assertEquals(expected, new SlidingWindowExampleProblem.Solution().findMaxAverage(nums, subarraySize));
    }

    public static Stream<Arguments> provideTestParams() {
        return Stream.of(
                Arguments.of(new int[] {1, 12, -5, -6, 50, 3}, 4, 12.75),
                Arguments.of(new int[] {0, 1, 1, 3, 3}, 4, 2.000)
        );
    }
}