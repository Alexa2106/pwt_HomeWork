package pach;

class Tester {
	public Tester(String name) {
		this.name = name;
	}

	public Tester(int expirienceInYears, String name) {
		this.expirienceInYears = expirienceInYears;
		this.name = name;
	}

	public Tester(double salary, int expirienceInYears, String name) {
		this.salary = salary;
		this.expirienceInYears = expirienceInYears;
		this.name = name;
	}

	public String name;
	public String surname;
	public int expirienceInYears;
	public String englishLevel;
	public double salary;

	public static void main(String[] args) {
		Tester tester = new Tester(2.5, 5, "jack");
		System.out.print(tester.salary + " ");
		System.out.print(tester.expirienceInYears + " ");
		System.out.print(tester.name);
	}

}


