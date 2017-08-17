package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLog() {
        String entry1 = "Instance1 created";
        String entry2 = "Instance2 created";
        Assert.assertEquals(entry1, Logger.getInstance().log(entry1));
        Assert.assertEquals(entry2, Logger.getInstance().log(entry2));
    }
    @Test
    public void testGetLastLog() {
        String entry1 = "Instance1 created";
        String entry2 = "Instance2 created";
        String entry3 = "Instance3 created";
        Logger.getInstance().log(entry1);
        Logger.getInstance().log(entry2);
        Logger.getInstance().log(entry3);
        Assert.assertEquals(entry3, Logger.getInstance().getLastLog());
    }

}
