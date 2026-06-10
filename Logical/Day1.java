PERFECT NUMBER
/*
Problem:
Given an integer N, determine whether it is a
perfect number or not.

A perfect number is a number that is equal to the
sum of its proper divisors (excluding itself).

Example 1:
Input:
6

Output:
It is a perfect number!

Explanation:
Proper divisors of 6 are 1, 2, and 3.
1 + 2 + 3 = 6

Example 2:
Input:
10

Output:
It is not a perfect number!

*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(sum == n){
            System.out.println("It is a perfect number!");
        }
        else{
            System.out.println("It is not a perfect number!");
        }
    }
}
