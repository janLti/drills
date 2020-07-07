package org.jlue.drills;

import org.junit.Assert;
import org.junit.Test;

public class SimpleStackTest {

    @Test
    public void pushPopTest() {
        SimpleStack<Integer> testObj = new SimpleStack<Integer>();
        testObj.push(1);
        Assert.assertEquals(null, testObj.pop().intValue());
    }
}