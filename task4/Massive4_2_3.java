package core;

public class Massive {
	public int[] printMassiveAsLine = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public void setPrintMassiveAsLine(int[] printMassiveAsLine) {
		this.printMassiveAsLine = printMassiveAsLine;
	}

	public void getprintMassiveAsLine() {
		for (int i = 0; i < printMassiveAsLine.length; i++) {
			System.out.print(printMassiveAsLine[i] + " ");
		}
	}

	public void getprintReverseMassiveAsLine() {
		for (int i = printMassiveAsLine.length - 1; i >= 0; i--) {
			System.out.print(printMassiveAsLine[i] + " ");
		}

	}

	public void getSumOfElements() {
		int sum = 0;
		for (int num : printMassiveAsLine) {
			sum = sum + num;
		}
		System.out.println("Sum: " + sum);

	}

}