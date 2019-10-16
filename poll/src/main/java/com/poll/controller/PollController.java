package com.poll.controller;

import com.poll.model.Poll;
import com.poll.service.PollService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PollController {


    @Autowired
    private PollService pollService;

    @RequestMapping(value = "/user/polls", method = RequestMethod.GET, produces = "application/json")
    public List<Poll> firstPage() {
        List<Poll> data = new ArrayList<>();
        data.addAll(pollService.getAll());
        return data;
    }

    @RequestMapping(value = "/user/polls/{pollId}", method = RequestMethod.GET, produces = "application/json")
    public Poll firstPageById(@PathVariable Long pollId) {
        Poll poll = pollService.getById(pollId);
        return poll;
    }

}
