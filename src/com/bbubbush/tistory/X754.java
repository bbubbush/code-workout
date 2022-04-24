package com.bbubbush.tistory;

public class X754 {
  public Person getOldest(Person personA, Person personB, Person personC) {
    if (personA == null && personB == null && personC == null) {
      return null;
    }

    if (personA != null && personB == null && personC == null) {
      return personA;
    } else if (personA == null && personB != null && personC == null) {
      return personB;
    } else if (personA == null && personB == null && personC != null) {
      return personC;
    }

    if (personA == null) {
      personA = new Person(0, null, null);
    }
    if (personB == null) {
      personB = new Person(0, null, null);
    }
    if (personC == null) {
      personC = new Person(0, null, null);
    }

    if (personA.getAge() >= personB.getAge()) {
      if (personA.getAge() >= personC.getAge()) {
        return personA;
      } else {
        return personC;
      }
    } else if (personB.getAge() >= personC.getAge()) {
      return personB;
    } else {
      return personC;
    }
  }
}
