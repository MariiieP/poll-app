package com.poll.repository;

import com.poll.model.Answer;
import com.poll.model.Poll;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AnswerRepository extends CrudRepository<Answer,Long> {

    @Override
    Optional<Answer> findById(Long aLong);

    @Override
    List<Answer> findAll();

//    @Override
//    void deleteById(Long aLong);

}
