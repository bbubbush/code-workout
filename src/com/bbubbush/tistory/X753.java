package com.bbubbush.tistory;

public class X753 {
  public boolean ageMath2() {
    Person personC = new Person(6, "Franky", "A"); // Question
    Person personA = new Person(15, "Anne", "B"); // Question
    Person personB = new Person(10, "Ben", "F");

    if (personA.getAge() > personB.getAge()) {
      if (personA.getAge() > personC.getAge()) {
        return true;
      }
    }
    return false;
  }
  class Person {
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
}

