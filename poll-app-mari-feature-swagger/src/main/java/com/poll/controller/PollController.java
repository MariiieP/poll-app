package com.poll.controller;

import com.poll.model.Poll;
import com.poll.service.PollService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PollController {


    @Autowired
    private PollService pollService;

    @RequestMapping(value = "/user/polls", method = RequestMethod.GET)
    public String firstPage(Model model) {
        List<Poll> data = new ArrayList<>();
        data.addAll(pollService.getAll());
        model.addAttribute("poll", new Poll());
        model.addAttribute("polls",data);

        return "polls";
    }

    @RequestMapping(value = "/generate/{id}", method = RequestMethod.GET)
    public String generate(@PathVariable Long id, Model model) {

        model.addAttribute("poll", pollService.generate(id));
        model.addAttribute("answers", new ArrayList<String>());
        return "pollForm";
    }

    @RequestMapping(value="/checkAnswers",method = RequestMethod.POST)
    public String checkAnswers(@RequestParam("answer1") String answer1,
                               @RequestParam("answer2") String answer2,
                               @RequestParam("answer3") String answer3,
                               @RequestParam("answer4") String answer4,
                               @RequestParam("answer5") String answer5,
                                @RequestParam("question1") Long question1,
                               @RequestParam("question2") Long question2,
                               @RequestParam("question3") Long question3,
                               @RequestParam("question4") Long question4,
                               @RequestParam("question5") Long question5,Model model){
        List<String> answers= Arrays.asList(answer1,answer2,answer3,answer4,answer5);
        List<Long> questions= Arrays.asList(question1,question2,question3,question4,question5);
        model.addAttribute("result", pollService.checkAnswers(answers,questions));
        return "result";
    }

    @RequestMapping(value = "/user/polls/{pollId}", method = RequestMethod.GET, produces = "application/json")
    public Poll firstPageById(@PathVariable Long pollId) {
        Poll poll = pollService.getById(pollId);
        return poll;
    }

}
