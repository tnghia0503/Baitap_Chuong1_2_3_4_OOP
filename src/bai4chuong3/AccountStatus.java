package bai4chuong3;

public enum AccountStatus {
	ACTIVE("Dang hoat dong"), INACTIVE("Tam khoa"), CLOSED("Da dong");

	AccountStatus(String value) {
		// TODO Auto-generated constructor stub
		this.value = value;

	}

	public String toString() {
		return value;
	}

	public String value;

}
