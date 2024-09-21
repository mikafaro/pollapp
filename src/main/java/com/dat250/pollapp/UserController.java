package com.dat250.pollapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final PollManager manager;

    public UserController(@Autowired PollManager manager) {
        this.manager = manager;
    }

    @GetMapping
    public List<User> listUsers() {
        return manager.getUsers();
    }

    @PostMapping
    public User newUser(@RequestBody User user) {
        manager.addUser(user);
        return user;
    }

    @GetMapping("/{name}")
    public User getUser(@PathVariable String name) {
        return manager.getUser(name);
    }

}
