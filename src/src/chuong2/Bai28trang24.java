package chuong2;

public class Bai28trang24 {
	public static void main(String[] args) {
		for (int h1 = 1; h1 <= 9; h1++) {
			for (int hh1 = 1; hh1 <= 9; hh1++) {
				if (hh1 == 1 || h1 == 9 || h1 == hh1)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------");
		for (int h2 = 1; h2 <= 9; h2++) {
			for (int hh2 = 1; hh2 <= 9; hh2++) {
				if (hh2 == 1 || h2 == 9 || h2 == 1 || hh2 == 9 || h2 == hh2 || h2 + hh2 == 9 + 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}
		System.out.println("--------------------------------------------------");
		int mid = (9 + 1) / 2;
		for (int h3 = 1; h3 <= 9; h3++) {

			for (int hh3 = 1; hh3 <= 9; hh3++) {
				if (h3 == hh3 || h3 + hh3 == 9 + 1 || h3 == mid)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();

		}
	}

}
