package com.poll.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "registration")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Registration {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id_registration", nullable = false)
    private Long id_registration;

    @Column(name = "surname")
    private String surname;
    @Column(name = "name")
    private String name;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "university")
    private String university;
    @Column(name = "course")
    private Long course;
    @Column(name = "group_")
    private Long group;


    public Registration() {
    }

    public Long getId_registration() {
        return id_registration;
    }

    public void setId_registration(Long id_registration) {
        this.id_registration = id_registration;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Long getCourse() {
        return course;
    }

    public void setCourse(Long course) {
        this.course = course;
    }

    public Long getGroup() {
        return group;
    }

    public void setGroup(Long group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registration registration = (Registration) o;
        return Objects.equals(id_registration, registration.id_registration) &&
                Objects.equals(surname, registration.surname)&&
                Objects.equals(name, registration.name)&&
                Objects.equals(patronymic, registration.patronymic)&&
                Objects.equals(university, registration.university)&&
                Objects.equals(course, registration.course)&&
                Objects.equals(group, registration.group)
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_registration, surname, name, patronymic, university, course, group);
    }

}