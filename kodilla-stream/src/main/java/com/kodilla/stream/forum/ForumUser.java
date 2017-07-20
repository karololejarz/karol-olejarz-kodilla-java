package com.kodilla.stream.forum;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String userName;
    private char userGender;
    private final LocalDate userDateOfBirth;
    private final int userPostCount;

    public ForumUser(final int userId, final String userName, char userGender, final LocalDate userDateOfBirth, final int userPostCount) {
        this.userId = userId;
        this.userName = userName;
        this.userGender = userGender;
        this.userDateOfBirth = userDateOfBirth;
        this.userPostCount = userPostCount;
    }

    public void setUserGender(char userGender) {
        this.userGender = userGender;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserGender() {
        return userGender;
    }

    public LocalDate getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public int getUserPostCount() {
        return userPostCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userGender=" + userGender +
                ", userDateOfBirth=" + userDateOfBirth +
                ", userPostCount=" + userPostCount +
                '}';
    }
}
