package bai3chuong3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestVehicle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Vehicle> danhSach = new ArrayList<>();
		int choice;
		do {
			System.out.println("MENU");
			System.out.println("1. Nhập thông tin");
			System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
			System.out.println("3. Thoát");
			System.out.println("Nhap: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				nhapDanhSachXe(sc, danhSach);
				break;
			case 2:
				xuatDanhSachXe(danhSach);
				break;
			case 3:
				System.out.println("da thoat");
				break;
			default:
				System.out.println("khong hop le");
			}

		} while (choice != 3);
		sc.close();
	}

	private static void nhapDanhSachXe(Scanner sc, ArrayList<Vehicle> danhSach) {
		System.out.println("Nhap so luong");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Nhap thong tin xe thu" + i + " la:");
			System.out.println("Ten chu so xe: ");
			String tenChuXe = sc.nextLine();
			System.out.println("Loai xe: ");
			String loai = sc.nextLine();
			System.out.println("Gia xe: ");
			double triGia = sc.nextDouble();
			System.out.println("Dung tich: ");
			int dungTich = sc.nextInt();
			sc.nextLine();
			danhSach.add(new Vehicle(tenChuXe, triGia, dungTich, loai));
			// TODO Auto-generated method stub
		}
		System.out.println("Da them");
	}

	private static void xuatDanhSachXe(ArrayList<Vehicle> danhSach) {
		if (danhSach.isEmpty()) {
			System.out.println("Chua co thong tin xe nao");
			return;
		}
		System.out.println("Bảng kê khai tiền thuế trước bạ của các xe");
		System.out.println("=======================================================");
		System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia",
				"Thue phai nop");

		for (Vehicle xe : danhSach) {
			System.out.println(xe);
		}
		// TODO Auto-generated method stub

	}

}
