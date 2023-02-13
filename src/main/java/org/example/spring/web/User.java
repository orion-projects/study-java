package org.example.spring.web;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}
