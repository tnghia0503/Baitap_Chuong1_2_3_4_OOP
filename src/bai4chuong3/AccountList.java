package bai4chuong3;

import java.util.Arrays;

public class AccountList {
	private Account[] list;
	private int count;

	public AccountList() {
		this(10);
	}

	public AccountList(int capacity) {
		if (capacity <= 0) {
			capacity = 10;

		}
		this.list = new Account[capacity];

	}

	public int getCount() {
		return count;
	}

	public Account[] getList() {
		return Arrays.copyOf(list, count);
	}

	public Account add(Account account) {
		if (account == null) {
			return null;
		}
		for (int i = 0; i < count; i++) {
			if (list[i].getCode().equalsIgnoreCase(account.getCode())) {
				return null;
			}
		}
		if (list.length == count) {
			list = Arrays.copyOf(list, (int) (count * 1.25));

		}
		list[count++] = account;
		return account;

	}

	private int index(String code) {
		for (int i = 0; i < count; i++) {
			if (list[i].getCode().equalsIgnoreCase(code)) {
				return i;
			}

		}
		return -1;
	}

	public Account find(String code) {
		int index = index(code);
		if (index >= 0) {

			return list[index];
		}
		return null;
	}

	public Account update(String code, String name, AccountStatus status) {
		int index = index(code);
		if (index >= 0) {
			list[index].setName(name);
			list[index].setStatus(status);
			return list[index];
		}
		return null;
	}

	public Account remove(String code) {
		int index = index(code);
		if (index >= 0) {
			Account tmp = list[index];
			for (int i = index; i < count; i++) {
				list[i] = list[i + 1];
			}
			list[--count] = null;
			return tmp;
		}
		return null;

	}

	public Account[] sort() {
		Account[] sorted = getList();
		for (int i = 0; i < sorted.length - 1; i++) {
			for (int j = 0; j < sorted.length - 1 - i; j++) {
				boolean byNameDesc = sorted[j].getName().compareTo(sorted[j + 1].getName()) < 0;
				boolean byBalanceAsc = sorted[j].getName().compareTo(sorted[j + 1].getName()) == 0
						&& Double.compare(sorted[j].getBalance(), sorted[j + 1].getBalance()) > 0;

				if (byNameDesc || byBalanceAsc) {
					Account tmp = sorted[j];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = tmp;
				}
			}
		}
		return sorted;
	}

}
