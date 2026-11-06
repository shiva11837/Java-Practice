package com.codegnan;

public class Student {
	public static void main(String [] args) {
		int marks[]= {10,20,5,2,6};
		int sum = 0;
		int max = marks[0];
		int min = marks[0];
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
			if(marks[i]<min) {
			    min = marks[i];
			}
			if(marks[i]>max) {
				max = marks[i];
			}
	}
	int avg = sum/marks.length;
	System.out.println("total marsk " + sum);
	System.out.println("total avg marsk " + avg);
	System.out.println("max marsk " + max);
	System.out.println("min marsk " + min);
}
}