package org.prog;

public class ConstructorChain {
	public static void main(String[] args) {
		 int arr[] = new int [5];

		 arr[0]=2;
		 arr[1]=1;
		 arr[2]=2;
		 arr[3]=1; 
		 arr[4]=1;
		 for (int i : arr) {
			
			 System.out.println(arr[i]);
		}
	}
//	// default constructor
//	ConstructorChain() {
//		this("first");
//		System.out.println("Default constructor called.");
//	}
//
//	// parameterized constructor
//	ConstructorChain(double str) {
//		System.out.println("Parameterized constructor called " + str);
//	}
//
//	// parameterized constructor
//	ConstructorChain(String str) {
//		this(123);
//		System.out.println("Parameterized constructor called " + str);
//	}
//
//	// parameterized constructor
//	ConstructorChain(int str) {
//		this(7.00);
//		System.out.println("Parameterized constructor called " + str);
//	}
//
//	// main method
//	public static void main(String args[]) {
//		// initializes the instance of example class
//		new ConstructorChain();
//	}
}
