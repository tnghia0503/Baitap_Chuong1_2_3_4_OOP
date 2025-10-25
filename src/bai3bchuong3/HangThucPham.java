package bai3bchuong3;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private final String maHang;
	private String tenHang;
	private double donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;

	public HangThucPham() {
		this.maHang = "MH0";
		this.tenHang = "TH0";
		this.donGia = 0.0;
		this.ngaySanXuat = LocalDate.now();
		this.ngayHetHan = LocalDate.now();

	}

	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		if (maHang == null || maHang.isBlank()) {
			throw new IllegalArgumentException("Khong hop le");
		}
		this.maHang = maHang;
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);

	}

	public String getMaHang() {
		return maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public double getDonGia() {
		return donGia;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setTenHang(String tenHang) {
		if (tenHang == null || tenHang.isBlank()) {
			throw new IllegalArgumentException("Khong hop le");
		}
		this.tenHang = tenHang;
	}

	public void setDonGia(double donGia) {
		if (donGia <= 0) {
			throw new IllegalArgumentException("Khong hop le");
		}
		this.donGia = donGia;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat == null) {
			throw new IllegalArgumentException("Khong hop le");
		}
		this.ngaySanXuat = ngaySanXuat;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan == null || ngayHetHan.isBefore(ngaySanXuat)) {
			throw new IllegalArgumentException("Khong hop le");
		}
		this.ngayHetHan = ngayHetHan;
	}

	public boolean kiemTraHH() {
		if (ngayHetHan.isBefore(LocalDate.now())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%-20s | %-20s | %-20s | %-20s | %-20s", maHang, tenHang, df.format(donGia),
				dtf.format(ngaySanXuat), dtf.format(ngayHetHan));
	}

}
