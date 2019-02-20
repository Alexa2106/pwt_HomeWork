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
	public void getInfo() {
		System.out.println("All information about this person: " + name +" "+ surname +" " + age +" " +phone);
	}

	public static void main(String[] args) {
		Person myPerson = new Person();
		myPerson.setName("Jack");
		System.out.println("Name of person is " + myPerson.getName());

		myPerson.setSurname("Pearson");
		System.out.println("Surname of person is " + myPerson.getSurname());

		myPerson.setAge(32);
		System.out.println("Age of person is " + myPerson.getAge());

		myPerson.setPhone(1234567890);
		System.out.println("Phone of person is " + myPerson.getPhone());
		
		myPerson.getInfo();
		
		
		
		

	}

}
