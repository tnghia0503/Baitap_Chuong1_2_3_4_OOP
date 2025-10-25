package chuong2;

import java.util.Scanner;

public class Bai24trang24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N=");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("so" + i + ":");
			int x = sc.nextInt();
			sum += x;

		}
		System.out.println(sum);
		sc.close();
	}

}
