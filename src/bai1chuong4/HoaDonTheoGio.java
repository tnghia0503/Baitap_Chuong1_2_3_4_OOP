package bai1chuong4;

import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDon {
	private int soGioThue;

	public HoaDonTheoGio(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia, int soGioThue) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		this.soGioThue = soGioThue;
	}

	public int getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(int soGioThue) {
		if (soGioThue <= 0) {
			throw new IllegalArgumentException("Khong hop le");
		}
		this.soGioThue = soGioThue;
	}

	public double thanhTien() {
		if (soGioThue > 30) {
			return 0;
		} else if (soGioThue > 24) {
			return 24 * getDonGia();
		} else {
			return soGioThue * getDonGia();
		}
	}

	@Override
	public String toString() {

		return super.toString() + String.format(" |  %-20s| %-20s", soGioThue, thanhTien());
	}

}
