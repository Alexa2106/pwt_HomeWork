package pack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class PullOfStrng {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<String>(); 
		ArrayList<Integer> len = new ArrayList<Integer>(); 
		int indexr = 0; 
		int lenmax = 0;
		String setalon = new String();
		Scanner sin = new Scanner(System.in);
		System.out.println("������� n �����, ��������� ����� �����, ��������� ������ �������.");
		do {
			System.out.print("������� ������ ��������: ");
			setalon = sin.nextLine();
			list.add(setalon);
			len.add(setalon.length());
		} while (setalon.length() > 0); 
		System.out.println();
		System.out.println("������ �� ��������: ");
		while (len.size() > 1) {
                                                     
			for (int i = 0; i < len.size(); i++) { 
				if (len.get(i) > lenmax) {
					lenmax = len.get(i);
					indexr = i; 
				}
			}
			System.out.println(list.get(indexr));
			list.remove(indexr);
			len.remove(indexr); 
			indexr = 0; 
			lenmax = len.get(0); 

		}

	}
}
