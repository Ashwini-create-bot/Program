package com.Skillio;

public class Mock {
	public static void main(String[] arg) {
		int[] arr = { 24, 2, 89, 5, 45, 1 };
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("maximum number from array is:" + max);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("minimum number from array is:" + min);
		int multiply = max * min;
		System.out.println("multiplication of minimum and maximum is :" + multiply);
	}

}
