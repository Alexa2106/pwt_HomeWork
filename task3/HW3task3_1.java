package core;

public class HW3task3_1 { // - Найти минимальное число из 2 чисел, вернуть минимальное

	public static double MinNumber(double a, double b) {
		if (a > b) {
			return b;
		} else {
			return a;
		}
	}

	public static void main(String[] args) {
		System.out.println(MinNumber(0.143, 0.1765));

	}

}
