package com.itheima.domain;

public class Student {
    private String Sid;
    private String name;
    private int age;
    private String birthday;

    public Student() {
    }

    public Student(String sid, String name, int age, String birthday) {
        Sid = sid;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getSid() {
        return Sid;
    }

    public void setSid(String sid) {
        Sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
