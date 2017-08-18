package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        User millenial = new Millenials("Millenial");
        User ygrek = new YGeneration("Ygrek");
        User zet = new ZGeneration("zet");

        String millenialUses = millenial.sharePost();
        String ygrekUses = ygrek.sharePost();
        String zetUses = zet.sharePost();

        Assert.assertEquals("Facebook user",millenialUses);
        Assert.assertEquals("Twitter user",ygrekUses);
        Assert.assertEquals("Snapchat user",zetUses);
    }

    @Test
    public void testIndividualSharingStrategy() {
        User user = new Millenials("Millenial");

        String userUses = user.sharePost();
        Assert.assertEquals("Facebook user",userUses);

        user.setMedium(new TwitterPublisher());
        userUses = user.sharePost();
        Assert.assertEquals("Twitter user",userUses);

        user.setMedium(new SnapchatPublisher());
        userUses = user.sharePost();
        Assert.assertEquals("Snapchat user",userUses);

        user.setMedium(new FacebookPublisher());
        userUses = user.sharePost();
        Assert.assertEquals("Facebook user",userUses);

    }

}
