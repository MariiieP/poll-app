package com.poll.repository;


import com.poll.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
/*
public interface PollRepository extends CrudRepository<Poll,Long> {

    @Override
    Optional<Poll> findById(Long aLong);

    @Override
    List<Poll> findAll();

}
*/

public interface PollRepository extends JpaRepository<Poll,Long> {
}