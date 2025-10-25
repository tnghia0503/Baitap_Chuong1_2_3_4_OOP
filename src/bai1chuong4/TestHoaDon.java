package bai1chuong4;

import java.time.LocalDate;

public class TestHoaDon {
	public static void main(String[] args) {
		QuanLyHoaDon hd = new QuanLyHoaDon();
		String headerline = String.format("%-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s", "Ma hoa don",
				"Ngay hoa don", "Ten", "Ma phong", "Don gia", "So ngay/gio", "Thanh tien");
		System.out.println(headerline + "\n" + "-".repeat(200));

		hd.themHoaDon(new HoaDonTheoGio("HD1", LocalDate.of(2020, 9, 5), "THD1", "P1", 300, 20));
		hd.themHoaDon(new HoaDonTheoNgay("HD2", LocalDate.of(2020, 9, 3), "THD2", "P2", 200, 10));
		hd.themHoaDon(new HoaDonTheoGio("HD3", LocalDate.of(2020, 9, 20), "THD3", "P3", 400, 10));
		hd.xuatDanhSach();
		hd.soLuong();
		hd.tinhTrungBinh();

	}
}
