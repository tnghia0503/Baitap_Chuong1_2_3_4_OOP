package bai4chuong3;

public class AccountTest {

	public static void main(String[] args) {
		AccountList list = new AccountList(5);
		Account[] accounts = generateSampleData();

		String headerLine = String.format("%20s | %20s | %20s | %20s", "Code", "Name", "Balance", "Status");
		System.out.println(headerLine + "\n" + "-".repeat(70));
		for (Account account : accounts) {
			System.out.println(list.add(account));
		}
		System.out.println("\n\n" + headerLine + "\n" + "-".repeat(70));
		for (Account account : list.sort()) {
			System.out.println(account);
		}
	}

	private static Account[] generateSampleData() {
		Account[] accounts = { new Account("000120", "Phạm Thanh Phong", 100e3, AccountStatus.ACTIVE),
				new Account("000124", "Diệp Tùng Lâm", 150e3, AccountStatus.CLOSED),
				new Account("000121", "La Phong", 70e3, AccountStatus.ACTIVE),
				new Account("000122", "Trịnh Hào Kiệt", 80e3, AccountStatus.INACTIVE),
				new Account("000121", "Hoàng Nhất Viết", 90e3, AccountStatus.ACTIVE),
				new Account("000129", "Ngô Sỹ Anh", 101e3, AccountStatus.INACTIVE),
				new Account("000127", "Nguyễn Văn Long", 120e3, AccountStatus.INACTIVE),
				new Account("000126", "Trương Chân Như", 110e3, AccountStatus.CLOSED),
				new Account("000130", "Diệp Tùng Lâm", 100e3, AccountStatus.CLOSED) };
		return accounts;
	}

}
