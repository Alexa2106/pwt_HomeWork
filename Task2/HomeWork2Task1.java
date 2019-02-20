package core;
import java.util.Scanner;
public class HomeWork2Task1 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in); 
	    System.out.println("Enter arr length");
	    int size = input.nextInt(); 
	    int array[] = new int[size]; 
	    System.out.println("insert array elements");
	    int i = 0; 
	    while (i < size) {
	        array[i] = input.nextInt();
	        i++;
	    }
	    System.out.print ("inserted array elements");
	    int b = 0;
	    while (b < size) {
	        System.out.print (" " + array[b]);
	        b++;
	    }
	    System.out.println();
	}
}
		
	


