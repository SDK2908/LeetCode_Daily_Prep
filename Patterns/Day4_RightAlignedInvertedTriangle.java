PATTERN 5
  
/*
Problem:
Given an integer N, print an inverted right-angled
triangle pattern of stars (*) with leading spaces.

Description:
Print a right-aligned inverted star pattern with N rows.

Example:
Input:
5

Output:
* * * * *
  * * * *
    * * *
      * *
        *

*/

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--) {
            for(int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
