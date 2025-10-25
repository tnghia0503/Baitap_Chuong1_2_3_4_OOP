package bai2chuong3;

import java.util.Scanner;

public class TestSinhVien {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SinhVien sv1 = new SinhVien(11111, "Nguyễn Thanh An", 6.5f, 8.5f);
		SinhVien sv2 = new SinhVien(22222, "Lê Thị Bông", 7.5f, 8.0f);
		SinhVien sv3 = new SinhVien();
		System.out.println("Nhập mã số của sinh viên sv3: ");
		int masv = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập họ và tên của sinh viên sv3: ");
		String hoten = sc.nextLine();
		System.out.println("Nhập điểm lý thuyết của sinh viên sv3: ");
		double diemlt = sc.nextDouble();
		System.out.println("Nhập điểm thực hành của sinh viên sv3: ");
		double diemth = sc.nextDouble();
		sv3.setMaSV(masv);
		sv3.setHoVaTen(hoten);
		sv3.setDiemLT(diemlt);
		sv3.setDiemLT(diemth);
		System.out.println(String.format("%-5s %-30s %10s %10s %10s", "masv", "hoten", "diemlt", "diemth", "diemtb"));
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		sc.close();
	}
}