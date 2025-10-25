package bai5chuong3;

public class CDManager {
	private CD[] list;
	private int size = 0;

	public CDManager() {
		this(10);
	}

	public CDManager(int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity>0");
		}

	}

	public CD[] getList() {
		return list;
	}

	public int getSize() {
		return size;
	}

	public void setList(CD[] list) {
		this.list = list;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public CD add(CD cd) {
		if (cd == null) {
			return null;
		}
		for (int i = 0; i < size; i++) {
			if (list[i].getCode().equalsIgnoreCase(cd.getCode())) {
				return null;
			}
		}
		return cd;
	}

}
