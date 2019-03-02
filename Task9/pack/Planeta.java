package pack;

public class Planeta extends ZvezdnayaSistema {
	int size;
	String habitans;
	
	public Planeta(int size) {
		this.size = size;
	}
	public Planeta(int size, String habitans) {
		this(size);
		this.habitans = habitans;
	}
	public Planeta(int size, String habitans, String nameOfStars) {
		this(size, habitans);
		this.nameOfStars = nameOfStars;
	}
}
