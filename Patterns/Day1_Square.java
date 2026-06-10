PATTERN 1

/*
Input: 
N = 6

Output:
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 

Print an N × N square pattern of stars.
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=0; j<n; j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
