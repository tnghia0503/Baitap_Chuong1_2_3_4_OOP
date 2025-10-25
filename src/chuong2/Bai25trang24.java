package chuong2;

import java.util.Scanner;

public class Bai25trang24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N=");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (soNguyenTo(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
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
