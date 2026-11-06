package com.codegnan;

import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of an array");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter elements");
			arr[i] = s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
