package com.poll.model;

import javax.persistence.*;

@Entity
@Table(name = "test_result")
public class TestResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_test_result;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_registration", nullable = false)
    private Registration registration;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private Poll poll;

    private Long correct_answers;
    private Long sum_mark;
    private Long percent_correct_answers;

    public Long getId_test_result() {
        return id_test_result;
    }

    public void setId_test_result(Long id_test_result) {
        this.id_test_result = id_test_result;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public Long getCorrect_answers() {
        return correct_answers;
    }

    public void setCorrect_answers(Long correct_answers) {
        this.correct_answers = correct_answers;
    }

    public Long getSum_mark() {
        return sum_mark;
    }

    public void setSum_mark(Long sum_mark) {
        this.sum_mark = sum_mark;
    }

    public Long getPercent_correct_answers() {
        return percent_correct_answers;
    }

    public void setPercent_correct_answers(Long percent_correct_answers) {
        this.percent_correct_answers = percent_correct_answers;
    }
}
