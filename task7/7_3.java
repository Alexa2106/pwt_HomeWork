package pack;

import java.util.*;

class HomeW {
	public static void main(String[] args) {
		int n = 0;
		System.out.println("������� ���������� �����");
		Scanner scanner1 = new Scanner(System.in);
		n = scanner1.nextInt();
		String[] str = new String[n];
		Scanner scanner2 = new Scanner(System.in);
		for (int i = 0; i < str.length; i++) {
			System.out.println("������� ������ �" + (i + 1));
			str[i] = scanner2.nextLine();
		}
		int average = 0;
		for (String each : str) {
			average += (int) each.length();
		}
		average /= str.length;
		System.out.println("������� ����� ������ = (" + average + ")");

		for (int i = 0; i < n; i++) {
			if (str[i].length() < average) {

				System.out.println("������ ������� ��� ������� �����: " + str[i] + " ee ����� :    " + str[i].length());
			}
			if (str[i].length() > average) {
				System.out.println("������ ������� ��� ������� �����: " + str[i] + " ee ����� :    " + str[i].length());
			}
		}

	}
}
