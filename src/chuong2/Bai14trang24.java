package chuong2;

import java.util.Scanner;

public class Bai14trang24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n= ");
		int n = sc.nextInt();
		int sum = 0;
		if (n % 2 == 0) {
			for (int i = 1; i <= n; i += 2) {
				sum += i;
			}
			System.out.println(sum);
		} else {
			for (int i = 2; i <= n; i += 2) {
				sum += i;
			}
			System.out.println(sum);

		}
	}

}
