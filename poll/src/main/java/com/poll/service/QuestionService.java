package com.poll.service;

import com.poll.excpection.EmployeeNotFoundException;
import com.poll.model.Question;
import com.poll.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    public Question getById(long id) {
        return questionRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    public Question addQuestion(Question question) {
        Question savedQuestion = questionRepository.saveAndFlush(question);

        return savedQuestion;
    }

    public void delete(long id) {
        questionRepository.deleteById(id);
    }

    public Question editQuestion(Question question){
        return questionRepository.saveAndFlush(question);
    }

    public List<Question> getAllQuestionsByPollId(long pollId){
        return questionRepository.findAllByPoll_Id(pollId);
    }

}
