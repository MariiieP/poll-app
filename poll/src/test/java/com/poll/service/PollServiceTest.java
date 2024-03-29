package com.poll.service;

import com.poll.model.Poll;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class PollServiceTest {

    private List<Poll> pollList;

    @Before
    public void setUp() throws Exception {
        pollList = new LinkedList<Poll>();

        Poll poll = new Poll();
        poll.setId((long) 1);
        poll.setOption(2345);
        pollList.add(poll);

        Poll poll2 = new Poll();
        poll2.setId((long)2);
        poll2.setOption(2345);
        pollList.add(poll2);

        Poll todo3 = new Poll();
        todo3.setId((long)3);
        todo3.setOption(2345);
        pollList.add(todo3);
    }

    @After
    public void tearDown() throws Exception {
        pollList = null;
    }

    @Test
    public void getAll() {
        int actualParam = pollList.size();
        int expected = 3;

        assertEquals(expected, actualParam);
    }

    @Test
    public void getById() {
        long actualParam = pollList.get(1).getId();
        int expected = 2;

        assertEquals(expected, actualParam);
    }

    @Test
    public void save() {
        Poll poll = new Poll();
        poll.setId((long)4);
        poll.setOption(2345);
        pollList.add(poll);
        long actualParam = pollList.get(3).getId();
        int expected = 4;

        assertEquals(expected, actualParam);
    }

    @Test
    public void remove() {
        pollList.remove(1);
        int actualParam = pollList.size();
        int expected = 2;

        assertEquals(expected, actualParam);
    }
}