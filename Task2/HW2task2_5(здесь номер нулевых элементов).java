package core;

public class HW2task2_4 {
	public static void main(String[] args) {
		int[] ThisMas = { 3, 9, 56, 45, 2331, };
		int Zero = 0;
		for (int i = 0; i < ThisMas.length; i++) {
			if (ThisMas[i] == 0) {
				Zero++;
				System.out.println(i);
			}
			if (ThisMas[i] != 0) {
				System.out.println("Нулевых значений нет");
			}
		}
	}
}