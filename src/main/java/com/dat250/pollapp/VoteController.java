package com.dat250.pollapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("{username}/votes")
public class VoteController {

    private final PollManager manager;

    public VoteController(@Autowired PollManager manager) {
        this.manager = manager;
    }

    @PostMapping
    public ResponseEntity<Vote> newVote(@PathVariable String username,
                                        @RequestParam Integer pollId,
                                        @RequestParam int optId) {
        if (!manager.containsUser(username)) {
            return ResponseEntity.notFound().build();
        }
        if (!manager.containsPoll(pollId)) {
            return ResponseEntity.notFound().build();
        }
        VoteOption opt = manager.getVoteOption(pollId, optId);
        Vote vote = new Vote(pollId, opt);
        vote.setPublishedAt();
        manager.getUser(username).getVotes().add(vote);
        return ResponseEntity.ok(vote);
    }

    @GetMapping
    public ResponseEntity<List<Vote>> getUserVotes(@PathVariable String username) {
        if (!manager.containsUser(username)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(manager.getUser(username).getVotes());
    }

}
