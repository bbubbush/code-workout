package com.bbubbush.tistory;

public class X748 {
  public int getNumberBack(int value) {
    int returnValue = 3;
    if (value > 0 && value < 10) {
      returnValue = 1;
    } else if (value < 0) {
      returnValue = 2;
    } else {
      returnValue = 3;
    }
    return returnValue;
  }
}
