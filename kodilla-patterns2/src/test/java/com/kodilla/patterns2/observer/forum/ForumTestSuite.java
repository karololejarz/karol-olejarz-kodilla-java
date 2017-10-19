package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumTestSuite {
    @Test
    public void testUpdate() {
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic toolsHelpForum = new JavaToolsForumTopic();
        ForumUser user1 = new ForumUser("user1");
        ForumUser user2 = new ForumUser("user2");
        ForumUser user3 = new ForumUser("user3");

        javaHelpForum.registerObserver(user1);
        javaHelpForum.registerObserver(user3);
        toolsHelpForum.registerObserver(user2);
        toolsHelpForum.registerObserver(user3);

        javaHelpForum.addPost("post1");
        javaHelpForum.addPost("post2");
        javaHelpForum.addPost("post3");
        toolsHelpForum.addPost("post1");
        toolsHelpForum.addPost("post2");

        Assert.assertEquals(3,user1.getUpdateCount());
        Assert.assertEquals(2,user2.getUpdateCount());
        Assert.assertEquals(5,user3.getUpdateCount());
    }
}
