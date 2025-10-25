package bai1chuong4;

import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon {
	private int soNgayThue;

	public HoaDonTheoNgay(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia, int soNgayThue) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		this.soNgayThue = soNgayThue;
	}

	public int getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(int soNgayThue) {
		if (soNgayThue <= 0) {
			throw new IllegalArgumentException("Khong phu hop");
		}
		this.soNgayThue = soNgayThue;
	}

	public double thanhTien() {
		if (soNgayThue <= 7) {
			return soNgayThue * getDonGia();
		} else {
			return 7 * getDonGia() + (soNgayThue - 7) * getDonGia() * 0.8;
		}
	}

	@Override
	public String toString() {

		return super.toString() + String.format(" |  %-20s| %-20s", soNgayThue, thanhTien());
	}

}
