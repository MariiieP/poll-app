package com.poll.repository;

import com.poll.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionRepository  extends JpaRepository<Question,Long> {

   @Query("select q from Question q where q.poll.id = :pollId")
    List<Question> findAllByPoll_Id(@Param("pollId") long pollId);

}
