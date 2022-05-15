package com.bbubbush.tistory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class X251 {
  public static void main(String[] args) {
    String str;
    str = "is-"; // 1:1
    System.out.println("[str = " + str + "]");
    System.out.println(notReplace(str));

    str = "is-is"; // 2:1
    System.out.println("[str = " + str + "]");
    System.out.println(notReplace(str));

    str = "This is isabell"; // 3:2
    System.out.println("[str = " + str + "]");
    System.out.println(notReplace(str));
  }

  public static String notReplace(String str) {
    String splitWord = str.replaceAll("[a-zA-Z0-9]", "");
    String[] split = str.split("\\s|\\W");

    List<String> changedWords = Arrays.stream(split)
      .map(word -> "is".equals(word) ? "is not" : word)
      .collect(Collectors.toList());
    StringBuilder stringBuilder = new StringBuilder(changedWords.get(0));

    int splitWordsIndex = 0;
    for (int i = 1; i < changedWords.size(); i++) {
      stringBuilder
        .append(splitWord.charAt(splitWordsIndex))
        .append(changedWords.get(i));
      splitWordsIndex++;
    }

    for (int i = splitWordsIndex; i < splitWord.length(); i++) {
      stringBuilder.append(splitWord.charAt(i));
    }

    return stringBuilder.toString();
  }


}
