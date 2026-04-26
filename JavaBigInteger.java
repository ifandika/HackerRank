/**
 * Masalah
 * - Diberikan array string berisi nilai.
 * - Urutkan nilai dari besar ke kecil secara menurun.
 * 
 * Input
 * 		9
 * 		-100	-> Terkecil
 * 		50
 * 		0
 * 		56.6
 * 		90		-> Terbesar
 * 		0.12
 * 		.12
 * 		02.34
 * 		000.000
 * 
 * Output
 * 		90
 * 		56.6
 * 		50
 * 		02.34
 * 		0.12
 * 		.12
 * 		0
 * 		000.000
 * 		-100
 */

import java.math.BigDecimal;
import java.util.*;

public class JavaBigInteger {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] s = new String[n];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        for(int a = 1; a < n; a++) {
        	for(int b = a; b >= 1; b--) {
        		if(new BigDecimal(s[b]).compareTo(new BigDecimal(s[b-1])) > 0) {
        			String temp = s[b];
        			s[b] = s[b-1];
        			s[b-1] = temp;
        		}
        		else {
        			break;
        		}
        	}
        }

        //Output
        for(int i=0;i<n;i++) {
            System.out.println(s[i]);
        }
	}
}