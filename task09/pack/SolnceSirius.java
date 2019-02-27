package pack;

public class SolnceSirius extends Zvezda {
	int size;
	String habitans;
	
	public SolnceSirius(int size) {
		this.size = size;
	}
	public SolnceSirius(int size, String habitans) {
		this(size);
		this.habitans = habitans;
	}
	public SolnceSirius(int size, String habitans, String nameOfStars) {
		this(size, habitans);
		this.nameOfStars = nameOfStars;
	}


}
