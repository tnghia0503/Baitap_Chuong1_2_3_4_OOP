package bai3chuong3;

public class Vehicle {
	private String tenChuXe;
	private String loai;
	private int dungTich;
	private double triGia;

	public Vehicle(String tenChuXe2, double triGia2, int dungTich2, String loai2) {

	}

	public Vehicle(String tenChuXe, String loai, int dungTich, double triGia) {
		setTenChuXe(tenChuXe);
		setLoai(loai);
		setDungTich(dungTich);
		setTriGia(triGia);
	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public String getLoai() {
		return loai;
	}

	public int getDungTich() {
		return dungTich;
	}

	public double getTriGia() {
		return triGia;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}

	public double tinhThue() {
		if (dungTich < 100) {
			return triGia * 0.01;
		} else if (dungTich <= 200) {
			return triGia * 0.03;
		} else {
			return triGia * 0.05;
		}

	}

	@Override
	public String toString() {
		return String.format("%-20s %-20s %-20s %-20.2f %-20.2f", tenChuXe, loai, dungTich, triGia, tinhThue());
	}

}
