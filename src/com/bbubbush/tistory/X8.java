package com.bbubbush.tistory;

public class X8 {
  public String seeColor(String str) {
    final String RED = "red";
    final String BLUE = "blue";
    if (str.startsWith(RED)) {
      return RED;
    }
    if (str.startsWith(BLUE)) {
      return BLUE;
    }
    return "";
  }
}
