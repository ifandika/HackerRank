import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
  /*
   * Complete the 'rotateLeft' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   * 1. INTEGER d
   * 2. INTEGER_ARRAY arr
   */
  public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
    // Declare variabel that need
    int n = arr.size();
    List<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));

    for(int i = 0; i < n; i++) {
      // new_index = (i - d + n) % n
      int newIndex = ((i - d + n) % n);
      result.set(newIndex, arr.get(i));
    }
    return result;
  }
}

public class Easy_LeftRotation {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Github\\Hackerrank\\Data-Structures\\input.txt"));
    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    int n = Integer.parseInt(firstMultipleInput[0]);
    int d = Integer.parseInt(firstMultipleInput[1]);
    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());
    List<Integer> result = Result.rotateLeft(d, arr);
    bufferedWriter.write(
        result.stream()
            .map(Object::toString)
            .collect(joining(" "))
            + "\n");
    bufferedReader.close();
    bufferedWriter.close();
  }
}
