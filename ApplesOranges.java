/**
 * Solution for Apple and Orange: https://www.hackerrank.com/contests/w24/challenges/apple-and-orange
 * Created on 10-10-2016
 * @author Marit van Dijk
 */

package WeekOfCode24;

import java.util.*;

public class ApplesOranges {

    public static void main(String[] args) {
        int apples = 0;
        int oranges = 0;
        
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if (apple[apple_i] + a >= s && apple[apple_i] + a <= t){
                apples++;
            }
            
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if (orange[orange_i] + b >= s && orange[orange_i] + b <= t){
                oranges++;
            }
        }
        
        System.out.println(apples);
        System.out.println(oranges);   
        
        in.close();
    }
    

}