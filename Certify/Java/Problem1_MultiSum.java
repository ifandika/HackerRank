import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Arithmetic {
  public static Integer sum(Integer[] ints) {
    int sum = 0;
    for(int i = 0; i < ints.length; i++) {
      sum += ints[i];
    }
    return sum;
  }

  public static String sum(String[] strs) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < strs.length; i++) {
      sb.append(strs[i]);
    }
    return sb.toString();
  }
}

public class Problem1_MultiSum {
  public static void main(String args[]) throws Exception {
    Arithmetic arithmetic = new Arithmetic();

    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] values = line.split(" ");

    // check if int array
    try {
      Integer.parseInt(values[0]);

      // System.out.println("Integer array");
      Integer[] ia = new Integer[values.length];
      for (int i = 0; i < values.length; i++) {
        ia[i] = new Integer(values[i]);
      }
      System.out.println(arithmetic.sum(ia));
    } catch (NumberFormatException nfe) {
      // then string array

      // System.out.println("String array");
      System.out.println(arithmetic.sum(values));
    }
  }
}