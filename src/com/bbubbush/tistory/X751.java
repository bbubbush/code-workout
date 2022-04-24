package com.bbubbush.tistory;

public class X751 {
  public String getLetterGrade(int numberGrade) {
    String letter = "";

    if (numberGrade >= 90) {
      letter = "A";
    } else if (numberGrade >= 80) {
      letter = "B";
    } else if (numberGrade >= 70) {
      letter = "C";
      ;
    } else if (numberGrade >= 60) {
      letter = "D";
    } else if (numberGrade < 60) {
      letter = "F";
      ;
    }
    return letter;
  }
}
