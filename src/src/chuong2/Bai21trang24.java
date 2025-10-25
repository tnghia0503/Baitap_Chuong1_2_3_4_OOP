package chuong2;

public class Bai21trang24 {
	public static String tachChuoi(String s) {
		String[] tu = s.split("\\s+");
		StringBuilder ketQua = new StringBuilder();
		for (String t : tu) {
			ketQua.append(t).append("\n");

		}
		return ketQua.toString();
	}

	public static void main(String[] args) {
		String S = "Bai Tap Mon Lap Trinh Java";
		System.out.println(tachChuoi(S));
	}
}