package chuong2;

import java.util.Scanner;

public class Bai19trang24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("nhap: ");
		String n = sc.nextLine();

		int count = 0;

		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == 'a') {
				count++;
			}
		}

		System.out.println("so lan ky tu a: " + count);

		sc.close();
	}
}
