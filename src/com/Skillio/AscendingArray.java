package com.Skillio;

public class AscendingArray {
	public static void main(String[] arg) {
		int[] arr = { 25, 7, 45, 1, 90 };
		int extra = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					extra = arr[i];
					arr[i] = arr[j];
					arr[j] = extra;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
