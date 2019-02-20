package core;

public class HW2task2_7 {
	public static void main(String[] args) {
		int[] ThisMas = { 3, 9, 56, 45, 2331 };
		for (int i = 0; i < ThisMas.length; i++) {
			int a = ThisMas[0];
			ThisMas[0] = ThisMas[4];
			ThisMas[4] = a;
			int b = ThisMas[1]; //не понимаю почему здесь не меняет,хотя все написано также
			ThisMas[1] = ThisMas[3];
			ThisMas[3] = b;
			System.out.print(ThisMas[i] + " ");
		}
	}
}