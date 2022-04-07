package hola;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner number = new Scanner(System.in);
		System.out.println("Give me a number");
		
		int num1 = number.nextInt();
		
		System.out.println("Give me another number");
		
		int num2 = number.nextInt();
		
		int result1 = num1 + num2;
		
		System.out.println("The sum is: " + result1);
		
	
		
		
	}

}
