package com.poll.service;

import com.poll.excpection.EmployeeNotFoundException;
import com.poll.model.Answer;
import com.poll.model.Poll;

import com.poll.model.Question;
import com.poll.repository.AnswerRepository;
import com.poll.repository.PollRepository;
import com.poll.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Service
public class PollService {

    @Autowired
    private PollRepository pollRepository;
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private AnswerRepository answerRepository;

    public List<Poll> getAll() {
        return pollRepository.findAll();
    }

    public Poll getById(Long id) {
        return pollRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    public Poll save(Poll poll) {
        return pollRepository.save(poll);
    }

    public void remove(Long id) {
        pollRepository.deleteById(id);
    }

    public List<Question> questionsForPoll(Long id){
        List<Question> questions=questionRepository.findAll();
        List<Question> questionsForPoll=new ArrayList<>();
        for (Question question: questions){
            if (question.getPoll().getId()==id){
                questionsForPoll.add(question);
            }
        }
        return questionsForPoll;
    }

    public Poll generate(Long id){
        Poll poll=getById(id);
        List<Question> questionsForPoll=questionsForPoll(id);
        List<Question> randomQuestions=new ArrayList<>();
        for(int i=0; i<5;i++) {
            Random rand = new Random();
            Question randomQuestion = questionsForPoll.get(rand.nextInt(questionsForPoll.size()));
            randomQuestions.add(randomQuestion);
            questionsForPoll.remove(randomQuestion);
        }
        poll.setQuestions(randomQuestions);
        return poll;
    }

    public int checkAnswers(List<String> answers, List<Long> poll){
        int result=0;
        for (int i=0;i<5;i++){
            if (answers.get(i).equals(answerRepository.findById(poll.get(i)).get().getRight_answer()))
                result++;
        }
        return result;
    }
}
