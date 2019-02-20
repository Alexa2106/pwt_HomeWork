package core;

import java.util.Arrays;

public class HW2task2_10 {
	public static void main(String[] args) {
		int[] ThisMas = { 3, 65, 1645, 37564, 129325, 9784651 };
		System.out.println(Arrays.toString(ThisMas));
		boolean flag = true;
		for (int i = 1; i < ThisMas.length; i++) {
			if (ThisMas[i] <= ThisMas[i - 1]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Массив является  возрастающей последовательностью");
		} else {
			System.out.println("Массив не является возрастающей последовательностью");
		}
	}
}

