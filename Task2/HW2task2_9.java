package core;

public class HW2task2_9 {
	public static void main(String[] args) {
		int[] ThisMas = { 3, 9, 1623355, 0, 2331, 46215, -3 };
		int indexOfMax = 0;
		int indexOfMin = 0;
		for (int i = 1; i < ThisMas.length; i++) {
			if (ThisMas[i] > ThisMas[indexOfMax]) {
				indexOfMax = i;
			} else if (ThisMas[i] < ThisMas[indexOfMin]) {
				indexOfMin = i;
			}
		}
		System.out.println(
				"Индекс максимального элемента:" + indexOfMax + " " + "Индекс минимального элемента:" + indexOfMin);

	}

}
