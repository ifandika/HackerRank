/**
 * Ketetuan
 * - Username terdiri antara 8-30 karkter
 * - Jika username < 8 atau > 30 maka invalid
 * - Username hanya beris simbol (_), lowercase [a-z], dan upperase [A-Z] dan nilai [0-9].
 * - Awalan username hanya boleh berisi [a-z] dan [A-Z].
 * 
 * 
 * 
 */

import java.util.*;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z][\\w]{7,29}$";
}

public class ValidUsernameChecker {
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
	}
}