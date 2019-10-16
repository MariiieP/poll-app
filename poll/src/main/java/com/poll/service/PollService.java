package com.poll.service;

import com.poll.excpection.EmployeeNotFoundException;
import com.poll.excpection.ResourceNotFoundException;
import com.poll.model.Poll;

import com.poll.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
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

    public Poll save(Poll poll) {
        return pollRepository.save(poll);
    }

    public void remove(long id) {
        pollRepository.deleteById(id);
    }
}
