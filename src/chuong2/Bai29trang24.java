package chuong2;

import java.util.Scanner;

public class Bai29trang24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("M=");
		int m = sc.nextInt();
		System.out.println("N=");
		int n = sc.nextInt();
		System.out.println("--------------------------------------");
		for (int h1 = 1; h1 <= m; h1++) {
			for (int hh1 = 1; hh1 <= n; hh1++) {
				if (hh1 <= h1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		for (int h3 = 1; h3 <= m; h3++) {
			for (int hh3 = 1; hh3 <= 2 * m - 1; hh3++) {
				if (hh3 == m - h3 + 1 || hh3 == m + h3 - 1 || h3 == m)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");

	}

}
