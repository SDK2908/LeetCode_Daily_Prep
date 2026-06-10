PATTERN 2
/*
Problem:
Given an integer N, print a right-angled triangle
pattern consisting of stars (*).

Example:
Input:
5

Output:
*
* *
* * *
* * * *
* * * * *

*/

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
