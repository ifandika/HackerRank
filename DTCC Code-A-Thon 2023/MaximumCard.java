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
     * Complete the 'calculateMaximumCards' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY cost
     *  2. INTEGER x
     */

    public static int calculateMaximumCards(List<Integer> cost, int x) {
        ArrayList<Integer> myCost = cost;
        int l = myCost.size();

        int temp;
        int index;
        int total;

        for(int i = 0; i < l; i++) {
            for(int k = i; k < l; k++) {
                temp += myCost.get(k);
                total += 
            }
        }
    }

    static int root(int n) {
        int res = n;
        for(int i = 1; i <= n; i++) {
            res = res * 
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int costCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> cost = IntStream.range(0, costCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int x = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.calculateMaximumCards(cost, x);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
