package com.kodilla.testing.forum.statistics;

import java.util.List;

/**
 * Created by Karol Olejarz on 15.07.2017.
 */
public class AdvancedStatistics {

    Statistics statistics;

    public AdvancedStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        List<String> userNames = statistics.usersNames();
        int userCount = userNames.size();
        double postsPerUser;
        double commentsPerUser;
        double commentsPerPost;

        if (userCount == 0) {
            System.out.println("There are no users");
        }

        else {
            if (statistics.postsCount() == 0) {
                postsPerUser = statistics.postsCount() / userCount;
                System.out.println("Users: " + userCount + " PPU: " + postsPerUser + ", there are no posts to comment so there can be no comment statistics");
            } else {
                postsPerUser = (double)statistics.postsCount() / (double)userCount;
                commentsPerUser = (double)statistics.commentsCount() / (double)userCount;
                commentsPerPost = (double)statistics.commentsCount() / (double)statistics.postsCount();
                System.out.println("Users: " + userCount + " PPU: " + postsPerUser + " CPU: " + commentsPerUser + " CPP: " + commentsPerPost);
            }
        }
    }
}