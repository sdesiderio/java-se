package com.sistemi.informativi.bean;

public class Teacher {

    private String name;

    private int seniority;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher(String name, int seniority, int age) {
        this.name = name;
        this.seniority = seniority;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", seniority=" + seniority +
                ", age=" + age +
                '}';
    }
}
