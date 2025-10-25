package bai3bchuong3;

import java.time.LocalDate;

public class TestHangThucPham {
	public static void main(String[] args) {
		HangThucPham htp1 = new HangThucPham("MH1", "Giay", 200000, LocalDate.of(2020, 3, 5), LocalDate.of(2027, 3, 5));
		HangThucPham htp2 = new HangThucPham("MH2", "Thuoc", 300000, LocalDate.of(2020, 4, 5),
				LocalDate.of(2027, 4, 5));
		HangThucPham htp3 = new HangThucPham("MH3", "Keo", 400000, LocalDate.of(2020, 5, 5), LocalDate.of(2027, 5, 5));
		System.out.println(String.format("%-20s | %-20s | %-20s | %-20s | %-20s", "Mahang", "Tenhang", "Dongia",
				"NgaySanXuat", "NgayHetHan"));
		System.out.println(htp1);
		System.out.println(htp2);
		System.out.println(htp3);
	}
}
