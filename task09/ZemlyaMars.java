package pack;

public class ZemlyaMars extends Planeta {
	public ZemlyaMars(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	int size;
	String habitans;
	
	
	void setSize(int size) {
		this.size = size;
	}

	public void getSize() {
		System.out.println(size);
	}

	void setHabitans(String habitans) {
		this.habitans = habitans;
	}

	public void getHabitans() {
		System.out.println(habitans);
	}

}
