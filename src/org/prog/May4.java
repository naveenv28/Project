package org.prog;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class May4 {
	public static void main(String[] args) {

		File f=new File("D:\\Eclipse Photon Workspace\\Costco.ca");
		long lastModified = f.lastModified();
		System.out.println(lastModified);
		Date d=new Date(lastModified);
		SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
		String format = s.format(d);
		System.out.println(format);
//		System.out.println("Palindrome or not?");
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter number");
//		int number = s.nextInt();
//		int temp = number;
//		int rev = 0, rem;
//		while (number > 0) {
//			rem = number % 10;
//			rev = (rev * 10) + rem;
//			number = number / 10;
//		}
//		if (temp == rev) {
//			System.out.println(temp + " is a palindrome");
//		} else {
//			System.out.println(temp + " is not a Palindrome");
//		}
//		System.out.println();
//		System.out.println("Enter number");
//		int a = s.nextInt();
//		System.out.println("Reversing number : " + a);
//		int rem1, rev1 = 0;
//		int digit = 0;
//		int sum = 0;
//		while (a > 0) {
//			rem1 = a % 10;
//			rev1 = rev1 * 10 + rem1;
//			a = a / 10;
//			digit = digit + 1;
//			sum = sum + rem1;
//		}
//		System.out.println("Reverse order : " + rev1);
//		System.out.println("No of digits : " + digit);
//		System.out.println("Sum of the digits : " + sum);
	}
}