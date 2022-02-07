package com.allProgram;

import java.util.Scanner;

public class Reverse_Numbers {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number....");

	    int num = Sc.nextInt();

		/*int rev = 0;

		while (num != 0)

		{
			rev = rev * 10 + num % 10;// 0 = 0*10 + 987654%10 =

			num = num / 10;

		}*/
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev  = sb.reverse();

		System.out.println("Reverse num..." + rev);

		
		
	}
}
