package com.codegnan;

import java.util.Arrays;

public class Employee {

	public static void main(String[] args) {
		int array[] = {1000,2000,8000,30};
		int sorted[] = array.clone();
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(array[array.length-1]);

	}
}
