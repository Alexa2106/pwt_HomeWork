package pach;

class Tester {
	public String name;
	protected String surname;
	public int expirienceInYears;
	protected String englishLevel;
	public double salary;

	protected Tester(String name) {
		this.name = name;
	}

	Tester(int expirienceInYears, String name) {
		this.expirienceInYears = expirienceInYears;
		this.name = name;
	}

	public Tester(double salary, int expirienceInYears, String name) {
		this.salary = salary;
		this.expirienceInYears = expirienceInYears;
		this.name = name;
	}

	public static void main(String[] args) {
		Tester tester = new Tester(3.422, 19, "Anna");
		System.out.print(tester.salary + " ");
		System.out.print(tester.expirienceInYears + " ");
		System.out.print(tester.name);
		System.out.println();

	}

}


