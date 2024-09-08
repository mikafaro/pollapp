package com.dat250.pollapp;

import java.time.Instant;

public class Vote {

    private Instant publishedAt;
    private Integer pollId;
    private VoteOption option;

    public Vote(Integer pollId, VoteOption option) {
        this.publishedAt = Instant.now();
        this.pollId = pollId;
        this.option = option;
    }

    public Vote() {}

    public Instant getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt() {
        this.publishedAt = Instant.now();
    }

    public VoteOption getOption() {
        return option;
    }

    public void setOption(VoteOption option) {
        this.option = option;
    }

    public Integer getPollId() {
        return pollId;
    }

    public void setPollId(Integer pollId) {
        this.pollId = pollId;
    }
}