package com.bbubbush.tistory;

public class X2 {
  public boolean lessBy10(int a, int b, int c) {
    int max = Math.max(Math.max(a, b), c);
    int min = Math.min(Math.min(a, b), c);
    return max - min >= 10;
  }
}
