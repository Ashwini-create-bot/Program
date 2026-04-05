package com.Skillio;

import java.util.Iterator;

public class Array {
	public static void main(String[] args) {
		int[] arr = { 10, 6, 32, 4, 1, 24 };
		// printing array elements
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		// maximum number from array
		int max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = max;
			}
		}
		System.out.println("maximum number from array is:" + max);
		// minimum number from array
		int min = arr[0];
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("minimum number from array is:" + min);
		// addition of array
		int add = 0;
		for (int i = 0; i < arr.length; i++) {
			add = add + arr[i];
		}
		System.out.println("addition of array is:" + add);
		// average of array
		int avg = (add / arr.length);
		System.out.println("average of array is:" + avg);
		// search element and print its index
		int a = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				System.out.println(i);
			}
		}
	}

}
