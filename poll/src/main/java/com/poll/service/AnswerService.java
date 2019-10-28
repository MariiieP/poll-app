package com.poll.service;

import com.poll.excpection.EmployeeNotFoundException;
import com.poll.model.Answer;
import com.poll.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    public List<Answer> getAll() {
        return answerRepository.findAll();
    }

    public Answer getById(long id) {
        return answerRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    public Answer addAnswer(Answer answer) {
        Answer savedAnswer = answerRepository.saveAndFlush(answer);

        return savedAnswer;
    }

    public void delete(long id) {
        answerRepository.deleteById(id);
    }

    public Answer editAnswer(Answer answer){
        return answerRepository.saveAndFlush(answer);
    }
}
