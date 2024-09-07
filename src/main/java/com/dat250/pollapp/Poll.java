package com.dat250.pollapp;

import java.time.Instant;
import java.util.List;

public class Poll {

    private String question;
    private Instant publishedAt;
    private Instant validUntil;
    private List<VoteOption> options;
    private User creator;

    public Poll(String question, Instant publishedAt, Instant validUntil, List<VoteOption> options, User creator) {
        this.question = question;
        this.publishedAt = publishedAt;
        this.validUntil = validUntil;
        this.options = options;
        this.creator = creator;
    }

    public Poll() {}

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Instant getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Instant publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Instant getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Instant validUntil) {
        this.validUntil = validUntil;
    }

    public List<VoteOption> getOptions() {
        return options;
    }

    public void setOptions(List<VoteOption> options) {
        this.options = options;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }
}