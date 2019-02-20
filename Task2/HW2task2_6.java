package core;

public class HW2task2_6 {
	public static void main(String[] args) {
		int[] ThisMas = { 3, 9, 56, 45, 2331 };
		for (int i = 0; i < ThisMas.length; i++) {
            int a = ThisMas[1];
			ThisMas[1] = ThisMas[0];
			ThisMas[0] = a;
			int b = ThisMas[2];
			ThisMas[2] = ThisMas[3];
			ThisMas[3] = b;
			System.out.println(ThisMas[i]);
		}

	}
}
