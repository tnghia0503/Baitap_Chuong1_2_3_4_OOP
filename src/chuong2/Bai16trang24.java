package chuong2;

import java.util.Scanner;

public class Bai16trang24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a= ");
		double a = sc.nextDouble();

		System.out.print("b= ");
		double b = sc.nextDouble();

		if (a == 0) {
			if (b == 0) {
				System.out.println("vo so nghiem");
			} else {
				System.out.println("vo nghiem");
			}
		} else {
			double x = -b / a;
			System.out.println(" x = " + x);
		}

		sc.close();
	}

}
