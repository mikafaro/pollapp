package com.dat250.pollapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polls")
public class PollController {

    private final PollManager manager;

    public PollController(@Autowired PollManager manager) {
        this.manager = manager;
    }

    @PostMapping
    public Poll newPoll(@RequestBody Poll poll) {
        poll.setId();
        poll.setPublishedAt();
        poll.setValidUntil();
        manager.addPoll(poll);
        return poll;
    }

    @GetMapping("/{id}")
    public Poll getPoll(@PathVariable Integer id) {
        return manager.getPoll(id);
    }

    @GetMapping
    public List<Poll> getAllPolls() {
        return manager.getPolls();
    }

}
