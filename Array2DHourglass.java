import java.util.*;
import java.io.*;

public class Array2DHourglass {
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
	}

	static int hourglassSum(int[][] arr) {
		int sum=0;
        for(int i=0;i<arr[0].length-2;i++){
            for(int j=0;j<arr[0].length-2;j++){
                arr[i][j]=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            }
        }
        sum=Integer.MIN_VALUE;

        for(int i=0;i<arr[0].length-2;i++){
            for(int j=0;j<arr[0].length-2;j++){
                if(arr[i][j]>=sum)sum=arr[i][j];
            }
        }
        return(sum);

    }
}