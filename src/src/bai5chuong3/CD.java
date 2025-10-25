package bai5chuong3;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public class CD {
	private String code;
	private String title;
	private int numSongs;
	private double price;
	private LocalDate pulishedDate;
	private State state;

	public CD(String code, String title, int numSongs, double price, LocalDate pulishedDate, State state) {
		setCode(code);
		setTitle(title);
		setNumSongs(numSongs);
		setPrice(price);
		setPulishedDate(pulishedDate);
		setState(state);
	}

	public String getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public int getNumSongs() {
		return numSongs;
	}

	public double getPrice() {
		return price;
	}

	public LocalDate getPulishedDate() {
		return pulishedDate;
	}

	public State getState() {
		return state;
	}

	public void setCode(String code) {
		if (code == null || code.isEmpty()) {
			code = "000000";
		}
		this.code = code;
	}

	public void setTitle(String title) {
		if (title == null || title.isEmpty()) {
			title = "Undentified";
		}
		this.title = title;
	}

	public void setNumSongs(int numSongs) {
		if (numSongs <= 0) {
			throw new IllegalArgumentException("Number of song >0");
		}
		this.numSongs = numSongs;
	}

	public void setPrice(double price) {
		if (price <= 0.0) {
			throw new IllegalArgumentException("Price >0.0");
		}
		this.price = price;
	}

	public void setPulishedDate(LocalDate pulishedDate) {
		if (pulishedDate.isAfter(LocalDate.now())) {
			pulishedDate = LocalDate.now();
		}
		this.pulishedDate = pulishedDate;
	}

	public void setState(State state) {
		if (state == null || state instanceof State) {
			this.state = State.OLD;
		}
		this.state = state;
	}

	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		return String.format("%-6s | %-20s | %-5s | %-20s | %-15s | %-5s ", code, title, numSongs, nf.format(price),
				pulishedDate, state);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CD other = (CD) obj;
		return Objects.equals(code, other.code);
	}

}
