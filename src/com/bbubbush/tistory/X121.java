package com.bbubbush.tistory;

public class X121 {
  public static void main(String[] args) {
    String str = "";

    str = "Hello";
    System.out.printf("[str = %s]\n", str);
    System.out.println(extraEnd(str));
    str = "Hi";
    System.out.printf("[str = %s]\n", str);
    System.out.println(extraEnd(str));
    str = "Candy";
    System.out.printf("[str = %s]\n", str);
    System.out.println(extraEnd(str));
  }

  public static String extraEnd(String str) {
    return str.substring(str.length() - 2).repeat(3);
  }
}
