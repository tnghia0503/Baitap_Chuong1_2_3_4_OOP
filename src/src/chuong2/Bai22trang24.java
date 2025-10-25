package chuong2;

import java.util.Scanner;

public class Bai22trang24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("so nguyen to: ");
		int n = sc.nextInt();
		if (soNguyenTo(n)) {
			System.out.println("la so nguyen to");
		} else {
			System.out.println("khong la so nguyen to");
		}
		sc.close();
	}

	private static boolean soNguyenTo(int n) {
		if (n < 2)
			// TODO Auto-generated method stub
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;

		}
		return true;
	}
}
