package com.poll.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "poll")
public class Poll {

    @Id
    private Long id;

    private String language;
    private Integer option;


    public Poll() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poll poll = (Poll) o;
        return Objects.equals(id, poll.id) &&
                Objects.equals(language, poll.language) &&
                Objects.equals(option, poll.option);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, language, option);
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getOption() {
        return option;
    }

    public void setOption(Integer option) {
        this.option = option;
    }
}
