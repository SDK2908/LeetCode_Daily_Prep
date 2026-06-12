ARMSTRONG NUMBER
/*
Problem:
Given an integer N, determine whether it is an
Armstrong number or not.

An Armstrong number is a number that is equal to
the sum of its digits each raised to the power
of the total number of digits.

Example 1:
Input:
153

Output:
It is an Armstrong number

Explanation:
Number of digits in 153 = 3

1³ + 5³ + 3³
= 1 + 125 + 27
= 153

Hence, 153 is an Armstrong number.

Example 2:
Input:
123

Output:
It is not an Armstrong number

Explanation:
Number of digits in 123 = 3

1³ + 2³ + 3³
= 1 + 8 + 27
= 36

Since 36 ≠ 123,
123 is not an Armstrong number.

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int ori_num = n;
        int count = 0;

        // Counting the number of digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // calculate the sum of digits raised to the power of count
        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, count);
            n /= 10;
        }

        if (sum == ori_num) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }
    }
}
