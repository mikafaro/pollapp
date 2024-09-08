package com.dat250.pollapp;


import java.time.Instant;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Poll {

    private static final AtomicInteger counter = new AtomicInteger(0);

    private Integer id;
    private String question;
    private Instant publishedAt;
    private Instant validUntil;
    private List<VoteOption> options;

    public Poll(String question, List<VoteOption> options) {
        this.id = counter.incrementAndGet();
        this.question = question;
        this.options = options;
        this.validUntil = java.time.Instant.now().plusSeconds(1000000);
        this.publishedAt = java.time.Instant.now();

    }

    public Poll() {}

    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = counter.incrementAndGet();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Instant getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt() {
        this.publishedAt = java.time.Instant.now();
    }

    public Instant getValidUntil() {
        return validUntil;
    }

    public void setValidUntil() {
        this.validUntil = java.time.Instant.now().plusSeconds(1000000);
    }

    public List<VoteOption> getOptions() {
        return options;
    }

    public void setOptions(List<VoteOption> options) {
        this.options = options;
    }

}