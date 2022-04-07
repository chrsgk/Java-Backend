package hola;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Simple Conditions
		
		int edad = 21;
		
		if (edad>=18) {
			// if this is true then print ... if false then print ...
			
			System.out.println("Congrats you are old enough to rent a car");
		}
		
		// Double condition or if else
		
		if (edad>=18) {
			// if this is true then print ... if false then print ...
			
			System.out.println("Congrats you are old enough to rent a car");
		} else {
			System.out.println("Sorry you are not old enough to rent a car!");
		}
		
		// Multiple conditions  (two types)
		
		int nota = 8;
		
		if (nota > 9) {
			System.out.println("Congrats you have excellent results");
		} else if (nota < 9 && nota >= 7) {
			System.out.println("Congrats you have very good results" );
		} else if (nota < 7 && nota >= 5) {
			System.out.println("Congrats you passed");
		}else {
			System.out.println("Sorry you have failed this exam!");
		}

		/*boolean identity = true;
		int age = 18;
		
		if (identity == true && age = 18 ) {
			
		}*/
		
		int marks = 4;
		
		switch(marks){
		case 1:
		case 2:
		case 3:
		case 4: System.out.println(" You have failed this exam");
		break;
		case 5:
		case 6: System.out.println("You have passed the exam with an everage score");
		break;
		case 7:
		case 8: System.out.println("Congrats! you have a very good score ");
		break;
		case 9:
		case 10: System.out.println("Congrats on the execellent marks that you have ");
		
		}
	}

}
