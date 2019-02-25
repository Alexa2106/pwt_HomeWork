package pack;

class HomeW {
	public static void main(String[] args) {
		System.out.println("Ввести n слов с консоли");
		HomeW task6 = new HomeW();
		String[] words = General.inputStrings();
		String word = task6.wordSymbolCodeAsk(words);
		System.out.println("Первое слово, символы в котором идут в строгом порядке возрастания их кодов: " + word);

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
		return "Нет таких слов";
	}

	public void showWordCodeSymbol(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i) + " code " + (int) word.charAt(i));
		}
	}

}
