/** // https://www.hackerrank.com/challenges/30-nested-logic
 * 
 * 1. If the book is returned on or before the expected return date, no fine will be charged (fine = 0).
 * 2. If the book is returned after the expected return day but still within the same calendar month and year 
 * as the expected return date, fine = 15 hackos x nr of days late
 * 3. If the book is returned after the expected return month but still within the same calendar year as the expected return date, 
 * fine = 500 hackos x nr of months late
 * 4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 hackos.
 * 
In:
31 12 2009
1 1 2010
Out: 0
In:
31 8 2004
20 1 2004
Out: 3500
 * 
 */

package thirtyDaysOfCode;

import java.io.*;
import java.util.*;

public class NestedLogic {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int fine = 0;
    	
    	// Actual and expected return date, format day month year
    	int actualDay = in.nextInt();
    	int actualMonth = in.nextInt();
    	int actualYear = in.nextInt();
    	int expectedDay = in.nextInt();
    	int expectedMonth = in.nextInt();
    	int expectedYear = in.nextInt();
        
		int monthsLate = actualMonth - expectedMonth;
		int daysLate = actualDay - expectedDay;
		int yearsLate = actualYear - expectedYear;
    	
    	if (yearsLate > 0) {
    		fine = 10000;
    	} else if ( actualYear == expectedYear) {	
    		if (monthsLate > 0) {
    		fine = (monthsLate * 500);
    		} if (monthsLate == 0 && daysLate > 0) {
    		fine = (daysLate * 15);
    		}
    	}	
    	System.out.println(fine);
    }
}
