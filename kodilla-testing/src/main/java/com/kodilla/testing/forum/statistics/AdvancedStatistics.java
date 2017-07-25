package com.kodilla.testing.forum.statistics;

import java.util.List;

/**
 * Created by Karol Olejarz on 15.07.2017.
 */
public class AdvancedStatistics {

    Statistics statistics;

    double postsPerUser;
    double commentsPerUser;
    double commentsPerPost;

    public AdvancedStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public String calculateAdvStatistics(Statistics statistics) {

        List<String> userNames = statistics.usersNames();
        int userCount = userNames.size();

        if (userCount == 0) {
            System.out.println("There are no users");
            return "0_USERS";
        }

        else {
            if (statistics.postsCount() == 0) {
                postsPerUser = statistics.postsCount() / userCount;
                System.out.println("Users: " + userCount + " PPU: " + postsPerUser + ", there are no posts to comment so there can be no comment statistics");
                return "0_POSTS";
            } else {
                postsPerUser = (double)statistics.postsCount() / (double)userCount;
                commentsPerUser = (double)statistics.commentsCount() / (double)userCount;
                commentsPerPost = (double)statistics.commentsCount() / (double)statistics.postsCount();
                System.out.println("User count: " + userCount + " PPU: " + postsPerUser + " CPU: " + commentsPerUser + " CPP: " + commentsPerPost);
                return "OK";
            }
        }
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}