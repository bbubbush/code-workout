package com.bbubbush.tistory;

public class X158 {
  public static void main(String[] args) {
    int bunnies;
    bunnies = 3;
    System.out.printf("[bunnies == %s]\n%s\n", bunnies, bunnyEars2(bunnies));
    bunnies = 5;
    System.out.printf("[bunnies == %s]\n%s\n", bunnies, bunnyEars2(bunnies));
    bunnies = 9;
    System.out.printf("[bunnies == %s]\n%s\n", bunnies, bunnyEars2(bunnies));
  }

  public static int bunnyEars2(int bunnies) {
    if (bunnies == 0) {
      return 0;
    }
    StringBuilder s = new StringBuilder("");
    s.toString();
    return (bunnies % 2 != 0 ? 2 : 3) + bunnyEars2(bunnies - 1);
  }
}
