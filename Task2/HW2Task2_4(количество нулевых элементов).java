package core;

public class HW2Task2_5 {
	public static void main(String[] args) {
		int[] ThisMas = { 3, 9, 45, 2331, 562, 32, 0, 0};
		int numberOfZero = 0;
		for (int i = 0; i < ThisMas.length; i++) {
			if (ThisMas[i] == 0)
				numberOfZero++;
		}
		System.out.print("ThisMas имеет " + numberOfZero + " нулевых элментов");

	}
}
