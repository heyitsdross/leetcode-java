package com.aps.leetcode.other.binarygap;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryGapProblemTest {

    @ParameterizedTest
    @MethodSource("provideBinaryGapTests")
    void testBinaryGap(int i, int maxGapSize) {
        assertEquals(maxGapSize, new BinaryGapProblem.Solution().solution(i));
    }

    public static Stream<Arguments> provideBinaryGapTests() {
        return Stream.of(
                Arguments.of(2, 0),
                Arguments.of(9, 2),
                Arguments.of(1610612737, 28),
                Arguments.of(66561, 9),
                Arguments.of(15, 0)
        );
    }
}