package com.codegnan;

public class LargeNum {

	public static void main(String[] args) {
		int arr[] = {10,30,20,5,8};
		int small = arr[0];
		for(int i:arr) {
			if(i<small) {
				small=i;
			}
		}System.out.println(small);
	}
}
