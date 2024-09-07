package com.dat250.pollapp;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {

    private PollManager manager;

    public PollController(PollManager manager) {
        this.manager = manager;
    }


}
