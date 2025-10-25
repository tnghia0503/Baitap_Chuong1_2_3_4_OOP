package bai1chuong3;

import java.util.Scanner;

public class TestHinhChuNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dai: ");
		double chieuDai = sc.nextDouble();
		System.out.println("rong: ");
		double chieuRong = sc.nextDouble();
		HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
		System.out.println(hcn.toString());
	}

}
