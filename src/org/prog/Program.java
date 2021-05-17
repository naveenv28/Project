package org.prog;

import java.util.*;

public class Program {
	public static void main(String[] args) {
		System.out.println("Naveen Task");
  
		System.out.println("kumar Task");

  System.out.println("N Task2");
		System.out.println("Array elements are added in List");
		int a[] = { 10, 20, 10, 20, 30, 43, 2, 34, 52, 12, 98 };
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
		System.out.println("OUTPUT");
		List<Integer> li = new LinkedList<>();
		for (int i = 0; i < a.length - 1; i++) {
			li.add(a[i]);
		}
		System.out.println("LIST:" + li);
		System.out.println();
		List<Integer> list = new LinkedList<Integer>();
		list.add(31);
		list.add(12);
		list.add(34);
		list.add(98);
		list.add(56);
		System.out.println("List of elements are added in array");
		System.out.println(list);
		System.out.println("OUTPUT:");
		int b[] = new int[list.size()];
		for (int j = 0; j < list.size(); j++) {
			b[j] = list.get(j);
			System.out.println("b[" + j + "]=" + b[j]);
		}
	}
}

//		String s = "Welcome to today's java java class class";
//		String[] sp = s.split(" ");
//		String r = "";
//		for (String c : sp) {
//			if (!r.contains(c)) {
//				r = r + c;
//				r = r + " ";
//			}
//		}
//		System.out.println(r);
//	}
//}
//		int i, j;
//		for (i = 1; i <= 5; i++) {
//			for (j = 1; j <= 5; j++) {
//				if (j <= i)
//					System.out.print("*");
//				else
//					System.out.print("");
//			}
//			System.out.println("");
//		}
//		System.out.println();
//		int space;
//		int num = 5;
//		space = num - 1;
//		for (int a = 1; a <= num; a++) {
//			for (space = 1; space <= (num - a); space++) {
//				System.out.print(" ");
//			}
//			for (int b = 1; b <= a; b++) {
//				System.out.print("*");
//			}
//			for (int k = (a - 1); k >= 1; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
//	int count = 5;
//	for(int g = 1;g<=count;g++)
//	{
//		for (int h = 1; h <= g; h++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//}}