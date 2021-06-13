package com.example.recyclerview.Model;

public class Student {
    String name;
    int Rollno;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int rollno) {

        Rollno = rollno;
    }

    public Student(String name, int rollno) {
        this.name = name;
        Rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {

        return Rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

}
