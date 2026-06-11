STRONG NUMBER
/*
Problem:
Given an integer N, determine whether it is a
strong number or not.

A strong number is a number that is equal to the
sum of the factorials of its digits.

Example 1:
Input:
145

Output:
It is a strong number

Explanation:
Digits of 145 are 1, 4, and 5.
1! + 4! + 5!
= 1 + 24 + 120
= 145

Hence, 145 is a strong number.

Example 2:
Input:
123

Output:
It is not a strong number

Explanation:
Digits of 123 are 1, 2, and 3.
1! + 2! + 3!
= 1 + 2 + 6
= 9

Since 9 ≠ 123,
123 is not a strong number.

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ori_num = n;
        int sum = 0;
        while (n > 0) {
            sum += fact(n % 10);
            n /= 10;
        }
        if (sum == ori_num) {
            System.out.println("It is a strong number");
        } else {
            System.out.println("It is not a strong number");
        }
    }

    public static int fact(int num) {
        int fact = 1;
        if (num == 0 || num == 1) {
            return fact;
        }
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
