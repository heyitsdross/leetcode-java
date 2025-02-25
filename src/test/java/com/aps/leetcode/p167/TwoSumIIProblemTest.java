package com.aps.leetcode.p167;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <ul>
 * <li> 2 <= numbers.length <= 3 * 104
 * <li> -1000 <= numbers[i] <= 1000
 * <li> numbers is sorted in non-decreasing order.
 * <li> -1000 <= target <= 1000
 * <li> The tests are generated such that there is exactly one solution.
 * </ul>
 */
class TwoSumIIProblemTest {

    @ParameterizedTest
    @MethodSource("provideTwoSumInputs")
    void twoSumExample1(int[] numbers, int target, int[] expected) {
        var result = new TwoSumIIProblem.Solution().twoSum(numbers, target);

        assertArrayEquals(expected, result);
    }

    public static Stream<Arguments> provideTwoSumInputs() {
        return Stream.of(
                Arguments.of(new int[] {2, 7, 11, 15}, 9, new int[] {1, 2}),
                Arguments.of(new int[] {2, 3, 4}, 6, new int[] {1, 3}),
                Arguments.of(new int[] {-1, 0}, -1, new int[] {1, 2}),
                Arguments.of(new int[] {5, 25, 75}, 100, new int[] {2, 3}),
                Arguments.of(new int[] {3,24,50,79,88,150,345}, 200, new int[] {3, 6}),
                Arguments.of(new int[] {0, 0, 3, 4}, 0, new int[] {1, 2})
        );
    }
}