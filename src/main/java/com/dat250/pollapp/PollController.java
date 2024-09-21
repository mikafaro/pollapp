package com.dat250.pollapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polls")
@CrossOrigin
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

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePoll(@PathVariable Integer id) {
        if (manager.containsPoll(id)) {
            manager.deletePoll(id);
            return ResponseEntity.ok("Poll deleted");
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Poll> getPoll(@PathVariable Integer id) {
        if (manager.containsPoll(id)) {
            return ResponseEntity.ok(manager.getPoll(id));
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<Poll> getAllPolls() {
        return manager.getPolls();
    }

}
