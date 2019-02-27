package pack;

public class Niam {

	public static void main(String[] args) {
		SolnceSirius solncesirius = new SolnceSirius(0);
		solncesirius.habitans();
		solncesirius.nameOfStars();
		solncesirius.size();
		System.out.println("-------------");
		ZemlyaMars zemlyaMars = new ZemlyaMars(0);
		zemlyaMars.setHabitans("Kosmonavti");
		zemlyaMars.getHabitans();
		zemlyaMars.setSize(453534545);
		zemlyaMars.getSize();
		System.out.println("---------------");
		Planeta planeta = new Planeta(0);
		planeta.nameOfStars();
		
	}

}
