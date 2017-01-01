package thirtyDaysOfCode;
// https://www.hackerrank.com/challenges/30-running-time-and-complexity
// Timeout on tc 7 & 8

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt(); // Nr of test cases
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			System.out.println(isPrime(n));
		}		
	}	
	
	private static String isPrime(int n) {
		if (n == 1) {
			return "Not prime";
		}
	    for(int i = 2; 2 * i <= n; i++) {
	        if(n % i == 0)
	            return "Not prime";
	    }
	    return "Prime";
	}
}
