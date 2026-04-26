import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem2_Shape {
  public static void main(String args[]) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    Scanner scanner = new Scanner(System.in);

    int first = scanner.nextInt();
    int second = scanner.nextInt();

    System.out.println(first+" "+second);
    System.out.println(first * second);

    scanner.close();
  }
}