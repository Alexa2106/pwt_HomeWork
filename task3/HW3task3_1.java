package core;

public class HW3task3_1 { // - ����� ����������� ����� �� 2 �����, ������� �����������

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
