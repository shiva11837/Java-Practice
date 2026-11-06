package com.codegnan.java;
import java.util.*;
public class Number {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter size of a array");
		int n = s.nextInt();
		int array[] = new int[n];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			System.out.println("enter elements in array to add");
			array[i] = s.nextInt();
			if(array[i]>max) {
				max = array[i];
			}
			if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.println("maximum value is "+max);
		System.out.println("minimum value is"+min);
		s.close();
	}
}
