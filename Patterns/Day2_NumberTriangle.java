PATTERN 3

/*
Problem:
Given an integer N, print a right-angled triangle
pattern where each row contains numbers from 1
to the row number.

Example:
Input:
5

Output:

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
