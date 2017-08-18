package com.kodilla.patterns.strategy.social;

public class User {
    final private String username;
    protected SocialPublisher publisher;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String sharePost() { return publisher.share(); }

    public void setMedium(SocialPublisher publisher) { this.publisher=publisher; }

}
