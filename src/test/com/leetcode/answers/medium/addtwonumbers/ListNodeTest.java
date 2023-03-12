package com.leetcode.answers.medium.addtwonumbers;

import org.junit.Assert;
import org.junit.Test;

public class ListNodeTest {

    @Test
    public void defaultConstructor() {
        ListNode listNode = new ListNode();
        Assert.assertNull(listNode.next);
        Assert.assertEquals(0, listNode.val);
    }

    @Test
    public void val_constructor() {
        ListNode listNode = new ListNode(1);
        Assert.assertNull(listNode.next);
        Assert.assertEquals(1, listNode.val);
    }

    @Test
    public void val_next_constructor() {
        ListNode listNode = new ListNode(2, new ListNode());
        Assert.assertNotNull(listNode.next);
        Assert.assertEquals(2, listNode.val);
    }
}
