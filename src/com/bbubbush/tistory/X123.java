package com.bbubbush.tistory;

public class X123 {
  public static void main(String[] args) {
    String str = "";
    str = "catdog";
    System.out.println("[str == " + str + "]");
    System.out.println(catDog(str));
    str = "catxxdogxxxdog";
    System.out.println("[str == " + str + "]");
    System.out.println(catDog(str));
    str = "";
    System.out.println("[str == " + str + "]");
    System.out.println(catDog(str));
  }

  public static boolean catDog(String str) {
    String catText = str;
    String dogText = str;
    int countOfCat = 0;
    int countOfDog = 0;
    while (catText.contains("cat")) {
      catText = catText.replaceFirst("cat", "");
      countOfCat++;
    }
    while (dogText.contains("dog")) {
      dogText = dogText.replaceFirst("dog", "");
      countOfDog++;
    }
    return countOfCat == countOfDog;
  }
}
