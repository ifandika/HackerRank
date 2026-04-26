/**
 * - Jika brand <= 1 & toko > 1 maka return 0
 */

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
     * Complete the 'processScheduling' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER n
     */

    public static int processScheduling(int k, int n) {
        // Write your code here
        int res = 0;
        for(int i = 0; i < n*2; i++)  {

        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan =  new Scanner(System.in);
        int k =  scan.nextInt();
        int n =  scan.nextInt();

        int result = Result.processScheduling(k, n);

        System.out.println(result);
    }
}
