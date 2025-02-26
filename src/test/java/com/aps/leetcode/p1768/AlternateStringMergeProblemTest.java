package com.aps.leetcode.p1768;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlternateStringMergeProblemTest {

    @ParameterizedTest
    @MethodSource("provideBinaryGapTests")
    void testStringMerge(String word1, String word2, String expected) {
        assertEquals(expected, new AlternateStringMergeProblem.Solution().mergeAlternately(word1, word2));
    }

    public static Stream<Arguments> provideBinaryGapTests() {
        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("ab", "pqrs", "apbqrs"),
                Arguments.of("abcd", "pq", "apbqcd")
        );
    }
}