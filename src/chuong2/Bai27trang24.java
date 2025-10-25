package chuong2;

import java.util.Scanner;

public class Bai27trang24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n: ");
		int n = sc.nextInt();

		int f1 = 1, f2 = 1;
		System.out.print("day fibonacci:  ");

		if (n >= 1)
			System.out.print(f1 + " ");
		if (n >= 2)
			System.out.print(f2 + " ");

		for (int i = 3; i <= n; i++) {
			int fn = f1 + f2;
			System.out.print(fn + " ");
			f1 = f2;
			f2 = fn;
		}

		sc.close();
	}

}
