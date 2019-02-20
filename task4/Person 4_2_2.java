package core;

public class Person {
	public String name;
	public String surname;
	public int age;
	public int phone;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getPhone() {
		return phone;
	}

	public void getAllInfo() {
		System.out.println("All information about this person: " + name + " " + surname + " " + age + " " + phone);
	}
	public void getPrintName() {
		System.out.println("Only name of this person: " + name + " " + surname);
	}
	
	public static void main(String[] args) {
		Person myPerson = new Person();
		myPerson.setName("Jack");
		myPerson.setSurname("Pearson");
		myPerson.setAge(32);
		myPerson.setPhone(1234567890);
		
		myPerson.getAllInfo();
		myPerson.getPrintName();
		
	}
}
