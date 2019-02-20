package core;

public class HW2task2_8 {
	public static void main(String[] args) {
		int[] ThisMas = { 3, 9, 1623355, 0, 2331, 46215, -3 };
        int max = ThisMas[0];
        int min = ThisMas[0];
        for(int i = 0; i<ThisMas.length; i++){
            if(ThisMas[i] > max){
                max = ThisMas[i];
            }
            if(ThisMas[i] < min){
                min = ThisMas[i];
            }
        }
        System.out.println("Максимальный элемент:"+ max + " "+"Минимальный элемент:" + min);
    } 

}
