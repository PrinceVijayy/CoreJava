package Algorithms;

import java.util.Scanner;

public class _10_isPalindrome {
  public static void main(String[] args) {
    _10_isPalindrome obj = new _10_isPalindrome();
    System.out.println(obj.isPalindrome(121));
  }

  public boolean isPalindrome(int x) {
    boolean result = false;
    int input = x;
    int reminder;
    StringBuilder sum = new StringBuilder();
    sum.append(0);
    while (x > 0) {
      reminder = x % 10;
      sum.append(reminder);
      x = x / 10;
    }
    int a;
    try {
      a = Integer.parseInt(sum.toString());
    } catch (NumberFormatException e) {
      return false;
    }
    if (input == a) {
      result = true;
    }

    return result;
  }
}
