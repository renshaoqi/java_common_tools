package com.zeroten.common.util;

import org.junit.Assert;
import org.junit.Test;

public class CheckUtilsTest {

    @Test
    public void testBoolean() {
        Assert.assertEquals(CheckUtils.isAnyEmpty(" "), false);

    }
}
