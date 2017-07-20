package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Karol Olejarz on 15.07.2017.
 */
public class ForumStatisticsTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void thereAreNoUsers() {
        System.out.println("Testing 0 users...");
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>(0);
        int postsCount = 100;
        int commentsCount = 100;

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        AdvancedStatistics moreStats = new AdvancedStatistics(statisticsMock);

        moreStats.calculateAdvStatistics(statisticsMock);
    }

    @Test
    public void thereAreNoPosts() {
        System.out.println("Testing 0 posts...");
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>(1);
        userNames.add("User1");
        int postsCount = 0;
        int commentsCount = 100;

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        AdvancedStatistics moreStats = new AdvancedStatistics(statisticsMock);

        moreStats.calculateAdvStatistics(statisticsMock);
    }

    @Test
    public void thereAreNoComments() {
        System.out.println("Testing 0 comments...");
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>(1);
        userNames.add("User1");
        int postsCount = 100;
        int commentsCount = 0;

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        AdvancedStatistics moreStats = new AdvancedStatistics(statisticsMock);

        moreStats.calculateAdvStatistics(statisticsMock);
    }


    @Test
    /*also tests Posts<Comments*/
    public void hUsers1kPosts15hComments() {
        System.out.println("Testing 100 users, 1000 posts, 1500 comments...");
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>(100);
        int i;

        for(i = 0; i < 100; i++){
            userNames.add("User"+i);
        }

        int postsCount = 1000;
        int commentsCount = 1500;

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        AdvancedStatistics moreStats = new AdvancedStatistics(statisticsMock);

        moreStats.calculateAdvStatistics(statisticsMock);
    }

    @Test
    public void hUsers1kPosts5hComments() {
        System.out.println("Testing 100 users, 1000 posts, 500 comments...");
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>(100);
        int i;

        for(i = 0; i < 100; i++){
            userNames.add("User"+i);
        }

        int postsCount = 1000;
        int commentsCount = 500;

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        AdvancedStatistics moreStats = new AdvancedStatistics(statisticsMock);

        moreStats.calculateAdvStatistics(statisticsMock);
    }

}