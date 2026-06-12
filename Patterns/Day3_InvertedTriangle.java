PATTERN 4

/*
Problem:
Given an integer N, print an inverted right-angled
triangle pattern consisting of stars (*).

Example:
Input:
4

Output:
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
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
