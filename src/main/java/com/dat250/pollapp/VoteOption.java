package com.dat250.pollapp;

import java.util.List;

public class VoteOption {

    private String caption;
    private int presentationOrder;
    private List<Vote> votes;

    public VoteOption(String caption, int presentationOrder, List<Vote> votes) {
        this.caption = caption;
        this.presentationOrder = presentationOrder;
        this.votes = votes;
    }

    public VoteOption() {}

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getPresentationOrder() {
        return presentationOrder;
    }

    public void setPresentationOrder(int presentationOrder) {
        this.presentationOrder = presentationOrder;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }
}