package bai1chuong3;

public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;

	public HinhChuNhat() {
		this.chieuDai = 0;
		this.chieuRong = 0;
	}

	public HinhChuNhat(double chieuDai, double chieuRong) {
		setChieuDai(chieuDai);
		setChieuRong(chieuRong);
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuDai(double chieuDai) {
		if (chieuDai <= 0 || chieuDai <= chieuRong) {
			throw new IllegalArgumentException("loi");
		}
		this.chieuDai = chieuDai;
	}

	public void setChieuRong(double chieuRong) {
		if (chieuRong <= 0 || chieuRong >= chieuDai) {
			throw new IllegalArgumentException("loi");
		}
		this.chieuRong = chieuRong;
	}

	public double tinhDienTich() {
		return chieuDai * chieuRong;
	}

	public double tinhChuVi() {
		return (chieuDai + chieuRong) * 2;
	}

	@Override
	public String toString() {
		return String.format("%f %f %f %f", chieuDai, chieuRong, tinhDienTich(), tinhChuVi());
	}

}
