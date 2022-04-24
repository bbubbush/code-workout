package com.bbubbush.tistory;

import java.util.Arrays;
import java.util.stream.Collectors;

public class X119 {
  public static void main(String[] args) {
    int n;

    n = 3;
    System.out.printf("[n = %d]\n", n);
    printArray(squareUp(n));
    n = 5;
    System.out.printf("[n = %d]\n", n);
    printArray(squareUp(n));
    n = 9;
    System.out.printf("[n = %d]\n", n);
    printArray(squareUp(n));
  }

  public static int[] squareUp(int n) {
    int[] result = new int[n * n];
    int value = 0;
    int maxValue = n + 1;
    for (int i = result.length; i > 0; i--) {
      if (i % n == 0) {
        value = 1;
        maxValue--;
      }
      if (maxValue >= value) {
        result[i - 1] = value++;
      } else {
        result[i - 1] = 0;
      }
    }
    return result;
  }

  private static void printArray(int[] arr) {
    String strArr = Arrays.stream(arr)
      .mapToObj(String::valueOf)
      .collect(Collectors.joining(", "));

    System.out.println(strArr);
  }
}
