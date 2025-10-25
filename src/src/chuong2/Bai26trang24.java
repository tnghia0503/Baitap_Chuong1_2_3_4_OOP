package chuong2;

import java.util.Scanner;

public class Bai26trang24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N=");
		int n = sc.nextInt();
		int sum = 0;
		int count = 0;
		int a = 2;
		while (count < n) {
			if (soNguyenTo(a)) {
				sum += a;
				count++;

			}
			a++;
		}
		System.out.println(sum);
	}

	private static boolean soNguyenTo(int a) {
		if (a < 2)

			// TODO Auto-generated method stub
			return false;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0)
				return false;

		}
		return true;
	}
}
