package bai4chuong3;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private String code;
	private String name;
	private double balance;
	private AccountStatus status;
	public static final double interestRate = 0.035;

	public Account() {
		this("999999", "Chua xac dinh", 50, AccountStatus.ACTIVE);

	}

	public Account(String code, String name, double balance, AccountStatus status) {
		setCode(code);
		setName(name);
		setBalance(balance);
		setStatus(status);
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setCode(String code) {
		if (code == null || code.isBlank()) {
			code = "999999";
		}
		this.code = code;
	}

	public void setName(String name) {
		if (name == null || name.isBlank()) {
			name = "Chua xac dinh";
		}
		this.name = name;
	}

	public void setBalance(double balance) {
		if (balance <= 50) {
			balance = 50;
		}
		this.balance = balance;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		return String.format("%20s | %20s | %20s | %20s", code, name, nf.format(balance), status);
	}

	public double deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			return amount;
		}
		return -1;
	}

	public double withdraw(double amount) {
		if (amount > 0 || amount <= balance) {
			balance = balance - amount;
			return amount;

		}
		return -1;
	}

	public double transfer(double amount, Account other) {
		return other.deposit(this.deposit(amount));

	}

	public double interestDue() {
		double interest = balance * interestRate;
		return interest;
	}
}
