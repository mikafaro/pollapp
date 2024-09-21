package com.dat250.pollapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PollManager {

    private Map<String, User> userMap;
    private Map<Integer, Poll> pollMap;
    private Map<Integer, List<Vote>> voteMap;

    public PollManager() {
        this.userMap = new HashMap<>();
        this.pollMap = new HashMap<>();
    }

    public void addUser(User user) {
        userMap.put(user.getUsername(), user);
    }

    public User getUser(String username) {
        return userMap.get(username);
    }

    public List<User> getUsers() {
        return new ArrayList<>(userMap.values());
    }

    public Boolean containsUser(String username) {
        return userMap.containsKey(username);
    }

    public void addPoll(Poll poll) {
        pollMap.put(poll.getId(), poll);
    }

    public void deletePoll(Integer id) {
        pollMap.remove(id);
    }

    public Poll getPoll(Integer id) {
        return pollMap.get(id);
    }

    public List<Poll> getPolls() {
        return new ArrayList<>(pollMap.values());
    }

    public Boolean containsPoll(Integer id) {
        return pollMap.containsKey(id);
    }

    public VoteOption getVoteOption(Integer pollId, int optionId) {
        return pollMap.get(pollId).getOptions().get(optionId);
    }

    public void addVote(Integer pollId, Vote vote) {
        List<Vote> votes = voteMap.get(pollId);
        votes.add(vote);
    }

    public List<Vote> getVotes(Integer pollId) {
        return voteMap.get(pollId);
    }

}