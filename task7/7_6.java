package pack;

class HomeW {
	public static void main(String[] args) {
		System.out.println("������ n ���� � �������");
		HomeW task6 = new HomeW();
		String[] words = General.inputStrings();
		String word = task6.wordSymbolCodeAsk(words);
		System.out.println("������ �����, ������� � ������� ���� � ������� ������� ����������� �� �����: " + word);

	}

	public String wordSymbolCodeAsk(String... sourceWords) {
		Boolean isConditoinOk = true;

		for (String word : sourceWords) {
			for (int i = 0; i < word.length() - 1; ++i) {

				if (((int) word.charAt(i)) > ((int) word.charAt(i + 1))) {
					isConditoinOk = false;
				}
			}

			if (isConditoinOk) {
				return word;
			}
			isConditoinOk = true;
		}
		return "��� ����� ����";
	}

	public void showWordCodeSymbol(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i) + " code " + (int) word.charAt(i));
		}
	}

}
