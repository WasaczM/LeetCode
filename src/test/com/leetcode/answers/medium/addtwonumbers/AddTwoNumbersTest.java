package com.leetcode.answers.medium.addtwonumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AddTwoNumbersTest {


    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(
                        new ListNode(
                                2, new ListNode(
                                4, new ListNode(
                                3, new ListNode(
                                1
                        )))),
                        new ListNode(
                                5, new ListNode(
                                6, new ListNode(
                                4
                        ))),
                        new int[]{7, 0, 8, 1}
                ),
                Arguments.of(
                        new ListNode(0),
                        new ListNode(0),
                        new int[]{0}
                ),
                Arguments.of(
                        new ListNode(
                                9, new ListNode(
                                9, new ListNode(
                                9, new ListNode(
                                9, new ListNode(
                                9, new ListNode(
                                9, new ListNode(
                                9))))))),
                        new ListNode(
                                9, new ListNode(
                                9, new ListNode(
                                9, new ListNode(
                                9)))),
                        new int[]{8, 9, 9, 9, 0, 0, 0, 1}
                )
        );
    }

    @ParameterizedTest()
    @MethodSource("testData")
    public void solution(ListNode l1, ListNode l2, int[] expectedValues) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode targetListNode = addTwoNumbers.addTwoNumbers(l1, l2);

        List<Integer> values = new ArrayList<>();
        while (targetListNode.next != null) {
            values.add(targetListNode.val);
            targetListNode = targetListNode.next;
        }
        values.add(targetListNode.val);

        for (int i = 0; i < expectedValues.length; i++) {
            Assertions.assertEquals(expectedValues[i], values.get(i));
        }

    }

}
