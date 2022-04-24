package com.bbubbush.tistory;

public class X752 {
  public boolean ageMath() {
    Person personA = new Person(15, "Anne", "B"); // Question
    Person personB = new Person(10, "Ben", "F");
    if (personA.getAge() > personB.getAge()) {
      return true;
    }
    return false;
  }
}
