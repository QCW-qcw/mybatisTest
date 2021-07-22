package com.example.demomybatis.model;

public class Student {
    private Integer id;

    private String name;

    private String email;

    private Integer age;

    public Student( Integer id){
        this.id = id;
        this.name = null;
        this.email = null;
        this.age = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}