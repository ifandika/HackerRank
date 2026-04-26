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
    // If all value is 9, so 9 x 7 = 63 or -63, must be negative because must be change to new sum value
    int sumTotal = -67;
    for(int lop1 = 0; lop1 <= 3; lop1++) {
      for(int lop2 = 0; lop2 <= 3; lop2++) {
        int sumCurrent = (arr.get(lop1).get(lop2) + arr.get(lop1).get(lop2 + 1) + arr.get(lop1).get(lop2 + 2)) + 
          (arr.get(lop1 + 1).get(lop2 + 1)) +
          (arr.get(lop1 + 2).get(lop2) + arr.get(lop1 + 2).get(lop2 + 1) + arr.get(lop1 + 2).get(lop2 + 2));

        if(sumCurrent > sumTotal) {
          sumTotal = sumCurrent;
        }
      }
    }
    return sumTotal;
  }
}

public class Easy_2DArray {
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
      }
      catch (IOException ex) {
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
