package com.poll.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id_answer", nullable = false)
    private Long id_answer;

    @Column(name = "answer_text")
    private String answer;
    @Column(name = "right_answer")
    private String right_answer;
    @Column(name = "mark")
    private Integer mark;

    @ManyToOne(fetch = FetchType.LAZY,  cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_question", nullable = false)
    private Question question;

    @ManyToOne(fetch = FetchType.LAZY,  cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id", nullable = false)
    private Poll poll;

    public Answer() {
    }

    public Long getId_answer() {return id_answer; }

    public void setId_answer(Long id_answer) { this.id_answer = id_answer; }

    public String getAnswer() {return answer; }

    public void setAnswer(String answer) { this.answer = answer; }

    public String getRight_answer() {return right_answer; }

    public void setRight_answer(String right_answer) {
        this.right_answer = right_answer; }

    public Integer getMark() {return mark; }

    public void setMark(Integer mark) { this.mark = mark; }

    public Question getQuestion() {return question; }

    public void setQuestion(Question question) { this.question = question; }

    public Poll getPoll() {return poll; }

    public void setPoll(Poll poll) { this.poll = poll; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer ans = (Answer) o;
        return Objects.equals(id_answer, ans.id_answer) &&
                Objects.equals(answer, ans.answer) &&
                Objects.equals(right_answer, ans.right_answer) &&
                Objects.equals(mark, ans.mark) &&
                Objects.equals(question, ans.question) &&
                Objects.equals(poll, ans.poll)
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_answer, answer, right_answer, mark, question, poll);
    }



}

