package core;

public class HW3task3_2 { //Проверить четное число или нечетное, вернуть boolean результат

	static boolean EvenNumner(int a)
		{
			return (a%2==0);
		} 

	public static void main(String[] args) {
		System.out.println ("It is " + EvenNumner(2458));
	}

}
