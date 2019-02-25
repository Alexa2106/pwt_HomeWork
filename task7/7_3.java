package pack;

import java.util.*;

class HomeW {
	public static void main(String[] args) {
		int n = 0;
		System.out.println("¬ведите количество строк");
		Scanner scanner1 = new Scanner(System.in);
		n = scanner1.nextInt();
		String[] str = new String[n];
		Scanner scanner2 = new Scanner(System.in);
		for (int i = 0; i < str.length; i++) {
			System.out.println("¬ведите строку є" + (i + 1));
			str[i] = scanner2.nextLine();
		}
		int average = 0;
		for (String each : str) {
			average += (int) each.length();
		}
		average /= str.length;
		System.out.println("—редн€€ длина строки = (" + average + ")");

		for (int i = 0; i < n; i++) {
			if (str[i].length() < average) {

				System.out.println("—трока меньша€ чем средн€€ длина: " + str[i] + " ee длина :    " + str[i].length());
			}
			if (str[i].length() > average) {
				System.out.println("—трока больша€ чем средн€€ длина: " + str[i] + " ee длина :    " + str[i].length());
			}
		}

	}
}
