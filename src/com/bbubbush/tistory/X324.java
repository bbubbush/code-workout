package com.bbubbush.tistory;

public class X324 {
  public static void main(String[] args) {
    int num = 0;
    num = 20;
    System.out.println("[num = " + num + "]");
    System.out.println(sumMultiples(num));

    num = 12;
    System.out.println("[num = " + num + "]");
    System.out.println(sumMultiples(num));
  }

  public static int sumMultiples(int num) {
    if (num < 0) {
      return 0;
    }

    int countOfNumbers = 100 / num;
    int multipleNumber = countOfNumbers * (countOfNumbers + 1) / 2;
    return num * multipleNumber;
  }
}
