package com.bbubbush.tistory;

public class Person {
  private int age;
  private String name;
  private String grade;

  public Person(int a, String n, String gr) {
    age = a;
    name = n;
    grade = gr;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public String getGrade() {
    return grade;
  }
}
