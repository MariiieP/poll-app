package com.poll.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "test_result")
public class Test_result {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id_test_result", nullable = false)
    private Long id_test_result;

    @Column(name = "correct_answers")
    private Long correct_answers;
    @Column(name = "sum_mark")
    private Long sum_mark;
    @Column(name = "percent_correct_answers")
    private Long percent_correct_answers;

    @ManyToOne(fetch = FetchType.LAZY,  cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id", nullable = false)
    private Poll poll;

    @ManyToOne(fetch = FetchType.LAZY,  cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_registration", nullable = false)
    private Registration registration;

    public Test_result() {
    }

    public Long getId_test_result() {
        return id_test_result;
    }

    public void setId_test_result(Long id_test_result) {
        this.id_test_result = id_test_result;
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

    public void setPercent_correct_answers(Long percent_correct_answers) {this.percent_correct_answers = percent_correct_answers; }

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test_result test_result = (Test_result) o;
        return Objects.equals(id_test_result, test_result.id_test_result) &&
                Objects.equals(correct_answers, test_result.correct_answers) &&
                Objects.equals(sum_mark, test_result.sum_mark)&&
                Objects.equals(percent_correct_answers, test_result.percent_correct_answers) &&
                Objects.equals(poll, test_result.poll)&&
                Objects.equals(registration, test_result.registration)
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_test_result, correct_answers, sum_mark, percent_correct_answers, poll, registration);
    }
}
