package chuong2;

import java.util.Scanner;

public class Bai23trang24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a=");
		int a = sc.nextInt();
		System.out.println("b=");
		int b = sc.nextInt();
		int uscln = Uscln(a, b);
		System.out.println("uoc so chung lon nhat la: " + uscln);
		sc.close();
	}

	private static int Uscln(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while (b != 0) {
			int c = b;
			b = a % b;
			a = c;

		}

		// TODO Auto-generated method stub
		return a;
	}

}
