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
   * Complete the 'handshake' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER n as parameter.
   */
  public static int handshake(int n) { // Accepted
    /**
     * Handshake
     * Example
     * 3 attendees
     * The possibility:
     * p1 -> p2
     * p1 -> p3
     * p2 -> p3
     * So all participants shake hands
     * 
     * Is math combinations problem
     * So for formula is handshake = (n * (n - 1)) / 2
     * where n is total participants or attendees
     * 
     * Example
     * n = 12
     * handshake = (12 * (12 - 1)) / 2
     * handshake = (12 * 11) / 2
     * handshake = 132 / 2
     * handshake = 66
     * So the number of posibility handshake is 66
     */
    if(n <= 1) {
      return 0;
    }
    else {
      int handshake = (n * (n - 1)) / 2;
      return handshake;
    }
  }

}

public class E_Handshake {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int t = Integer.parseInt(bufferedReader.readLine().trim());
    IntStream.range(0, t).forEach(tItr -> {
      try {
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int result = Result.handshake(n);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    bufferedReader.close();
    bufferedWriter.close();
  }
}
