//package com.poll.model;
//
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "answer")
//public class Answer {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id_answer;
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "id_question", nullable = false)
//    private Question question;
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "id", nullable = false)
//    private Poll id;
//
//
//    private String language;
//    private Integer option;
//
//    public Answer() {
//    }
//
//    public Long getId_answer() {
//        return id_answer;
//    }
//
//    public void setId_answer(Long id_answer) {
//        this.id_answer = id_answer;
//    }
//
//    public Question getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(Question question) {
//        this.question = question;
//    }
//
//    public Poll getId() {
//        return id;
//    }
//
//    public void setId(Poll id) {
//        this.id = id;
//    }
//
//    public String getLanguage() {
//        return language;
//    }
//
//    public void setLanguage(String language) {
//        this.language = language;
//    }
//
//    public Integer getOption() {
//        return option;
//    }
//
//    public void setOption(Integer option) {
//        this.option = option;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Answer answer = (Answer) o;
//        return Objects.equals(id_answer, answer.id_answer) &&
//                Objects.equals(question, answer.question) &&
//                Objects.equals(id, answer.id) &&
//                Objects.equals(language, answer.language) &&
//                Objects.equals(option, answer.option);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id_answer, question, id, language, option);
//    }
//}
