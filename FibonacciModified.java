/**
 * Solution for Fibonacci Modified: https://www.hackerrank.com/challenges/fibonacci-modified
 * Created on 25-10-2016
 * @author Marit van Dijk
 */

package algorithms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciModified {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long t1 = sc.nextInt();
		long t2 = sc.nextInt();
		int n = sc.nextInt();

		List<BigInteger> fib = new ArrayList<>();
		fib.add(BigInteger.valueOf(t1));
		fib.add(BigInteger.valueOf(t2));
		
		for (int i = 0; i < n - 2; i++){
			BigInteger t = fib.get(i).add((fib.get(i+1).pow(2)));
			fib.add(t);
		}
		
		System.out.println(fib.get(n - 1));
	}

}
