package com.bjpowernode;

public class Test01 {
    public static void main(String[] args) {
      Person s = new Student();
      Person t = new Teacher();
      s = (Teacher)t;
        }
    }
    class Person{
    int age;
    String name;
    }
    class Student extends Person{

    }
    class Teacher extends Person{

    }
