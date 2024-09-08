package com.dat250.pollapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/votes")
public class VoteController {

    private PollManager manager;

    public VoteController(@Autowired PollManager manager) {
        this.manager = manager;
    }

    @PostMapping("/{id}")
    public String newVote() {
        return "todo";
    }

    @GetMapping("/{id}")
    public String getPollVotes() {
        return "todo";
    }

    @DeleteMapping("/{id}")
    public String deleteVote() {
        return "todo";
    }

    @PutMapping("/{id}")
    public String changeVote() {
        return "todo";
    }

}
