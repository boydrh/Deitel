package chapter07;

public class InitArray {
	
	public static void main(String[] args){
		final int ARRAY_LENGTH = 10;
		int[] array = new int[ARRAY_LENGTH];
		
		int total = 0;
		
		for (int counter = 0; counter < array.length; counter++){
			array[counter] = 2 + 2*counter;
		}
		for (int number : array){
			total += number;
		}
		
		System.out.printf("%s%8s%n","Index", "Value");
		
		for (int counter = 0; counter < array.length; counter++){
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
		
		System.out.print(total);
	}

}
