package org.jlue.drills;

import org.junit.Assert;
import org.junit.Test;

public class SimpleStackTest {

    @Test
    public void pushPopTest() {
        SimpleStack<Integer> testObj = new SimpleStack<Integer>();
        Assert.assertFalse(testObj.pop().isPresent());
        testObj.push(1);
        Assert.assertEquals(1, testObj.pop().get().intValue());
        Assert.assertFalse(testObj.pop().isPresent());
        Assert.assertFalse(testObj.pop().isPresent());

        testObj.push(2);
        testObj.push(3);
        testObj.push(4);
        Assert.assertEquals(4, testObj.pop().get().intValue());
        Assert.assertEquals(3, testObj.pop().get().intValue());
        Assert.assertEquals(2, testObj.pop().get().intValue());
        Assert.assertFalse(testObj.pop().isPresent());
        Assert.assertFalse(testObj.pop().isPresent());
    }
}