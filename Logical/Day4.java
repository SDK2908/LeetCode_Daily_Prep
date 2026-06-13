HARSHAD NUMBER
/*
Problem:
Given an integer N, determine whether it is a
Harshad number or not.

A Harshad number (also called a Niven number) is a
number that is divisible by the sum of its digits.

Example 1:
Input:
18

Output:
It is a Harshad Number

Explanation:
Digits of 18 are 1 and 8.
Sum of digits = 1 + 8 = 9

18 ÷ 9 = 2

Since 18 is divisible by the sum of its digits,
18 is a Harshad number.

Example 2:
Input:
19

Output:
It is not a Harshad Number

Explanation:
Digits of 19 are 1 and 9.
Sum of digits = 1 + 9 = 10

19 ÷ 10 = 1.9

Since 19 is not divisible by the sum of its digits,
19 is not a Harshad number.

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ori_num = n;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (ori_num % sum == 0) {
            System.out.println("It is a Harshad Number");
        } 
        else {
            System.out.println("It is not a Harshad Number");
        }
    }
}
