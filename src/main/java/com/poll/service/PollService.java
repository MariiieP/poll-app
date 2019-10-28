package com.poll.service;

import com.poll.excpection.EmployeeNotFoundException;
import com.poll.model.Poll;

import com.poll.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollService {

    @Autowired
    private PollRepository pollRepository;

    public List<Poll> getAll() {
        return pollRepository.findAll();
    }

    public Poll getById(long id) {
        return pollRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    public Poll addPoll(Poll poll) {
        Poll savedPoll = pollRepository.saveAndFlush(poll);

        return savedPoll;
    }

    public void delete(long id) {
        pollRepository.deleteById(id);
    }

    public Poll editPoll(Poll poll){
        return pollRepository.saveAndFlush(poll);
    }

}
