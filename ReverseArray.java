package com.codegnan;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter size of an array");
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++) {
        	System.out.println("enter elements");
        	arr[i]=s.nextInt();
        }
        for(int i=0;i<size;i++){
        	System.out.println(arr[i]);
        }
        
	}

}
