package chuong2;

import java.util.Scanner;

public class Bai17trang24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("so nguyen: ");
		int n = sc.nextInt();

		if (n == 0) {
			System.out.println("zero");
		} else if (n % 2 == 0) {
			System.out.println("chan");
		} else {
			System.out.println("le");
		}

		sc.close();

	}
}
