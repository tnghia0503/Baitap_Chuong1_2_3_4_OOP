package bai2chuong3;

public class SinhVien {
	private int maSV;
	private String hoVaTen;
	private double diemLT;
	private double diemTH;

	public SinhVien() {
		this.maSV = 0;
		this.hoVaTen = "no-name";
		this.diemLT = 0.0;
		this.diemTH = 0.0;

	}

	public SinhVien(int maSV, String hoVaTen, float diemLT, float diemTH) {
		setMaSV(maSV);
		setHoVaTen(hoVaTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}

	public int getMaSV() {
		return maSV;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public double getDiemLT() {
		return diemLT;
	}

	public double getDiemTH() {
		return diemTH;
	}

	public void setMaSV(int maSV) {

		this.maSV = maSV;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public void setDiemLT(double diemLT) {
		this.diemLT = diemLT;
	}

	public void setDiemTH(double diemTH) {
		this.diemTH = diemTH;
	}

	public double tinhDiemTB() {
		return (diemLT + diemTH) / 2;
	}

	@Override
	public String toString() {
		return String.format("%-5s %-30s %10.2f %10.2f %10.2f", maSV, hoVaTen, diemLT, diemTH, tinhDiemTB());

	}

}
