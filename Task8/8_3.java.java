package pach;

class Tester {
	public String name;
	protected String surname;
	public int expirienceInYears;
	protected String englishLevel;
	public double salary;
	public double multiSalary;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	String getSurname() {
		return surname;
	}

	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	int getExpirienceInYears() {
		return expirienceInYears;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	double getSalary() {
		return salary;
	}

	private double getMultiSalary() {
		return salary * 2;
	}

	public static void main(String[] args) {
		Tester tester = new Tester();
		tester.setSalary(60.5);
		System.out.println(tester.getMultiSalary());

	}

}


