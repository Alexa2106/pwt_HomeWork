package core;

public class HW2task2_3 {
	public static void main (String[] args) {
		int [] ThisMas = {3, 9, 74, 4, 2331, 8, 2, 4542, 9};
		int[] NewMas = new int [ThisMas.length];
		for(int i = 0; i < NewMas.length; i+=3) 
		{
		NewMas[i]= ThisMas[i]*3;	
		}
		{System.out.println (NewMas);}
	}
}