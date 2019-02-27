package pack;

public class Niam {

	public static void main(String[] args) {
	
		
		ZvezdnayaSistema[] zvezdnayaSistema = new ZvezdnayaSistema[4];
		zvezdnayaSistema[0]= new Zvezda();
		zvezdnayaSistema[1]= new Planeta();
		zvezdnayaSistema[2]= new ZemlyaMars();
		zvezdnayaSistema[3]= new SolnceSirius();	
		
		for (int i = 0; i < 3; ++i) {
			zvezdnayaSistema[i].qualityOfStars();
		}
	}

}
