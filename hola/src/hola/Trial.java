package hola;

import java.util.Arrays;

public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operacion1 = 6 + 4 /2;
		
		System.out.println("El resultado es: " + operacion1);
		
		int operacion2 = (6 + 4) /2;
		
		System.out.println("El resultado es: " + operacion2);
		
		
		int operacion3 = (33 + 3 * 4) /5;
		
		System.out.println("El resultado es: " + operacion3);
		
		int operacion4 = 2 + 2 *3;
		
		System.out.println("El resultado es: " + operacion4);
		
		int operacion5 = 3 + 2 *(18 - 4);
		
		System.out.println("El resultado es: " + operacion5);
		
		

		String estudiante1 = "Grace";
		String estudiante2 = "Fye";
		String estudiante3 = "Jessica";
		String estudiante4 = "Eva";
		String estudiante5 = "David";
		
		String listaestudiantes [] = new String[10];
		String lista[]= {"Grace", "Fye", "Jessica", "Eva","David"};
		
		System.out.println(Arrays.toString(lista));
		
		System.out.println(lista[3]);
		
		String tablero[][] = new String [4][4];
		tablero[3][3] = "Rey negro";
		tablero[2][1] = "Reina blanca";
		tablero[0][1] = "Peon";
		
		//operators 
		int numero = 4;
		int calculo = 2;
		int resultado = numero % calculo;
		System.out.println(resultado);
		
		//boolean
		
		boolean vamosOperar = (3 + 2 == 5);
		System.out.println(vamosOperar);
		
		boolean vamosOperar2 = (3 + 2 != 5);
		System.out.println(vamosOperar2);
		
		boolean vamosOperar3 = (3 + 2 >= 5);
		System.out.println(vamosOperar3);
		
		boolean vamosOperar4 = (3 + 2 <= 5);
		System.out.println(vamosOperar);
		
		boolean vamosOperar5 = (3 - 2 != 5);
		System.out.println(vamosOperar5);
			
		
}
}
