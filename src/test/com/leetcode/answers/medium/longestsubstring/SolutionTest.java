package com.leetcode.answers.medium.longestsubstring;

import com.leetcode.answers.medium.addtwonumbers.ListNode;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionTest {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        "abcabcbb",
                        3
                ),
                Arguments.of(
                        "bbbbb",
                        1
                ),
                Arguments.of(
                        "pwwkew",
                        3
                ),
                Arguments.of(
                        "a",
                        1
                ),
                Arguments.of(
                        "ab",
                        2
                ),
                Arguments.of(
                        "dvdf",
                        3
                ),
                Arguments.of(
                        "anviaj",
                        5
                )
        );
    }

    @ParameterizedTest()
    @MethodSource("testData")
    public void lengthOfLongestSubstringTest(String testString, int expectedMaxLengthOfSubstring) {
        Solution solution = new Solution();
        Assertions.assertEquals(expectedMaxLengthOfSubstring, solution.lengthOfLongestSubstring(testString));
    }
}
