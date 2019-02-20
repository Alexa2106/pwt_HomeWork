package core;

public class HW2task2_2_1 {
	public static void main (String[] args){ 
	    int [][] mas = {{2, 5, 56, 176, 1, 8}, {3, 4, 7}}; 
	    
	    for (int i=0; i < mas.length; i++)
		{
			System.out.print (mas[i][i]+ " ");
		}
		for (int i=mas.length-1; i>=0; i--)
		{
			System.out.print (mas[i][i]+ " ");
		}

}
}
