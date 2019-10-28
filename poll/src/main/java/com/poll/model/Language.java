package com.poll.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "language")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Language {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id_language", nullable = false)
    private Long id_language;
    @Column(name = "language_name")
    private String language;

    public Language() {
    }

    public Long getId_language() {
        return id_language;
    }

    public void setId_language(Long id_language) {
        this.id_language = id_language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language lang = (Language) o;
        return Objects.equals(id_language, lang.id_language) &&
                Objects.equals(language, lang.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_language, language);
    }

}