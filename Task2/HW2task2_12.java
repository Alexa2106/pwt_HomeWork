package core;

public class HW2task2_12 {
	public static void main(String[] args) {
		int ThisMas[] = { 1, 3, 4, 6, 5, 34, 3, 3, 5, 8, 3, 4, 6, 2, 5 };
		int ThisMas2[] = new int[ThisMas.length + 2];
		System.out.print("ThisMas(before)");
		for (int i = 0; i < ThisMas.length; i++) {
			System.out.print(ThisMas[i] + " ");
			ThisMas2[i + 2] = ThisMas[i];
			ThisMas[i] = ThisMas2[i];
		}
		System.out.println();
		System.out.print("ThisMas(after)");
		for (int i : ThisMas) {
			System.out.print(i + " ");
		}
	}
}


