package com.dat250.pollapp;

import java.time.Instant;

public class Vote {

    private Instant publishedAt;
    private User user;

    public Vote(User user) {
        this.publishedAt = Instant.now();
        this.user = user;
    }

    public Vote() {}

    public Instant getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt() {
        this.publishedAt = Instant.now();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}