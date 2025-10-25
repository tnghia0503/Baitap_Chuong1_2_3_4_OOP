package chuong2;

import java.util.Scanner;

public class Bai20trang24 {

	public static int demSoKyTuSo(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				count++;
			}

		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("nhap : ");
		String s = sc.nextLine();

		int soLuong = demSoKyTuSo(s);

		System.out.println("ket qua: " + soLuong);

		sc.close();
	}
}
