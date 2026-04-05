package com.Skillio;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 3, 56, 45, 1, 29 };
		System.out.println("Enter your number:");
		int number = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				System.out.println("Index Of " + number + " is:" + i);
				found = true;
			}
		}
		if (found == false) {
			System.out.println(+number + " is not found");
		}
	}
}
