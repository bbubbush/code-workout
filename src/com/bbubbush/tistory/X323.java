package com.bbubbush.tistory;

public class X323 {
  public static void main(String[] args) {
    int low = 0;
    int high = 0;
    low = 12;
    high = 18;
    System.out.println("[low == " + low + ", high == " + high + "]");
    System.out.println(sumRange(low, high));

    low = 10;
    high = 108;
    System.out.println("[low == " + low + ", high == " + high + "]");
    System.out.println(sumRange(low, high));
  }

  public static int sumRange(int low, int high) {
    if (low > high) {
      return 0;
    }

    long sumOfHigh = high * (high + 1) / 2L;
    long sumOfLow = low * (low + 1) / 2L;
    return (int) (sumOfHigh - sumOfLow + low);
  }
}
