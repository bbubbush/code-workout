package com.bbubbush.tistory;

public class X115 {
  public int[] post4(int[] nums) {
    int indexOfLastFour = -1;
    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] == 4) {
        indexOfLastFour = i + 1;
        break;
      }
    }
    int[] result = new int[nums.length - indexOfLastFour];
    for (int i = 0; i < result.length; i++) {
      result[i] = nums[indexOfLastFour++];
    }
    return result;
  }
}
