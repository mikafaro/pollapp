package com.dat250.pollapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/votes")
public class VoteController {

    private final PollManager manager;

    public VoteController(@Autowired PollManager manager) {
        this.manager = manager;
    }

    @PostMapping
    public ResponseEntity<Vote> newVote(@RequestParam Integer pollId,
                                        @RequestParam int optId) {
        if (!manager.containsPoll(pollId)) {
            return ResponseEntity.notFound().build();
        }
        VoteOption opt = manager.getVoteOption(pollId, optId);
        Vote vote = new Vote(pollId, opt);
        vote.setPublishedAt();
        manager.addVote(pollId, vote);
        return ResponseEntity.ok(vote);
    }

    @GetMapping("/{pollId}")
    public ResponseEntity<List<Vote>> getVotes(@PathVariable Integer pollId) {
        if (!manager.containsPoll(pollId)) {
            return ResponseEntity.notFound().build();
        }
        List<Vote> votes = manager.getVotes(pollId);
        return ResponseEntity.ok(votes);
    }

}
