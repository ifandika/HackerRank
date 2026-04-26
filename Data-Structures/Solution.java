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
   * Complete the 'hourglassSum' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
    // Max is : -63 or 63
    // 9 9 9
    //   9
    // 9 9 9 => 63 or -63
    // Declare final max value of hourglass
    int maxHourglassValue = 0;

    // Loop for 2D Array with limit to 3
    for(int lop1 = 0; lop1 <= 3; lop1++) {
      for(int lop2 = 0; lop2 <= 3; lop2++) {
        // formula
        // (n) + (x+1) + (x+2)
        //      (n+1 x+1)
        // (n+2) + (n+2 x+1) + (n+2 x+2)
        int a = arr.get(lop1).get(lop2);
        int b = arr.get(lop1).get(lop2+1);
        int c = arr.get(lop1).get(lop2+2);
        
        int d = arr.get(lop1+1).get(lop2+1);

        int e = arr.get(lop1+2).get(lop2);
        int f = arr.get(lop1+2).get(lop2+1);
        int g = arr.get(lop1+2).get(lop2+2);
        
        int currentValueHourglass = (a + b + c + d + e + f + g);

        if(currentValueHourglass > maxHourglassValue) {
          maxHourglassValue = currentValueHourglass;
        }
      }
    }

    // return max value of hourglass from 2D Array
    return maxHourglassValue;
  }
}

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    List<List<Integer>> arr = new ArrayList<>();

    IntStream.range(0, 6).forEach(i -> {
      try {
        arr.add(
            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList()));
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    int result = Result.hourglassSum(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
