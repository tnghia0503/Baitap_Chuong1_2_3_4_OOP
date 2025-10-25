package bai5chuong3;

import java.time.LocalDate;

public class TestCD {
	public static void main(String[] args) {
		CD cd1 = new CD("CD0010", "Title 5", 10, 100e3, LocalDate.of(2025, 6, 10), State.OLD);
		CD cd2 = new CD("CD0011", "Title 4", 11, 100e4, LocalDate.of(2025, 6, 11), State.OLD);
		CD cd3 = new CD("CD0012", "Title 3", 12, 100e5, LocalDate.of(2025, 6, 12), State.OLD);
		CD cd4 = new CD("CD0013", "Title 2", 13, 100e6, LocalDate.of(2025, 6, 13), State.OLD);
		CD cd5 = new CD("CD0014", "Title 1", 14, 100e7, LocalDate.of(2025, 6, 14), State.OLD);

		System.out.println(cd1);
		System.out.println(cd2);
		System.out.println(cd3);
		System.out.println(cd4);
		System.out.println(cd5);

	}

}
