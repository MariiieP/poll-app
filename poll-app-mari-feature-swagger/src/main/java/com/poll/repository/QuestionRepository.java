package com.poll.repository;

import com.poll.model.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends CrudRepository<Question, Long> {

@Override
Optional<Question> findById(Long aLong);

@Override
List<Question> findAll();

//    @Override
//    void deleteById(Long aLong);

}
