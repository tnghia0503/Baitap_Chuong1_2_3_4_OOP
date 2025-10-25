package chuong2;

import java.util.Scanner;

public class Bai15trang24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("day: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];

			}
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}

}
