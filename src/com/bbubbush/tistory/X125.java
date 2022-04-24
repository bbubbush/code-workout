package com.bbubbush.tistory;

public class X125 {
  public static void main(String[] args) {
    String word = "";
    String sep = "";
    int count = 0;
    word = "Word";
    sep = "X";
    count = 3;
    System.out.printf("[word = %s, sep = %s, count = %d]\n", word, sep, count);
    System.out.println(repeatSeparator(word, sep, count));

    word = "catdog";
    sep = "K";
    count = 5;


    System.out.println(repeatSeparator(word, sep, count));
  }

  public static String repeatSeparator(String word, String sep, int count) {
    if (count == 0) {
      return "";
    }

    StringBuffer sb = new StringBuffer(word);
    for (int i = 1; i < count; i++) {
      sb.append(sep);
      sb.append(word);
    }
    return sb.toString();
  }
}
