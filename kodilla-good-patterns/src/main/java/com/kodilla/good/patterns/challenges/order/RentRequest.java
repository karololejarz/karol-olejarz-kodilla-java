package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public class RentRequest {

    public User user;
    public LocalDateTime from;
    public LocalDateTime to;

    public RentRequest(User user, LocalDateTime from, LocalDateTime to) {
        this.user = user;
        this.from = from;
        this.to = to;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

}
