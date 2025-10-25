package chuong4;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HoaDon {
	private String maHD;
	private LocalDate ngayHD;
	private String tenKH;
	private String maPhong;
	private double donGia;

	public HoaDon() {
	}

	public HoaDon(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia) {
		setMaHD(maHD);
		setNgayHD(ngayHD);
		setTenKH(tenKH);
		setMaPhong(maPhong);
		setDonGia(donGia);
	}

	public String getMaHD() {
		return maHD;
	}

	public LocalDate getNgayHD() {
		return ngayHD;
	}

	public String getTenKH() {
		return tenKH;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setMaHD(String maHD) {
		if (maHD == null || maHD.isBlank()) {
			throw new IllegalArgumentException("Khong hop le");
		}
		this.maHD = maHD;
	}

	public void setNgayHD(LocalDate ngayHD) {
		if (ngayHD == null) {
			throw new IllegalArgumentException("Khong hop le");
		}
		this.ngayHD = ngayHD;
	}

	public void setTenKH(String tenKH) {
		if (tenKH == null || tenKH.isBlank()) {
			throw new IllegalArgumentException("Khong hop le");
		}
		this.tenKH = tenKH;
	}

	public void setMaPhong(String maPhong) {
		if (maPhong == null || maPhong.isBlank()) {
			throw new IllegalArgumentException("Khong hop le");
		}
		this.maPhong = maPhong;
	}

	public void setDonGia(double donGia) {
		if (donGia <= 0) {
			throw new IllegalArgumentException("Khong hop le");
		}
		this.donGia = donGia;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%-20s | %-20s | %-20s | %-20s | %-20s", maHD, dtf.format(ngayHD), tenKH, maPhong,
				df.format(donGia));
	}

	public double thanhTien() {
		return 0;
	}

}
