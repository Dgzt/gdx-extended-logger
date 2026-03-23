package com.github.dgzt.extendedlogger;

import org.junit.Assert;
import org.junit.Test;

public class LoggerUtilTest {

    @Test
    public void testFormat() {
        Assert.assertEquals("Hello Word!", LoggerUtil.format("Hello {}!", "Word"));
    }
}
