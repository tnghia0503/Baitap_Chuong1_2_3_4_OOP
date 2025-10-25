package bai1chuong4;

import java.time.LocalDate;
import java.util.ArrayList;

public class QuanLyHoaDon {
	private ArrayList<HoaDon> danhSach = new ArrayList<>();

	public void themHoaDon(HoaDon hd) {
		danhSach.add(hd);
	}

	public void xuatDanhSach() {

		for (HoaDon hd : danhSach) {
			System.out.println(hd + " | Thành tiền: " + hd.thanhTien());
		}

	}

	public void soLuong() {
		int demGio = 0;
		int demNgay = 0;
		for (HoaDon hd : danhSach) {
			if (hd instanceof HoaDonTheoGio)
				demGio++;
			else if (hd instanceof HoaDonTheoNgay)
				demNgay++;
		}
		System.out.println("Tổng HĐ theo giờ: " + demGio);
		System.out.println("Tổng HĐ theo ngày: " + demNgay);
	}

	public double tinhTrungBinh() {
		double sum = 0;
		int count = 0;
		for (HoaDon hd : danhSach) {
			LocalDate LocalDate = hd.getNgayHD();
			if (LocalDate.getMonthValue() == 9 && LocalDate.getYear() == 2013) {
				sum = sum + hd.thanhTien();
				count++;
			}
		}
		return count == 0 ? 0 : sum / count;
	}

}
