package chuong2;

import java.util.Scanner;

public class Bai13trang24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n= ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;

		}
		System.out.println(sum);
	}

}
