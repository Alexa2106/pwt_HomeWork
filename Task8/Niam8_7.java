package pach;

public class Niam {

	public static void main(String[] args) {
		Tester tester = new Tester();
		tester.setName("Walter");
		tester.setSurname("White");
		tester.setExpirienceInYears(5);
		tester.setEnglishLevel("Advanced");
		tester.setSalary(650.5);
		tester.getExpirienceInMounth();
		System.out.println(tester.getPrintAllInfo() + " " + /*tester.getMultiSalary()*/  + tester.getExpirienceInMounth());
	    //вызов метода умноженной на 2 зп недоступен т.к. имеет модификатор доступа private(доступен только в классе)
		
		
		
		
		
		
		
		

	}

}
