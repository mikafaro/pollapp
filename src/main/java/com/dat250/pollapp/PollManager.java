package com.dat250.pollapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PollManager {

    private Map<String, User> userMap;
    private Map<String, Poll> pollMap;

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

}